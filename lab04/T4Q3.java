/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author User
 */
public class T4Q3 {
    public static void main(String[] args) {
        int num1=1, num2=1, temp=0;
        System.out.println("Value 1: 1\nValue 2: 1");
        for (int i=3;i<=10;i++){
            temp=num1+num2;
            num1=num2;
            num2=temp;
            System.out.printf("Value %d: %d%n",i,temp);
        }
    }
}
