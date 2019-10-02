import java.util.Scanner;
//4
//Given an array of floating point numbers, inverse the elements of the array

public class Invers {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere a array");
        String invers = scanner.nextLine();

        String[] strToArray = invers.split("");
            int k = 0;
            for (int i = 0; i< strToArray.length/2; i++) {

                String buf = strToArray[i];
                strToArray[i] = strToArray[(strToArray.length-1 - i)];
                strToArray[strToArray.length-1 - i] = buf;
            }

            for (int i = 0; i < strToArray.length; i++) {
                 System.out.print(strToArray[i] + " ");
            }
        }
}
