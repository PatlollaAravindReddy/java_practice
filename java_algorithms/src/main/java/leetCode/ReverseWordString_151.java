package leetCode;

public class ReverseWordString_151 {
    public static void main(String[] args) {
        String str = "  hello world  ";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String[] data = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = data.length - 1; i >= 0; i--) {
                sb.append(data[i]);
                sb.append(" ");
        }
        return sb.toString().trim();
    }
}
