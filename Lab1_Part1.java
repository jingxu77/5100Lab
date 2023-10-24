package edu.neu.mgen;



public class Lab1_Part1 {
    
    public static void main(String[] args){

        //Initiate two integer arrays, x, and y, each containing 5 numbers.
        int[] x = {1, 3, 4, 7, 9};
        int[] y = {3, 7, 5, 2, 8};
        /*Create another array z of length 5
        the elements of which are the max of the respective numbers of the two arrays x and y.
         */
        int[] z = new int[5];
        for (int i = 0; i < 5; i++){
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = {"+ arrayToString(x) + "}");
        System.out.println("Array y = {"+ arrayToString(y) + "}");
        System.out.println("Array z = x + y = {"+ arrayToString(z) + "}");

    }
        //convert array to string
        public static String arrayToString(int[] array){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]);
                if (i < array.length - 1) {
                    sb.append(", ");
                }
            }
            return sb.toString();

        }

     






       

    
}
