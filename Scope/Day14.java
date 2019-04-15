import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    int temp=0;
    int ar=0;
    Difference(int[] elements) {
        this.elements = elements;
    }
    public void computeDifference(){
        for(int i=0;i<elements.length;i++){
            for(int j=0;j<elements.length;j++){
                 ar= (elements[i]-elements[j]);
                 if(ar<0)
                    ar= (elements[i]-elements[j])*(-1);
                 if(ar>temp)
                    temp=ar;
                            
                                              }
                                          }
    	maximumDifference=temp;
                                   }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
