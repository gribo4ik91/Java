import java.util.Scanner;
//2
//"Given a string of characters, determine if it is a palindrome or not
//https://en.wikipedia.org/wiki/Palindrome"
// "ABABA - palindrome
//BABA - not palindrome"
public class Palindrome {
    public static void main(String args[]) {
        System.out.println("Entere a word");
        Scanner scanner = new Scanner(System.in);
        String polindrome = scanner.nextLine();

        int length = polindrome.length();
            if ((length % 2) == 0){
                System.out.println("Not palindrom ");
                return;
            }
            String[] strToArray = polindrome.split("");
                for (int begin = 0, end = strToArray.length - 1; begin <= end; begin++, end--){
                    if (!strToArray[begin].equalsIgnoreCase(strToArray[end])){
                        System.out.println("Not palindrom ");
                        return;
                    }
                }
        System.out.println("Palindrom");
    }
}



