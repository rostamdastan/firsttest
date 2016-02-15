import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);
        double num = 0.0;
        int numCount = 0;
        double numTotal = 0.0;

        System.out.println("This program will read a sequence of numbers from the keyboard until");
        System.out.println("you enter an asterisk (*).  Then it will display how many numbers you");
        System.out.println("entered, their total, and their average.\n\n");

        while (keepGoing) {
            System.out.print("Please enter a number or an asterisk to quit: ");

            if (input.hasNextDouble()) {
                num = input.nextDouble();
                numCount++;
                numTotal += num;
            }
            else if (input.next().equals("*")) {
                keepGoing = false;
                System.out.println("\nYou entered " + numCount + " numbers.");
                System.out.println("Their total is " + numTotal);
                System.out.println("Their average is " + (numTotal / numCount));
            }
            else {
                System.out.println("\n*** ERROR *** Your entry was not numeric and was not an asterisk (*)");
            }
        }
    }
}
