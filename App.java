public class App {
    public static void main(String[] args) throws Exception {

        int[] height = {1,1};

        int maxArea = 0;
        int tempArea;
        int j = height.length - 1;

        for (int i = 0; i < j;) {
            tempArea = (j - i) * (height[i] < height[j]? height[i] : height[j]);
            if (tempArea > maxArea) maxArea = tempArea;
            if (height[i] < height[j]) {
                i += 1;
            } else {
                j -= 1;
            }
        }
        
        System.out.println(maxArea);
    }
}