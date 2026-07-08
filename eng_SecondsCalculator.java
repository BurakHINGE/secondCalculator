import java.util.Scanner;

public class eng_SecondsCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 1;

        while (choice == 1) {

            int enteredSeconds = -1;

            while (true) {
                System.out.print("Enter the number of seconds: ");

                if (input.hasNextInt()) {
                    enteredSeconds = input.nextInt();

                    if (enteredSeconds >= 0) {
                        break;
                    }
                    else {
                        System.out.println("Please enter a value greater than or equal to 0.");
                        enteredSeconds = input.nextInt();
                    }
                }
                else {
                    System.out.println("Please enter an integer value only.");
                    input.next();
                }
            }

            System.out.print(enteredSeconds + " second(s) is equal to ");

            if (enteredSeconds == 0) {
                System.out.print("0 seconds.");
                System.out.println();
            }

            int hours = enteredSeconds / 3600;
            int remainingSecondsAfterHours = enteredSeconds % 3600;
            int minutes = remainingSecondsAfterHours / 60;
            int remainingSecondsAfterMinutes = remainingSecondsAfterHours % 60;
            int remainingSeconds = remainingSecondsAfterMinutes;

            if (hours > 0) {
                System.out.print(hours + " hour(s) ");
            }
            if (minutes > 0) {
                System.out.print(minutes + " minute(s) ");
            }
            if (remainingSeconds > 0) {
                System.out.print(remainingSeconds + " second(s) ");
            }

            System.out.println(".");
            
            while (true) {
                System.out.print("1-Calculate Again\n2-Exit\nYour choice: ");

                if (input.hasNextInt()) {
                    choice = input.nextInt();

                    if (choice == 1 || choice == 2) {
                        break;
                    } else {
                        System.out.println("Error: Please enter either 1 or 2 only.\n");
                    }
                } else {
                    System.out.println("Error: Please enter a numeric value only.\n");
                    input.next();
                }
            }

            if (choice == 2) {
                System.out.println("Exiting the program...");
                System.exit(0);
            }
        }
    }
}