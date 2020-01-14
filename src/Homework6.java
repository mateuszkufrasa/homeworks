import java.io.IOException;
import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) throws IllegalArgumentException {
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
    System.out.println("Try again: ");
        correctData = false;
    }
    break;
	}
    }

    enum Lang {EN, ES, FIN, FR, IT, GER, NOR, PL, UA};
}
