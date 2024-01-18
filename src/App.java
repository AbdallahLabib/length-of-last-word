public class App {
    public static void main(String[] args) throws Exception {
        lengthOfLastWord("Hello world");
        System.out.println(lengthOfLastWord("Hello world"));
    }

    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        while (s.charAt(i) == ' ') {
            i--;
        }

        // To get away from edge cases like "a" or "a ", simply put
        // index checking at the beginning & make it (>= 0) not (> 0).
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
