package STRINGS;

public class Toggle {
    public static void main(String[] args) {
        String s = "PhysICS";
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = s.charAt(i);
            if(ch==' ') continue;
            int asci = (int)ch;
            if (asci >= 65 && asci <= 90){
                asci += 32;
                char ah = (char)asci;
                sb.setCharAt(i,ah);
            }
            else if (asci >= 97 && asci <= 122){
                asci -= 32;
                char dh = (char)asci;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);
    }
}
