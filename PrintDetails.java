import java.time.LocalDate;

public class PrintDetails {
    public static void main(String[] args) {
        // Your details
        String name = "Sidhant Bhure"; 
        String college = "WIT Solapur";

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Print details
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Current Date: " + currentDate);
    }
}
