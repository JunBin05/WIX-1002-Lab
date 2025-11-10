/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Q2 {
    public static int recurSum (int n, int sum, int count){
        if (count==n){
            return sum+n;
        }else{
            sum+=count;
            count++;
            return sum+recurSum(n, sum, count);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer (n): ");
        int n = input.nextInt();
        int count = 1, sum = 0;
        System.out.println("The sum is "+recurSum(n, sum, count));
    }
}
