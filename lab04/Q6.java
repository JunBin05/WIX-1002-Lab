/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;
import java.util.Random;
/**
 *
 * @author User
 */
public class Q6 {
    public static void main(String[] args) {
        Random gen = new Random();
        int num = gen.nextInt(Integer.MAX_VALUE);
        int digit = 0;
        for (int i=num; i!=0; i/=10){
            digit++;
        }
        System.out.printf("There are %d digits in the number \"%d\"%n",digit,num);
    }
}

