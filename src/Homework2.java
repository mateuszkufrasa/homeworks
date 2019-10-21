import java.util.*;

public class Homework2 {
    static Scanner scanner = new Scanner(System.in);
    static Scanner response= new Scanner(System.in);;

    public static void main(String[] args) {

        Customer Client1 = new Customer();
        System.out.print("Type your age: ");
        int inputAge = scanner.nextInt();
        if (inputAge >= 0) {
            Client1.age = inputAge;

        } else {
            System.out.print("Type correct age: ");
            inputAge = scanner.nextInt();
        }
        Client1.calculateDiscount(inputAge);
        System.out.print("Are you regular customer? (Y/N): ");
        String usrResponse = response.nextLine();
        String rsp = usrResponse.toString().toUpperCase();

        if (rsp.equals("Y")) Client1.discount += 5;
        System.out.println("Your final discount is " + Client1.discount + ".");
    }

}

class Customer {
    int age, discount;

    int calculateDiscount(int a) {
        if (a > 65) {
            discount = 10;
        } else if (age < 18) {
            discount = 25;
        } else {
            discount = 0;
        }
        if (discount != 0) {
            System.out.println("You receive " + discount + "% of discount");
        }
        else {
            System.out.println("You have no discount");
        }
        return discount;
    }

}



