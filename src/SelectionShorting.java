public class SelectionShorting
{
    public static void main(String[] args) {
        int a[]={25,14,52,20,65,7,24,12,4,2};
        int temp;

        for (int i=0; i<a.length; i++)
        {
             for (int j=0; j<a.length; j++)
             {
                 if (a[i]<a[j])
                 {
                     temp=a[j];
                     a[j]=a[i];
                     a[i]=temp;
                 }
             }
        }
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
