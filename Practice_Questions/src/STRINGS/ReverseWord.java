package STRINGS;


public class ReverseWord {

    public static String reverseWords(String s) {
        int n = s.length();
        String token = "";
        String result = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch != ' ') token += ch;
            else {
                if(result.isEmpty()){
                    result = token;
                    token = "";
                }else{
                    result = token + " " + result;
                    token = "";
                }
            }
        }
        if(!token.equals(" ")) result = token +" "+ result;
        return result;
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
