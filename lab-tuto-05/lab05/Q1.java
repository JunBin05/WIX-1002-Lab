/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05;
import java.util.*;
/**
 *
 * @author User
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter N: ");
        int n = input.nextInt();
        int [] score = new int [n];
        int sum = 0, min=Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            score[i]=(int)(Math.random()*101);
            sum+=score[i];
            min = (score[i]<min)? score[i]: min;
            max = (score[i]>max)? score[i]: max;
        }
        System.out.println(Arrays.toString(score));
        System.out.println("Highest score: "+max);
        System.out.println("Lowest score: "+min);
        System.out.printf("Average score: %.2f%n",((double)sum)/n);
    }
    
}
