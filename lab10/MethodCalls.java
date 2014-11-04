//BA Sizemore IV
//CSE 002
//10-31-14
//MethodCalls java program
//concatenate ints using two different methods
//
//define class
public class MethodCalls {
    //main mehtod required for every java program
    public static void main(String[] arg) {
        int a = 784, b = 22, c;
        c = addDigit(a, 3);
        System.out.println("Add 3 to " + a + " to get " + c);
        c = addDigit(addDigit(c, 4), 5);
        System.out.println("Add 3, 4, and 5 to " + a + " to get " + c);
        System.out.println("Add 3 to -98 to get: " + addDigit(-98, 3));
        c = join(a, b);
        System.out.println("Join " + a + " to " + b + " to get " + c);
        System.out.println("Join 87, 42, and 83 to get " + join(87, join(42, 83)));
        System.out.println("Join -9 and -90 to get " + join(-9, -90));
    }
    public static int addDigit(int a, int c) {

        //if the number you want to add to is positive
        if (a >= 0) {
            //convert the number to add on to a string
            String numToAdd = (String.valueOf(c));
            //convert the number you're adding to to a string
            String originalNum = (String.valueOf(a));
            //concatenate the strings
            String addedNum = (numToAdd + originalNum);
            //convert concatenated strings back to an int
            int finalNum = Integer.parseInt(addedNum);
            //return the int
            return finalNum;
        }
        //if the number you want to add to is negative
        else if (a < 0) {
            //convert the number to be added on to a string
            String numToAdd = (String.valueOf(c));
            //convert the negative of the number you're adding to to a string
            String originalNum = (String.valueOf(-1 * a));
            //concatenate the strings with a negative sign in front
            String addedNum = ("-" + numToAdd + originalNum);
            //convert concatenated strings back to an int
            int finalNum = Integer.parseInt(addedNum);
            //return the int
            return finalNum;
        }

        //check if user input is in the range 1-9
        else if ((c >= 1) && (c <= 9)) {
            //if the number to be added is not between 1 and 9, alert the user and return a
            System.out.println("You did not enter an int between 1 and 9.");
            return a;
        }
        return a;
    }

    //jpin method
    public static int join(int a, int b) {
        if (a < 0 && b < 0) {
            //convert the negative of the number to be added on to a string
            String numToAdd = (String.valueOf(-1 * a));
            //convert the negative of the number you're adding to to a string
            String originalNum = (String.valueOf(-1 * b));
            //concatenate the strings
            String addedNum = (numToAdd + originalNum);
            //convert concatenated strings back to an int
            int finalNum = Integer.parseInt(addedNum);
            //return the int
            return finalNum;
        }
        return addDigit(a, b);
    }

} //end of class
