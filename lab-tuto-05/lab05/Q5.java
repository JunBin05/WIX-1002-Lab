/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author User
 */
public class Q5 {
    public static void main(String[] args) {
        Random gen = new Random();
        int [] num =  new int [20];
        System.out.println("A list of 20 random integer within 0 to 100");
        //generate 20 random integer
        for (int i=0; i<20; i++){
            num[i]=gen.nextInt(101);
            if (i==19){
                System.out.print(num[i]);
            }else{
                System.out.print(num[i]+", ");
            }
        }
        System.out.println("\nArray in descending order");

        //bubble sort
        for (int j=0; j<20; j++){
            for (int i=19; i>j;i--){
                if (num[i-1]<num[i]){
                    int temp=num[i-1];
                    num[i-1]=num[i];
                    num[i]=temp;
                }
            }
            if (j==19){
                System.out.print(num[j]);
            }else{
                System.out.print(num[j]+", ");
            }
        }
        System.out.println();

        //input number
        Scanner input=new Scanner (System.in);
        System.out.print("Enter a number to search: ");
        int searchNum = input.nextInt();

        //linear search
        boolean found = false;
        int linearLoop=0;
        for (int i=0; i<20; i++){
            if (num[i]==searchNum){
                found=true;
                linearLoop=i+1;
                break;
            }
        }

        //binary search
        int low=0, high=19, binaryLoop=0;
        while (low<=high){
            binaryLoop++;
            int mid = (low+high)/2;
            if (num[mid]==searchNum){
                break;
            }else{
                if (searchNum>num[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }

        //print result
        if (found==true){
            System.out.println(searchNum+" found");
            System.out.println("Linear Search - "+linearLoop+" loop(s)");
            System.out.println(searchNum+" found");
            System.out.println("Binary Search - "+binaryLoop+" loop(s)");
        }else{
            System.out.println(searchNum+" not found");
        }
    }
}
