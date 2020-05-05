public class findvaluearrays {
    public static void main(String args[]){
        int[] myarray= {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        int value=0;
        for(int i=0;i<myarray.length;i++)
        {
            if(myarray[i]==14)
                value=1;
        }
        if(value==1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
