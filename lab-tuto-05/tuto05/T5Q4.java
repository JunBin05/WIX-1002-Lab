import java.util.*;

public class T5Q4 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a sentence (count 'the'): ");
        String[] sentence = input.nextLine().split(" ");
        int count=0;
        for (int i=0; i<sentence.length;i++){
            count=(sentence[i].equals("the"))? count+=1: count;
        }
        System.out.println("The number of occurence of \"the\": "+count);
    }
}


