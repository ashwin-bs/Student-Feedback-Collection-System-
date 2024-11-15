import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BaseFeedback {
    private String studentName, year, rollNumber, department, message;

    public BaseFeedback(String studentName, String year, String rollNumber, String department, String message) {
        this.studentName = studentName;
        this.year = year;
        this.rollNumber = rollNumber;
        this.department = department;
        this.message = message;
    }

    public String getStudentName() { return studentName; }
    public String getYear() { return year; }
    public String getRollNumber() { return rollNumber; }
    public String getDepartment() { return department; }
    public String getMessage() { return message; }
    public String getFeedbackDetails() {
        return "Student Name: " + getStudentName() + "\nYear: " + getYear() +
               "\nRoll Number: " + getRollNumber() + "\nDepartment: " + getDepartment() +
               "\nFeedback: " + getMessage() + "\n";
    }
}
class Feedback extends BaseFeedback {
    public Feedback(String studentName, String year, String ro3
    llNumber, String department, String message) {
        super(studentName, year, rollNumber, department, message);
    }

    public String toString() {
        return getFeedbackDetails();
    }
}

public class FeedbackSystem {
    private List<Feedback> feedbackList = new ArrayList<>();

    public void addFeedback(String studentName, String year, String rollNumber, String department, String message) {
        feedbackList.add(new Feedback(studentName, year, rollNumber, department, message));
        System.out.println("Feedback submitted successfully!");
    }

    public void displayFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }
        System.out.println("Feedback received:");
        feedbackList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        FeedbackSystem system = new FeedbackSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Submit Feedback\n2. View Feedback\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();
                System.out.print("Enter year of study: ");
                String year = scanner.nextLine();
                System.out.print("Enter roll number: ");
                String rollNumber = scanner.nextLine();
                System.out.print("Enter department: ");
                String department = scanner.nextLine();
                System.out.print("Enter your feedback message: ");
                String message = scanner.nextLine();
                system.addFeedback(studentName, year, rollNumber, dhepartment, message);
            } else if (choice == 2) {
                system.displayFeedback();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }
}
