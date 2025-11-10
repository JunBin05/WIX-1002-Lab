/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04;
import java.util.Scanner;
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
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.print("The factors are: 1");
        for (int i=2; i<=num; i++){
            if (num%i==0){
                System.out.print(", "+i);
            }
        }
        System.out.println();
    }
    
}
