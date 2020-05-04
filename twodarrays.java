public class twodarrays {
    public static <string> void main(String args[])
            //program using string arrays-2D , reading all the values and printing in the form of matrix
    {
        String a[][]={{"one","one","one"},{"two","two","two"},{"three","three","three"}};

        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
