import java.util.Scanner;

public class SafeInput
{
    /**
     * Returns a String input by the user that must be at least one character
     * @param pipe the scanner to use for the input
     * @param prompt the msg for the user telling them what to input
     * @return a String of at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();

            if (response.length() > 0) {
                done = true;
            }
            else {
                System.out.println("\nYou must enter at least one character!");
            }

        }while (!done);

        return response;
    }
    /**
     * gets an int val from the user with no constraints
     * @param pipe Scanner to use for the input
     * @param prompt msg to user for what to enter
     * @return
     */
    public static int getInt(Scanner pipe, String prompt) {
        boolean done = false;
        String trash = "";
        int value = 0;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while (!done);

        return value;
    }
    /**
     * returns an unconstrained double value
     * @param pipe scanner to use for input
     * @param prompt msg to tell user what to input
     * @return an uunconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        boolean done = false;
        String trash = "";
        double value = 0;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while (!done);

        return value;
    }
    /**
     * gets an int val from the user with a range
     * @param pipe Scanner to use for the input
     * @param prompt msg to user for what to enter
     * @param low the bottom value for the inclusive range
     * @param high the top value for the inclusive range
     * @return a value within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        boolean done = false;
        String trash = "";
        int value = 0;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                if (value >= low && value <= high) {
                    done = true;
                }
                else {
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]");
                }
            }
            else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }
        }while (!done);

        return value;
    }

}