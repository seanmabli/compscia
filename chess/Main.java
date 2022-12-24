public class Main {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0, 0, 0, 0, 0, 0}, 
                 {0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0, 0, 0, 0, 0, 0},
         {0, 0, 0, 0, 0, 0, 0, 0}};

         draw(board);
    }

    static void draw(int[][] board) {
        for (int i = 0; i < 8; i++) {

        for (int j = 0; j < 8; j++) {
            System.out.print(board[i][j]);
        }
        System.out.println();
        }
    }
}
