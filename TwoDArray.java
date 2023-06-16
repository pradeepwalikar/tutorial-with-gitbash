package ProgrammingHub.Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray{
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the number of rows: ");
       int rows = scanner.nextInt();

       System.out.println("Enter the number of columns: ");
       int columns = scanner.nextInt();

       int[][] a = new int[rows][columns];

       System.out.println("Enter the rows and columns of the table: ");
       for(int i=0;i<rows;i++)
       {
        for(int j=0;j<columns;j++)
        {
            a[i][j] = scanner.nextInt();
        }
       }

       System.out.println("Array of the Data:");

       System.out.println(Arrays.deepToString(a));
    }
}