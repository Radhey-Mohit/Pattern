public class DecendingArray
{
    public static void main(String[] args) {
        int a[]= {34,45,35,23,56,7,86,5};
        int b;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a.length-1; j++)
            {
                if (a[j]<a[j+1])
                {
                    b=a[j+1];
                    a[j+1]=a[j];
                    a[j]=b;
                }
            }
        }
        for (int i=0 ; i<a.length; i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
