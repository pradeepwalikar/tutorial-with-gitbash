package ProgrammingHub.Array;

import java.util.Scanner;

public class AddTwoMatrix{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int col = scanner.nextInt();

        int first [][] = new int [rows][col];
        System.out.println("Enter the elements of First matrixs: ");
        

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                first [i][j] = scanner.nextInt();
            }
        }

        int second [][] = new int [rows][col];
        System.out.println("Enter the elements of Second matrixs: ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                second [i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nElements of First matrixs: ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(first[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\nElements of Second matrixs: ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(second[i][j]+"\t");
            }
            System.out.println();
        }

        int sum [][] = new int [rows][col];
        System.out.println("Sum of the Two matrix is: ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                sum[i][j] = first[i][j] + second[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}