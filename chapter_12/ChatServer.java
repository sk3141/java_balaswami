package chapter_12;
import java.util.*;
import java.net.*;
import java.io.*;

public class ChatServer {
  private static Set<ClientHandler> ClientHandlerSet = new HashSet<>();
  private static final int port = 12345;

  public static void main(String args[]) {
    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("Server is listening on Port " + port);

      while (true) {
        Socket clientSocket = serverSocket.accept();
        ClientHandler client = new ClientHandler(clientSocket);

        ClientHandlerSet.add(client);
        new Thread(client).start();
      }
    }
    catch (IOException e) {
      System.out.println("Serevr Error : " + e.getMessage());
    }
  }

  public static void getUsername(ClientHandler client) throws IOException{
    client.out.println("Enter a username :");
    client.username = client.in_bf.readLine();
  }

  public static synchronized void broadcast(String message, ClientHandler client) {
    for (ClientHandler tempClient : ClientHandlerSet) {
      if (tempClient != client) {
        tempClient.out.println("[ " + tempClient.username + "] " + message);
      }
    }
  }

  public static synchronized void broadcastUsername(String message, ClientHandler client) {
    for (ClientHandler tempClient : ClientHandlerSet) {
      if (tempClient != client) {
        tempClient.out.println(client.username + " " + message);
      }
    }
  }

  private static class ClientHandler implements Runnable{
    private Socket socket;
    private InputStreamReader in;
    private PrintWriter out;
    private BufferedReader in_bf;
    private String username;
    public ClientHandler(Socket socket) {
      this.socket = socket;
    }

    public void run() {
      try {
        in = new InputStreamReader(socket.getInputStream());
        in_bf = new BufferedReader(in);
        out = new PrintWriter(socket.getOutputStream(), true);

        getUsername(this);
        System.out.println("[ " + this.username + " ] Connected");
        // Broadcast that the user has joined
        broadcastUsername(" has joined the chat", this);

        String message;
        while ((message = in_bf.readLine()) != null) {
          System.out.println("Recived : " + message);
          ChatServer.broadcast(message, this);
        }
      }
      catch (IOException e) {
        System.out.println("Error : " + e.getMessage());
      }
      finally {
        try {
          socket.close();
        }
        catch (IOException e) {
          System.out.println("Could not close Socket");
        }
        ClientHandlerSet.remove(this);
      }
    }
  }
}