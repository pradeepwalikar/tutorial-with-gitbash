package ProgrammingHub.Array;

import java.util.Scanner;

class Matrix_Create
{
    int matrix[][];
    int row,column;

    Scanner scanner = new Scanner(System.in);

    void create()
    {
        System.out.println("Matrix creation: ");

        System.out.println("\nEnter the number of rows: ");
        row = scanner.nextInt();

        System.out.println("Enter the number of rows: ");
        column = scanner.nextInt();

        matrix = new int[row][column];
        System.out.println("Enter the data: ");

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    void display()
    {
        System.out.println("\nThe matrix is: ");

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}

public class CreateAndDisplayMatrix 
{
    public static void main(String[] args) 
    {
        Matrix_Create matrix_Create = new Matrix_Create();
        matrix_Create.create();
        matrix_Create.display();
    }
}
