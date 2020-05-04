public class arrays {

//program to loop the loop and print largest number in an array of integers

    public static void main(String args []) {
        int a[]={76,9,20,84,241};
        int max=0,temp=0;
        for(int i=0;i<a.length;i++)
        {
            if( a[i]>temp)
            {
                temp=a[i];
                max=temp;
            }
        }
        System.out.println("Largest number is "+max);
    }
}
