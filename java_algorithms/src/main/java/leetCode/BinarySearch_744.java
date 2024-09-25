package leetCode;

public class BinarySearch_744 {
    public static void main(String[] args) {
        char[] data = {'c','f','j'};
        char target = 'c';
        //System.out.println(nextGreatestLetter(data, target));
        System.out.println(nextGreatestLetterBs(data, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        // using linear search
        for(int i =0; i< letters.length; i++) {
            if(letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    static char nextGreatestLetterBs(char[] letters, char target) {
        // using binary search
        int left = 0;
        int right = letters.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(target < letters[mid]) {
                right = mid - 1;
            }
            else  {
                left = mid + 1;
            }
        }
        return letters[left % letters.length];
    }
}
