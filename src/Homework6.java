import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Homework6 {

    public static void main(String[] args) throws IllegalArgumentException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        boolean correctData = false;

        while (!correctData) {
            correctData = true;
            System.out.println("> Type a language mnemonic [EN, ES, FIN, FR, IT, GER, NOR, PL, UA]: ");
            String choice = input.nextLine().toUpperCase();
            try {
                Lang.valueOf(choice);
                System.out.println(choice);

            } catch (IllegalArgumentException e) {
                System.out.println("> Try again: ");
                correctData = false;
            }
        }

        boolean usrNum = false;
        while(!usrNum) {
            usrNum = true;
            System.out.println("> How many numbers do you want to create?");
            int usrAmount = input.nextInt();
            try {
                Random rnd = new Random();
                int number;
                for (int i = 0; i < usrAmount; i++) {
                    number = rnd.nextInt(1000);
                    System.out.println("> #" + (i + 1) + ": " + "\t" + number);
                } }
            catch (InputMismatchException e) {
                System.out.println("> Type correct number: ");
                usrNum = false;
            }

        }
    }

    enum Lang {EN, ES, FIN, FR, IT, GER, NOR, PL, UA};
}
