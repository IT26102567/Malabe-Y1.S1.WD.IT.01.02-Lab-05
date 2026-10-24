import java.util.Scanner;

public class IT26102567Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare constant for room charge per day
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();
        
        // Validation 1: Check if dates are between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            System.exit(0);
        }
        
        // Validation 2: Check if start date is less than end date
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            System.exit(0);
        }
        
        // Calculate number of days reserved and total amount[cite: 3]
        int numberOfDays = endDate - startDate;
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        
        // Determine discount rate based on number of days[cite: 3]
        double discountRate = 0.0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = 0.10; // 10% discount for 3-4 days[cite: 3]
        } else if (numberOfDays >= 5) {
            discountRate = 0.20; // 20% discount for 5 or more days[cite: 3]
        }
        
        // Apply discount
        totalAmount -= (totalAmount * discountRate);
        
        // Display results[cite: 3]
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
        
        scanner.close();
    }
}
	
