import java.util.Scanner;

//6
//Given an array of integers, determine the sum of odd numbers and the amount of even numbers
public class sum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere a size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= size - 1; i++) {
            if ((array[i] % 2)==0){
                count++;
            }
            if ((array[i] % 2)!=0){
                sum = sum + array[i];
            }

        }

        System.out.println("The sum of odd numbers is: " + sum);
        System.out.println( "The amount of even numbers is: " + count);
    }
}