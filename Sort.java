import java.util.Arrays;
import java.util.Scanner;
//5
//Given an array of integers, implement the BubbleSort algorithm for sorting the elements of the array
public class Sort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere a size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
           boolean is_sorted = true;
                for (int j = 0; j < size -i; j++) {

                    if (array[j] > array[j +1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                       is_sorted = false;
                    }
            }

            if(is_sorted) break;
        }
        Arrays.toString(array);
        System.out.println(Arrays.toString(array));
    }
}

