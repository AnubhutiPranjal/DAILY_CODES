// //WAP to input a character from user and check whether it is an alphabets, digits, or special symbols.*string*

// public class Question24 {

//     public static void main(String[] args) {
//         char ch;
//         for (ch = 'A'; ch <= 'Z'; ++ch) {
//             System.out.print(ch + " ");
//         }
//     }
// }
// public class Question24 {

//     public static void main(String[] args) {
//         char ch;
//         for (ch = 'a'; ch <= 'z'; ++ch) {
//             System.out.print(ch + " ");
//         }
//     }
// }
import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Checking the type of character
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an Alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Symbol.");
        }

        sc.close();
    }
}
