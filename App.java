public class App {
    public static void main(String[] args) throws Exception {

        int[] nums = {4,1,2,1,2};

        int xor = 0;

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        
        System.out.println(xor);

    }
}
