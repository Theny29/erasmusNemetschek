
public class App {
    public static void main(String[] args) throws Exception {

        String input = "AAAAAAAAA";
        String output = "";

        char currLetter = input.charAt(0);
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            if(currLetter == input.charAt(i)) {
                count++;
            }
            else {
                output = output + count + currLetter;
                count = 1;
                currLetter = input.charAt(i);
            }
        }

        output = output + count + currLetter;

        System.out.println(output);
    }
}
