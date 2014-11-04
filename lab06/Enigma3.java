/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }

    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println(k);
    switch(n+k){
        
      case 114: 
        n-=11;
        k-=3;
        break;
        
      case 97:
        n-=14;
        k-=2;
        break;
        
      case 98:
        n/=5;
        k/=9;
           
      default:
        n-=3;
        k-=5;
    }
    System.out.println(k);
    
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
by inserting System.out.println(k); before and after the switch statement,
we can see when we run the program that before the switch statemnts, the value
of k is 53, and after the swtich statement k is 0.  Then when you divide
by this 0 in line 56, it produces a runtime error.  To fix this, you would
need to fix your switch statement to avoid k becoming 0.
 */