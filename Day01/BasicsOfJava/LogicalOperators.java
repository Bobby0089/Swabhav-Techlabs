package BasicsOfJava;

public class LogicalOperators {
    public static void main(String[] args) {
        int p = 10, q = 15, r = 5;

        //&& operator
        System.out.println((p < q) && (p > r));
        System.out.println((p > q) && (p > r));

        // || operator
        System.out.println((r < q) || (p > q));
        System.out.println((p < q) || (q > r));
        System.out.println((p > q) || (q < r));

        // ! operator
        System.out.println(!(p == q));

    }
}
