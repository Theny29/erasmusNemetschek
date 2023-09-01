public class App {
    public static void main(String[] args) throws Exception {

    System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(input.length() - i - 1) != input.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}