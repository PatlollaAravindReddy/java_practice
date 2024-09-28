package leetCode;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        int[] data = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(data));
    }

    public static int maxArea(int[] height) {
        int results = -1;
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            int count = j - i;
            int individualResult = - 1;
            if(height[i] < height[j]) {
                individualResult= count * height[i];
                i++;
            } else {
                individualResult = count * height[j];
                j--;
            }
            if(individualResult > results) {
                results = individualResult;
            };
        }
        return results;
    }
}
