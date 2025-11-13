/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author User
 */
public class Q2 {
    public static void main(String[] args) {
        int [] num = new int [10];
        for (int i=0; i<10; i++){
            boolean isFound = false;
            while (isFound==false){
                num[i]=(int)(Math.random()*21);
                isFound = true;
                for (int j=0; j<i; j++){
                    if (num[i]==num[j]){
                        isFound=false;
                        break;
                    }
                }
            }
        }
        for (int count=0; count<10; count++){
            System.out.print(num[count]+" ");
        }
        System.out.println();
    }
}
