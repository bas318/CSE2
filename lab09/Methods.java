//BA Sizemore IV
//lab09
//10-23-14
//create methods for expected output
//
//import scanner
import java.util.Scanner;
public class Methods {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c +
            " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
          ", and " + c + " are in ascending order");
    }
    public static int getInt(Scanner scan) {
        while (!(scan.hasNextInt())) {
            int j = 0;
            while (j<1) {
            scan.next();
            System.out.print("You did not enter an int; try again- ");
            j++;
        }
    }
    return scan.nextInt();
}

    public static int larger(int a, int b) {
        if (a > b) {
            return a;
        }
            return b;
    }
    
    public static boolean ascending(int a, int b, int c) {
        if ((a < b) && (b < c)) {
            return true;
        }
            return false;
    }

}