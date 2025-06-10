package STRINGS;

public class Substring {
    public static void main(String[] args) {
        String s1 = "geeksfffffoorrfoorforgeeks";
        String s2 = "for";
        if(substring(s1, s2) > 0) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
}
    private static int substring(String s1, String s2) {
        // Here s2 means substring
        int counter = 0; //pointing s2
        int i = 0;
        for(;i<s1.length();i++){
            if(counter==s2.length())
                break;
            if(s2.charAt(counter)==s1.charAt(i)){
                counter++;
            }else{
                //Special case where character preceding the i'th character is duplicate
                if(counter>0){
                    i -= counter;
                }
                counter = 0;
            }
        }
        if (counter < s2.length()) return -1;
        return i - counter;
    }
}
