package BasicsOfJava;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b;

        // = operator
        b = a;
        System.out.println(b);

        // += operator
        a += b;  // a = a + b
        System.out.println(a);

        // -= operator
        a -= b;  // a = a - b
        System.out.println(a);

        // *= operator
        a *= b;  // a = a * b
        System.out.println(a);

        // /operator
        a /= b;  // a = a / b
        System.out.println(a);
    }
}
