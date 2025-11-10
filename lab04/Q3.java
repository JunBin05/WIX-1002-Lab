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
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sdsum=0, sum=0, count=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE; 
        System.out.print("Enter a score [negative score to quit]:");
        int num = input.nextInt();
        while (num>=0){
            sum+=num;
            sdsum+=(Math.pow(num,2));
            count++;
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
            System.out.print("Enter a score [negative score to quit]:");
            num = input.nextInt();
        }
        System.out.printf("Minimum Score: %d%n",min);
        System.out.printf("Maximum Score: %d%n",max);
        System.out.printf("Average Score: %.2f%n",(double)(sum/count));
        System.out.printf("Standard Deviation: %.2f%n",Math.sqrt((sdsum-(Math.pow(sum,2)/count))/(count-1)));
    }
}
