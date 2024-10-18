package leetCode;

public class LengthofLastWord_58 {
    public static void main(String[] args) {
        String data = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(data));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int j = s.length() - 1;
        while(s.charAt(j) == ' ') {
            j--;
        }
        for(int i = j; i >=0 ; i--) {
            if(s.charAt(i) != ' ') {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}
