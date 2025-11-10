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
public class T4Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a string here: ");
        String sentence = input.nextLine();
        int n = sentence.length();
        for (int i=1; i<=n; i++){
            System.out.print(sentence.charAt(n-i));
        }
    }
}
