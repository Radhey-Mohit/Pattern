public class SecondGreatest
{
    public static void main(String[] args)
    {
        int [] a = {23,45,67,89,78,54,6,53,5,86};
        int temp=0,max=0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a.length-1; j++)
            {
                if (a[j]<a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println(" \n second largest no is => "+ a[1]);

        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a.length-1; j++)
            {
                if (a[j]>a[j+1])
                {
                    max=a[j+1];
                    a[j+1]=a[j];
                    a[j]=max;
                }
            }
        }
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println(" \n second smallest no is => "+ a[1]);

    }
}
