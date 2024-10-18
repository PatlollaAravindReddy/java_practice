package leetCode;

public class ZigZagConversion_6 {
    public static void main(String[] args) {
        String data = "PAYPALISHIRING";
        int rows = 3;
        System.out.println(convert(data, rows));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i< numRows; i++) {
            sb[i] = new StringBuilder();
        }
        char[] c = s.toCharArray();
        int index = 0;
        int idx = 1;
        for(int i = 0 ; i < c.length; i++) {
            sb[index].append(c[i]);
            if(index == 0) {
                idx = 1;
            } else if(index == numRows - 1) {
                idx = -1;
            }
            index = index + idx;
        }
        StringBuilder result = new StringBuilder();
        for(int i =0; i< numRows; i++) {
            result.append(sb[i]);
        }
        return result.toString();
    }
}
