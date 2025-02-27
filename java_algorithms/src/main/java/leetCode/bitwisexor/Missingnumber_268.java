package leetCode.bitwisexor;

public class Missingnumber_268 {
    public static void main(String[] args) {
        int[] data = {0,1,4,2,3,6};
        System.out.println(missingnumberHelper(data));
    }

    static int missingnumberHelper(int[] data) {
        int size = data.length + 1;

        int initialsum = data[0];
        for (int i = 1; i < data.length; i++) {
            initialsum = initialsum ^ data[i];
        }

        int actualsum = 0;
        for (int j = 0; j < size; j++) {
            actualsum = actualsum ^ j;
        }

        return initialsum ^ actualsum;
    }
}
