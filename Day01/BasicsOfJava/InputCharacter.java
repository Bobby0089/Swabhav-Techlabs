package BasicsOfJava;
import java.util.Scanner;

public class InputCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0); // string ka input leke first character nikal liya hai
        System.out.println("Character is : " + ch);
    }
}
