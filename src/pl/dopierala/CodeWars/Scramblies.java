package pl.dopierala.CodeWars;

public class Scramblies {
    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
    }

    public static boolean scramble(String str1, String str2) {

        char[] chars = str2.toCharArray();
        for (char c : chars) {
            int sizeBefore=str1.length();
            str1=str1.replaceFirst(String.valueOf(c), "");
            if(sizeBefore==str1.length())
                return false;
        }
        return true;
    }
}
