public class InsertShorting
{
    public static void main(String[] args) {
        int a[]= {5,6,2,1,0,3,9,11,-21,-2,10,4};
        int temp,j;

        for (int i=0; i<a.length; i++)
        {
            temp= a[i];
            j=i;
            while (j>0 && a[j-1]>temp)
            {
                a[j]= a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
