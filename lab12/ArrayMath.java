//B.A. Sizemore IV
//10-13-14
//ArrayMath java program
//
//
//import scanner
public class ArrayMath {
    //main method
    public static void main(String[] arg) {
        double x[] = {
                2.3, 3, 4, -2.1, 82, 23
            },
            y[] = {
                2.3, 3, 4, -2.1, 82, 23
            },
            z[] = {
                2.3, 13, 14
            },
            w[] = {
                2.3, 13, 14, 12
            },
            v[],
            u[] = {
                2.3, 12, 14
            };
        v = addArrays(x, y);
        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));
        System.out.println(display(x) + " \n  + " + display(z) + "\n   = " + display(addArrays(x, z)));
        System.out.println("It is " + equals(x, y) + " that " + display(x) +
            " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z) +
            " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u) +
            " == " + display(z));

    }
    
    public static boolean equals(double[] array1, double[] array2) {
        if (array1.length == array2.length) {
            for (int x = 0; x < array1.length; x++) {
                    if (array1[x] == array2[x])
                        return true;
                }
            }
        return false;
    }
    
    
    public static double[] addArrays(double[] array1, double[] array2) {
        int x = 0;
        if (array1.length < array2.length) {
            double[] addedArray = new double[array2.length];
                for (x = 0; x < array1.length; x++) {
                    addedArray[x] = array1[x] + array2[x];
                }
                while (x < array2.length && x >= array1.length) {
                    addedArray[x] = array2[x];
                    x++;
                }
                
                return addedArray;
        }
        
        if (array1.length > array2.length) {
            double[] addedArray = new double[array1.length];
                for (x = 0; x < array2.length; x++) {
                    addedArray[x] = array1[x] + array2[x];
                }
                while (x < array1.length && x >= array2.length) {
                    addedArray[x] = array1[x];
                    x++;
                }
                return addedArray;
        } 
        return array1;
    }

    public static String display(double[] x) {
        String out = "{";
        for (int j = 0; j < x.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += x[j];
        }
        return out + "}";
    }
}

/*
OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}
*/