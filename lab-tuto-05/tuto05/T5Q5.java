import java.util.*;

public class T5Q5 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a sentence (reverse): ");
        String[] sentence = input.nextLine().split(" ");
        for (int i=sentence.length-1; i>=0;i--){
            for (int j=sentence[i].length()-1;j>=0;j--){
                System.out.print(sentence[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}


