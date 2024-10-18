package leetCode;

public class LengthofLastWord_58 {
    public static void main(String[] args) {
        String data = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(data));
        System.out.println(lengthOfLastWord2(data));
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

    public static int lengthOfLastWord2(String s) {
        String[] data = s.split(" ");
        return data[data.length - 1].length();
    }
}
