/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;
import java.util.*;
/**
 *
 * @author User
 */
public class Q4 {
    public static void printArray (String [][] matrix){
        for (int i=0; i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter N for matrix (N x N): ");
        int n = input.nextInt();
        input.nextLine();
        String [][] matrix = new String [n][n];
        for (int i=1;i<=n;i++){
            System.out.printf("Enter value of row %d separated by space: ",i);
            matrix[i-1]=input.nextLine().split(" ");
        }
        System.out.printf("%d by %d Matrix%n",n,n);
        printArray(matrix);
        System.out.println("After rotates 90 degrees clockwise");
        String temp ="";
        for (int j=0; j<matrix.length/2+matrix.length%2;j++){
            for (int i=j; i<matrix[i].length-1;i++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
        printArray(matrix);
    }
}
