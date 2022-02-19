public class AssendingArray
{
    public static void main(String[] args) {
        int a[]= {23,34,56,45,43,65,76,74};
        int b;
        for (int i=0 ; i<a.length; i++)
        {
            for (int j=0; j<a.length-1; j++)
            {
                if (a[j]>=a[j+1])
                {
                    b= a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }
        }
        for (int i=0 ; i<a.length; i++)
        {
            System.out.print( "  "+a[i]);
        }
    }

}
