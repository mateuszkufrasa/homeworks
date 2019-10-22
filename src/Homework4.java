import java.util.*;

class RandomIntArray {

    private int[] IntArray;
    private Random generator = new Random();

    public int[] NewArray(int lgth) {
        IntArray = new int[lgth];
        for (int i = 0; i < IntArray.length; i++) {
            IntArray[i] = generator.nextInt(10);
        }
        return IntArray;
    }
}
public class Homework4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        int[] array2;
        RandomIntArray rdmArr = new RandomIntArray();

        // Creates array of integers with fixed length and fills it in one step
        int[] array1 = new int[]{2, 5, 3, 6, 9, 3, 18, 24, 3, 6};
        System.out.println("Your array is: " + Arrays.toString(array1));

        //Creates array of integers with random numbers (including duplicates)
        System.out.println("Type length of new array: ");
        length = input.nextInt();
        array2 = rdmArr.NewArray(length);
        System.out.println("Newly generated array is: " + Arrays.toString(array2));

        //Finds duplicates
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer n : array2) {
            Integer count = map1.get(n);
            if (count == null) {
                map1.put(n, 1);
            } else {
                map1.put(n, ++count);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map1.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicates in array : " + entry.getKey());
            }

        }
    }
}
