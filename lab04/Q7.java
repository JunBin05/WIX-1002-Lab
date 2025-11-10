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
public class Q7 {
    public static void main(String[] args) {
        double m, c, l ,r;
        Scanner input = new Scanner (System.in);
        System.out.print("Entecar principal amount: ");
        double pri = input.nextDouble();
        System.out.print("Enter interest in %: ");
        double interest = input.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double month = input.nextDouble();
        double totalInterest = 0;
        System.out.printf("Month%23s%16s%16s%23s%23s%n", "Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        for (int i=1;i<=month;i++){
            m=((pri*interest/(12*100))/(1-Math.pow((1+interest/(12*100)),-month)));
            c=m*Math.pow((1+interest/(12*100)),-(1+month-i));
            l=m-c;
            totalInterest+=l;
            r=(l/(interest/(12*100)))-c;
            if (i<10){
                System.out.printf("%d%27.2f%16.2f%16.2f%23.2f%23.2f%n",i,m,c,l,r,totalInterest);
            }else{
                System.out.printf("%d%26.2f%16.2f%16.2f%23.2f%23.2f%n",i,m,c,l,r,totalInterest);
            }
        }
        
    }
}

