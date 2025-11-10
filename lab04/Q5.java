/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author User
 */
public class Q5 {
    public static void main (String [] args){
        int dice1=0, dice2=0, sum1=0, sum2=0, count=0;
        boolean continueGame = true;
        while (continueGame){
            dice1=dice2=6;
            count++;
            System.out.printf("%n*****************Round %d*****************%n",count);
            while ((dice1==6) && (continueGame)){
                dice1=(int)(Math.random()*6)+1;
                sum1+=dice1;
                System.out.printf("Player 1 roll: %d (Making total score of %d)%n",dice1,sum1);
                if (sum1>100){
                    System.out.printf("\nPlayer 1 has won with total score of %d!%n",sum1);
                    continueGame=false;
                    break;
                }
            }
            while ((dice2==6) && (continueGame)){
                dice2=(int)(Math.random()*6)+1;
                sum2+=dice2;
                System.out.printf("Player 2 roll: %d (Making total score of %d)%n",dice2,sum2);
                if (sum2>100){
                    System.out.printf("\nPlayer 2 has won with total score of %d!%n",sum2);
                    continueGame=false;
                    break;
                }
            }
        }    
    }
}
