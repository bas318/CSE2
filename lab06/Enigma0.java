/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n;
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
The error in this code had to do with the variable "n".  n was
never initialized outside of an if statement, which means it 
couldn't be used outside of the if statement.  To fix this,
I declared n as an int on line 13 outside of any if statement.
Then, since it was already initialized, I removed the "int" from 
before n on lines 15 and 19.  And since it was already assisgned a
value from previous if statements, I removed it from the list
on line 23.  With these corrections, the output returned is what
is expected.

 */