import java.time.LocalDate;

public class PrintDetails {
    public static void main(String[] args) {
        String name = "Sidhant Bhure"; 
        String college = "WIT Solapur"
            
        LocalDate currentDate = LocalDate.now();

        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Current Date: " + currentDate);
    }
}

