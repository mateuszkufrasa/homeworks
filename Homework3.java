import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayOfNumbers {

    private int[] arrayInt;
    private Random generator = new Random();
    private String PrintArray;
    private int maxValue, minValue;

    //generates new array containing numbers ranging from 0 to 1000
    public int[] ArrayConstructor(int el) {
        arrayInt = new int[el+1];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = generator.nextInt(1000);
        }
        return arrayInt;
    }

    //sorts array in descending order
    public int[] SortDescending() {
        for (int i = 1; i < arrayInt.length; i++)
            for (int j = arrayInt.length - 1; j >= i; j--) {
                if (arrayInt[j] > arrayInt[j - 1]) {
                    int k = arrayInt[j];
                    arrayInt[j] = arrayInt[j - 1];
                    arrayInt[j - 1] = k;
                }
            }
        return arrayInt;
    }

    //returns maximum value in array
    public int max(int[] numbers) {
        maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    //returns minimum value in array
    public int min(int[] numbers) {
        minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}

public class Homework3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int elements, maxVal, minVal, t, x, y;
        int [] ciphers, sortedCiphers;

        //initializes generator of random values
        Random generator = new Random();

        //initializes new object of ArrayOfNumbers type
        ArrayOfNumbers ExampleArray = new ArrayOfNumbers();

        //Exercise 1: creates array of integers
        System.out.println("\nExercise 1:\n---\nType number of elements in array: ");
        elements = in.nextInt();
        System.out.println("An array of random values between 0 and 1000 is generated.");
        ciphers = ExampleArray.ArrayConstructor(elements);
        System.out.println("Your array is: " + Arrays.toString(ciphers) + ".");
        sortedCiphers = ExampleArray.SortDescending();
        System.out.println("Your array sorted descending is: " + Arrays.toString(sortedCiphers) + ".");
        maxVal = ExampleArray.max(ciphers);
        minVal = ExampleArray.min(ciphers);

        //Exercise 2: returns min. and max. values
        System.out.println("\nExercise 2:\n---\nDisplays minimum and maximum values in the specified array.");
        System.out.println("Minimum value: " + minVal);
        System.out.println("Maximum value: " + maxVal);

        //Exercise 3: swaps two variables
        System.out.println("\nExercise 3:\n---\nSwaps two values. Type x value:");
        x = in.nextInt();
        System.out.println("x = " + x);
        System.out.println("Type y value:");
        y = in.nextInt();
        System.out.println("y = " + y);
        t = x;
        x = y;
        y = t;
        System.out.println("\nAfter swap:\nx = " + x);
        System.out.println("y = " + y);
    }
}
