import java.util.*;

public class T5Q6 {
    public static void main(String[]args){
        Random gen = new Random();
        int num = gen.nextInt (256);
        int [] binary = new int [8];
        System.out.print("Random integer: "+num+"\nBinary digit: ");
        for (int i=7; i>=0; i--){
            binary[i]=num%2;
            num/=2;
        }
        for (int i=0; i<8; i++){
            System.out.print(binary[i]);
        }
    }
}


