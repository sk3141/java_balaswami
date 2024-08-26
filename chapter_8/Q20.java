package chapter_8;
import java.util.ArrayList;
import java.util.List;

class Staff {
    protected String code;
    protected String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }

    public String getCode() { 
      return code; 
    }
    public void setCode(String code) {
       this.code = code;
      }
    public String getName() { 
      return name; 
    }
    public void setName(String name) { 
      this.name = name; 
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher(String code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getPublication() { return publication; }
    public void setPublication(String publication) { this.publication = publication; }
}

class Typist extends Staff {
    protected int speed;

    public Typist(String code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Speed: " + speed);
    }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
}

class Officer extends Staff {
    private String grade;

    public Officer(String code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}

class Regular extends Typist {
    public Regular(String code, String name, int speed) {
        super(code, name, speed);
    }
}

class Casual extends Typist {
    private double dailyWages;

    public Casual(String code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
    }

    public double getDailyWages() { return dailyWages; }
    public void setDailyWages(double dailyWages) { this.dailyWages = dailyWages; }
}

class Database {
    private List<Staff> employees;

    public Database() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Staff employee) {
        employees.add(employee);
    }

    public Staff findEmployee(String code) {
        for (Staff employee : employees) {
            if (employee.getCode().equals(code)) {
                return employee;
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        for (Staff employee : employees) {
            employee.display();
            System.out.println("--------------------");
        }
    }
}

public class Q20 {
    public static void main(String[] args) {
        Database db = new Database();

        db.addEmployee(new Teacher("T001", "John Doe", "Mathematics", "Advanced Algebra"));
        db.addEmployee(new Officer("O001", "Jane Smith", "Grade A"));
        db.addEmployee(new Regular("R001", "Bob Johnson", 60));
        db.addEmployee(new Casual("C001", "Alice Brown", 55, 100.50));

        System.out.println("All Employees:");
        db.displayAllEmployees();

        System.out.println("Finding employee with code T001:");
        Staff foundEmployee = db.findEmployee("T001");
        if (foundEmployee != null) {
            foundEmployee.display();
        } else {
            System.out.println("Employee not found.");
        }
    }
}