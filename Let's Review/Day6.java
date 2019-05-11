import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfArray=input.nextInt();
        input.nextLine();
        for(int i=0;i<countOfArray;i++){
            String string = input.nextLine();
            char [] arrayChar=string.toCharArray();
            for(int j=0;j<arrayChar.length;j++){
                if(j%2==0)  
                    System.out.print(arrayChar[j]);       
             }
            System.out.print(" ");
            for(int j=0;j<arrayChar.length;j++){
                if(j%2!=0)  
                    System.out.print(arrayChar[j]);       
             }
             System.out.println();
        }        
    }
}

