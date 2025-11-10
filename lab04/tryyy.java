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
public class tryyy {
    public static int checkFeb (int year){
        if (year % 400 != 0){
            if ((year % 100 == 0) || (year % 4 != 0)){
                return 28;
            }
        }
        return 29;
    }
    
    public static int calcDay (int month, int year){
        if (month==1){
            return 0;
        }else if (month==2){
            return 31;
        }else if (month<=7){
            int monthNew=month-3;
            return 31+checkFeb(year)+((monthNew%2)*31)+(monthNew/2*31)+(monthNew/2*30);
        }else{
            int monthNew=month-8;
            return checkFeb(year)+31*4+30*2+((monthNew%2)*31)+(monthNew/2*31)+(monthNew/2*30);
        }
    }
    
    public static void printCalendar(int firstDay, int month, int year){
        int dayOfMonth;
        if (month==2){
            dayOfMonth=checkFeb(year);
        }else if (month==8){
            dayOfMonth=31;
        }else if ((month==9) || (month==11) || month%2==0){
            dayOfMonth=30;
        }else{
            dayOfMonth=31;
        }
        for (int count=0, numDay=1; numDay<=dayOfMonth ; count++){
            if ((count!=0) && (count%7==0)){
                System.out.println();
            }
            if (count < firstDay){
                System.out.print("       ");
            }else{
                System.out.printf("%6d ",numDay);
                numDay++;
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter the year: ");
        int year = input.nextInt();
        System.out.print("Please enter the first day of the year (0-6): ");
        int dayOfYear = input.nextInt();
        System.out.print("Please enter the month you want (1-12): ");
        int month = input.nextInt();
        int day = calcDay (month, year);
        String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int firstDay=(dayOfYear+(day%7))%7;
        for (int j=1; j<=49; j++){
            System.out.print("-");
        }
        System.out.printf("%n%25s %d%n",months[month-1],year);
        for (int j=1; j<=49; j++){
            System.out.print("-");
        }
        System.out.printf("%n%7s%7s%7s%7s%7s%7s%7s%n","Sun","Mon","Tue","Wed","Thu","Fri","Sat","Sun");
        printCalendar(firstDay, month, year);
    }
}
