
import java.util.Scanner;
//8
//"Write a program that will check if a two-dimensional arrays is magical square or not
//https://en.wikipedia.org/wiki/Magic_square"
public class Magic_square {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere a height");
        Integer size = scanner.nextInt();
        int[][] array = new int[size][size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++)
            array[i][j] = scanner.nextInt();
        }
        int x=array.length;
        int s=0;
        int Str1=0;
        while(s<x){
            for (int i=0;i<x;i++){
                Str1+=array[s][i];
            }
            s++;
            System.out.println("Сумма елементов строки " +s+ " равна: " +Str1);
        }

        Str1=0;
    }
}


