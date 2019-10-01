import java.util.Scanner;

//3
//Drawing a staircase structure - given the required height, output a staircase as shown in the example	1	"Given n = 6, the output should be:
//     #
//    ##
//   ###
//  ####
// #####
//######"
public class Staircase {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere a height");
        int staircase = scanner.nextInt();
        int[][] array = new int[staircase][staircase];


        int b = 0;
        for (int i = 0; i < array.length; i++) {
            b++;
            int x = 0;
            for (int j = 0; j < array[i].length; j++) {
                x++;
                if (b < x) {
                    break;
                }

                System.out.print("#" + " ");

            }
            System.out.println();
        }

    }
}