import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}

/*
The terminal shows:
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Enigma2.main(Enigma2.java:9)
        
When read you can see it says / by zero.  And java:9. This points
us to line 9, where you can see that 40 is being divided by zero.
This isn't a compiler error, but division by zero will produce
a runtime error that is identified in the java.lang.ArithmeticException
 */