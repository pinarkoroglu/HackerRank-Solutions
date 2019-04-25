import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner N = new Scanner(System.in);
         int dayReturned = N.nextInt(); 
         int monthReturned = N.nextInt(); 
         int yearReturned = N.nextInt(); 

         int dayExpected  = N.nextInt(); 
         int monthExpected  = N.nextInt(); 
         int yearExpected  = N.nextInt(); 

         int yearLate=yearReturned-yearExpected;
         int monthLate=monthReturned-monthExpected;
         int dayLate=dayReturned-dayExpected;

         if(yearLate>0) System.out.println(10000);
         else{
             if(yearLate==0){
                if(monthLate>0) System.out.println(500*monthLate);           
                else if(monthLate==0&&dayLate>0) System.out.println(15*dayLate);
                else System.out.println(0);
             }
            else System.out.println(0);
         }
         }
}

