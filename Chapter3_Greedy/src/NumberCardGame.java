import java.util.Scanner;

public class NumberCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] cardArray = new int[n][m];
        for (int i = 0; i < cardArray.length; i++) {
            for (int j = 0; j < cardArray[0].length; j++) {
                cardArray[i][j] = sc.nextInt();
            }
        }

        int theHighestNumber = 0;
        for(int i=0; i<n; i++) {
            theHighestNumber = Math.max(theHighestNumber, getTheLowestNumberInARow(cardArray[i]));
        }

        System.out.println(theHighestNumber);
    }

    private static int getTheLowestNumberInARow(int[] oneRowOfCardArray){
        int theLowestNumberInARow = 100;
        for(int i=0; i<oneRowOfCardArray.length; i++){
            theLowestNumberInARow = Math.min(theLowestNumberInARow, oneRowOfCardArray[i]);
        }
        return theLowestNumberInARow;
    }
}
