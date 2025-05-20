import java.util.Calendar;
import java.util.Scanner;

public class Abdo_Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the year and month
        System.out.print("Enter full year (e.g., 2024): ");
        int year = input.nextInt();
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Call the method to print the calendar
        printCalendar(year, month);
    }

    // Method to print the calendar for the given year and month
    public static void printCalendar(int year, int month) {
        // Create a Calendar instance and set it to the first day of the given month and year
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // Note: Month is 0-based in Calendar (0 = January, 1 = February, etc.)

        // Get the number of days in the month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Get the day of the week for the first day of the month (1 = Sunday, 2 = Monday, ..., 7 = Saturday)
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Print the header of the calendar
        System.out.println("        " + getMonthName(month) + " " + year); // Month and year
        System.out.println("---------------------------"); // Divider line
        System.out.println("Sun Mon Tue Wed Thu Fri Sat"); // Days of the week

        // Print spaces for the days before the first day of the month
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    "); // 4 spaces for each day
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day); // Print the day with 3 digits width

            // Move to the next line after Saturday (end of the week)
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println(); // New line
            }
        }

        // Print a newline at the end if the last week is incomplete
        if ((daysInMonth + firstDayOfWeek - 1) % 7 != 0) {
            System.out.println(); // New line
        }
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1]; // Return the month name based on the month number
    }
}