/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author User
 */
public class Q6 {
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
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = input.nextInt();
        System.out.printf("The Pascal Triangle with %d row(s)%n",n);
        int [][] pascal = new int[n][n];
        for (int i=0; i<pascal.length;i++){
            pascal[i][0]=1;
            pascal[i][i]=1;
            System.out.print(pascal[i][0]+" ");
            for (int j=1;j<pascal.length-1;j++){
                if ((i>1) && (j<i)){
                    pascal[i][j]=pascal[i-1][j]+pascal[i-1][j-1];
                }else if (j>i){
                    pascal[i][j]=0;
                }
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println(pascal[i][pascal.length-1]);
        }
    }
}
