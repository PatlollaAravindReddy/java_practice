package leetCode;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] data = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        //helperFun(data);
        helperFun2(data);
    }

    static void helperFun2(int[][] num) {
        int left = 0;
        int top = 0;
        int right = num[0].length - 1;
        int bottom = num.length - 1;
        int row = 0;
        int col = 0;

        while(left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.println(num[top][i]);
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                System.out.println(num[j][right]);
            }
            right--;
            if(top <=bottom) {
                for (int k = right; k >= left; k--) {
                    System.out.println(num[bottom][k]);
                }
                bottom--;
            }
            if(left <= right) {
                for (int l = bottom; l >= top; l--) {
                    System.out.println(num[l][left]);
                }
                left++;
            }
        }
    }

    static void helperFun(int[][] num) {
        boolean[][] visited = new boolean[num.length][num[0].length];
        int totalCells = num.length * num[0].length;
        int count = 0;
        int row = 0;
        int colm = 0;
        int[] rowMoves = {0,1,0,-1};
        int[] colmMoves = {1,0,-1,0};
        int direction = 0;
        while (count < totalCells) {

                System.out.println(num[row][colm]);
                count++;
            int nextRow = row + rowMoves[direction];
            int nextColm = colm + colmMoves[direction];
            if(nextRow >= 0 && nextRow < num.length && nextColm >= 0 && nextColm < num[0].length && !visited[nextRow][nextColm]) {
                row = nextRow;
                colm = nextColm;
            } else {
                direction = (direction + 1) % 4;
                row = row + rowMoves[direction];
                colm = colm + colmMoves[direction];
            }
        }
    }
}
