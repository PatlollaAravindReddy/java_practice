package leetCode.fastslowpointers;

public class happynumber {
    public static void main(String[] args) {
        int no = 100;
        System.out.println(happynumberhelp(no));
    }

    static boolean happynumberhelp(int no) {
        int slowpointer = no;
        int fastpointer = no;
        do {
            slowpointer = additionhelper(slowpointer);
            fastpointer = additionhelper(additionhelper(fastpointer));
        } while (slowpointer != fastpointer);

        return slowpointer == 1;
    }

    static int additionhelper(int no) {
        int sum = 0;
        while(no != 0) {
            int no2 = no % 10;
            sum = sum + (no2 * no2);
            no = no / 10;
        }
        return sum;
    }
}
