/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Q4 {
    public static boolean isLeap (int year){
        if (year % 400 != 0){
            if ((year % 100 == 0) || (year % 4 != 0)){
                return false;
            }
        }
        return true;
    }
    
    public static String printCalendar(int firstDay, String [] days){
        String statement = "";
        for (int i=1; i<=31 ; i++){
            statement+=("Day "+i+": "+days[firstDay]+"\n");
            firstDay=(firstDay+1)%7;
        }
        return statement;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter the year: ");
        int year = input.nextInt();
        System.out.print("Please enter the first day of the year (0-6): ");
        int dayOfYear = input.nextInt();
        int dayFeb = (isLeap(year))? 29:28;
        int dayByMay = 31*2+30+dayFeb;
        int dayByAug = 31*4+30*2+dayFeb;
        String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.printf("s%10s%10s%11s%13s%12s%10s%12%n","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
        int firstDayMay=(dayOfYear+(dayByMay%7))%7;
        int firstDayAug=(dayOfYear+(dayByAug%7))%7;
        System.out.printf("Calendar of May %d:%n",year);
        System.out.println(printCalendar(firstDayMay, days));
        System.out.printf("Calendar of August %d:%n",year);
        System.out.println(printCalendar(firstDayAug, days));
    }
}
