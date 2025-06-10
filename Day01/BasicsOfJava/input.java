package BasicsOfJava;
import java.util.Scanner;// we have to import java.util package for using scanner because it is present in util package.

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = sc.next();// for one word
//        System.out.println("Short Name is : " + name);

        System.out.print("Enter your FullName : ");
        String fullName =sc.nextLine(); //for one line or sentence.
        System.out.println("Your name is : " + fullName);

        System.out.print("Enter Age : ");
        int Age = sc.nextInt();  //for taking integer as input
        System.out.println("Your Age is : "+Age);
    }
}
