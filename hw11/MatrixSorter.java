//BA Sizemore IV
//December 2, 2014
//CSE 002
//MatrixSorter java program
//uses methods, multi-dimensional arrays, and sorts
//
//public class
public class MatrixSorter {
    //main method
    public static void main(String arg[]) {
            //new 3D array
            int mat3d[][][];
            mat3d = buildMat3d();
            show(mat3d);
            System.out.println("The smallest entry in the 3D matrix is " +
                findMin(mat3d));
            System.out.println("After sorting the 3rd matrix we get");
            //   sort(mat3d[2]);
            show(mat3d);
        } //end of main method


    //return a ragged 3D array, where the first slab has three rows, the second slab five rows, and the third slab seven rows
    public static int[][][] buildMat3d() {
            //initialize mat3d to 3 slabs
            int mat3d[][][] = new int[3][][];
            //put 3+2*s rows in eac slab
            for (int s = 0; s < 3; s++) {
                mat3d[s] = new int[3 + 2 * s][];
                //put s+k+1 columns in each row
                for (int k = 0; k < mat3d[s].length; k++) {
                    mat3d[s][k] = new int[s + k + 1];
                    //assign random numbers 1-99 (inclusive) to the members of mat3d
                    for (int i = 0; i < mat3d[s][k].length; i++) {
                        mat3d[s][k][i] = (int)((Math.random() * 98) + 1);
                    }
                }
            }
            return mat3d;
        } //end of buildMat3d method

    //print out the array (all slabs)
    public static void show(int[][][] mat3d) {
            //loop for number of slabs
            for (int j = 0; j < 3; j++) {
                //print out number of the slab
                System.out.print("---------------------------");
                System.out.println("Slab " + (j + 1));
                //loop for number of rows
                for (int p = 0; p < mat3d[j].length; p++) {
                    //loop to print the columns
                    for (int t = 0; t < mat3d[j][p].length; t++) {
                        System.out.print(mat3d[j][p][t] + " ");
                    }
                    //move to a new line after printing a full column on one line
                    System.out.println("");
                }

            }
        } //end of show method


    //find the smallest entry in the array
    public static int findMin(int[][][] mat3d) {
            //set default value for minimum
            int min = mat3d[0][0][0];
            //loop thorugh the slabs
            for (int j = 0; j < 3; j++) {
                //loop through the rows
                for (int p = 0; p < mat3d[j].length; p++) {
                    //loop through the columns
                    for (int t = 0; t < mat3d[j][p].length; t++) {
                        //if one of the array values is < the current min, set that value as the new value for min
                        if (mat3d[j][p][t] < min) {
                            min = mat3d[j][p][t];
                        }
                    }
                }
            }
            return min;
        } //end of findMin method


    //sort the entries in each row of the array, using a selection sort. 
    //Then sort the rows by the value in the first column of each row using an insertion sort
    public static int[][] sort(int[][] x) {
            for (int i = 0; i < x.length; i++) {
                for (int y = 0; y < x[y].length; y++) {
                    int j = i;
                    int element = x[y][i];
                    while ((j > 0) && (x[y][j + 1] > j)) {
                        x[y][j] = x[y][j - 1];
                        x[y][j] = element;
                    }
                }
            }
            return x;
        } //end of sort method

} //end of public class