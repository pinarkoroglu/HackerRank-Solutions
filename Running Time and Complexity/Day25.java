import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int count=input.nextInt();
       int [] array=new int[count];
       for(int i=0;i<count;i++){
           array[i]=input.nextInt();     
       if (array[i] >= 2 && isPrime(array[i]))
           System.out.println("Prime");
       else 
           System.out.println("Not prime");
 }
    }
    public static boolean isPrime(int n){
         for(int j=2;j<=Math.sqrt(n);j++){
               if(n%j==0){
                    return false;  
               }
           }
           return true;
    }
}



