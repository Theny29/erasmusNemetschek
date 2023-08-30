import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {

        int[] nums = {1,3,2,2,5,2,3,7};

        int fCount = 0;
        int sCount = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> hSet = new HashSet<Integer>();
            HashSet<Integer> lSet = new HashSet<Integer>();
            int currNum = nums[i];
            for (int n = 0; n < nums.length; n++) {
                if (currNum + 1 == nums[n] || currNum == nums[n]) {
                    hSet.add(nums[n]);
                    fCount++;
                }
                if (currNum - 1 == nums[n] || currNum == nums[n]) {
                    lSet.add(nums[n]);
                    sCount++;
                }
            }
            if (hSet.size() > 1 && fCount > maxCount) {
                maxCount = fCount;   
            }
            if (lSet.size() > 1 && sCount > maxCount) {
                maxCount = sCount;  
            }
            fCount = 0;
            sCount = 0;
        }
        System.out.println(maxCount);
    }
}
