
public class App {
    public static void main(String[] args) throws Exception {

        String inputEncode = "AAAAAVVSSA";
        String inputDecode = "5A2V2S1A";

        System.out.println(encode(inputEncode));
        System.out.println(decode(inputDecode));
    }

    public static String encode(String input) {
        char currLetter = input.charAt(0);
        int count = 0;
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (currLetter == input.charAt(i)) {
                count++;
            } else {
                output = output + count + currLetter;
                count = 1;
                currLetter = input.charAt(i);
            }
        }

        output = output + count + currLetter;

        return output;
    }

    public static String decode(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i += 2) {
            int num = Integer.parseInt(input.charAt(i)+"");
            for (int n = 0; n < num; n++) {
                output += input.charAt(i+1)+"";
            }
        }

        return output;
    }
}
