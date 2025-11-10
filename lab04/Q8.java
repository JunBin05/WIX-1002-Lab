/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author User
 */
/*
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer(n): ");
        int n = input.nextInt();
        int count = 1;
        System.out.print("The first n prime numbers are: 2 ");
        ArrayList <Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        for (int i=3; count<n; i++){
            for (int j=0; j<prime.size();j++){
                if (i%prime.get(j)==0){
                    break;
                }else if (j==(prime.size()-1)){
                    prime.add(i);
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
        System.out.println();
    }
}
*/

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer(n): ");
        int n = input.nextInt();
        int count = 1;
        System.out.printf("The first %d prime numbers are: 2 ",n);
        for (int i = 3; count < n;i++){
            for (int j=1; j<=((int)Math.sqrt(i));j++){
                if ((j!=1) && (i%j==0)){
                    break;
                }else if (j==((int)Math.sqrt(i))){
                    count++;
                    System.out.print(i+" ");
                }
            }
        }
    }
}
