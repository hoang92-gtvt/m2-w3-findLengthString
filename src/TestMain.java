import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestMain {
    public static void main(String[] args) {

        String string1 = "abcabcdfbcdefghijcefghij";
        System.out.println(abc(string1));
    }

    public static String abc(String str){
        Set <Character> a = new HashSet<>();
        String last = "";
        String current = "";

        for(int i = 0; i < str.length(); i ++){
            char c = str.charAt(i);
            if(a.contains(c)){
                a.clear();
                current = "";
            }
                a.add(c);
                current += c;

            if(last.length() < current.length())
                last = current;
        }
        return last;

    }
}
