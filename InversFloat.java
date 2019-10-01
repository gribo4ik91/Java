import java.util.Scanner;

//4 v2

//Given an array of floating point numbers, inverse the elements of the array
public class InversFloat {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere a height");

        int size = scanner.nextInt();

        Float[] array = new Float[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextFloat();
        }
        for (int i = 0; i < size / 2; i++) {

            Float buf = array[i];
            array[i] = array[(size - 1 - i)];
            array[size - 1 - i] = buf;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
