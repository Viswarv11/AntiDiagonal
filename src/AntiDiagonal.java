import java.util.Scanner;

public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row size of the 2D Array:");
        int rowsize=scanner.nextInt();
        System.out.println("Enter the column size of the 2D Array:");
        int colsize=scanner.nextInt();
        int array[][]=new int[rowsize][colsize];
        System.out.println("Enter the Array Elements row wise:");
        for (int i = 0; i < rowsize; i++) {
            for(int j=0;j<colsize;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        int [][]array1={{1,2,3},{4,5,6},{7,8,9}};
        antiDiagonal(array,rowsize,colsize);

    }

    private static void antiDiagonal(int[][] array, int rowsize, int colsize) {
        for (int x = 0; x < colsize; x++) {
            int i = 0, j = x;
            while (i < rowsize && j >= 0) {
                System.out.print(array[i][j] + " ");
                i++;
                j--;
            }
            for (int k = colsize - 1; k > x; k--) {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
        for (int x = 1; x < rowsize; x++) {
            int i = x, j = colsize - 1;
            while (i < rowsize && j >= 0) {
                System.out.print(array[i][j] + " ");
                i++;
                j--;
            }
            for (int k = rowsize - 1; k >x ; k--) {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

}
