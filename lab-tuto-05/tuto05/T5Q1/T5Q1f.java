import java.util.*;

public class T5Q1f {
    public static void main(String[]args){
        int [][] table = {{6,9},{2,5},{4,6}};
        table[1][1]=4;
        table[2][0]=3;
        table[2][1]=7;
        for (int i=0; i<3; i++){
            System.out.println(Arrays.toString(table[i]));
        }
    }
}


