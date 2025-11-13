/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter N for number of employees: ");
        int n = input.nextInt();
        int [] totalHour = new int [n];
        System.out.printf("%n%42s%n%n          %6s%6s%6s%6s%6s%6s%6s%n","Analysis of Working Hours","Mon","Tue","Wed","Thu","Fri","Sat","Sun");
        for (int i=0; i<n; i++){
            System.out.print("Employee "+(i+1)+": ");
            for (int j=0; j<7; j++){
                int randomHour = ((int)(Math.random()*8))+1;
                System.out.printf("%4d  ",randomHour);
                totalHour[i]+=randomHour;
            }
            System.out.println();
        }
        System.out.printf("%n%40s%n","Sum of Working Hours");
        for (int count=0; count<n; count++){
            System.out.printf("%n%28s %d: %d hours","Employee",(count+1),totalHour[count]);
        }
        System.out.println("\n");
    }
}
