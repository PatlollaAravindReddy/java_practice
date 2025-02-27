package leetCode.bitwisexor;

public class Singlenumber_136 {
    public static void main(String[] args) {
        int[] data = {2, 2, 1, 3, 4, 5, 4, 3, 5};
        System.out.println(singlenumberHelper(data));
    }

    static int singlenumberHelper(int[] data) {
        int result = data[0];
        for (int i = 1; i < data.length; i++) {
            result = result ^ data[i];
        }
        return result;
    }
}
