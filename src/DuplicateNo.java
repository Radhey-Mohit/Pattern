public class DuplicateNo {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 4, 6, 4, 8};

        int k=0,l=0;
        for (int i=0; i<a.length; i++)
        {
           for (int j=0; j<a.length-1; j++)
           {
                if (a[j]>a[j+1])
                {
                    int temp = a[j+1];
                    a[j+1]= a[j];
                    a[j]= temp;
                }
           }
        }
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println("\n");

        for(int i=0; i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                a[l]=a[i];
                l++;
            }
            else
            {
                k++;
            }
        }
           a[l]=a[a.length-1];
        for (int i=0; i<a.length-k; i++)
        {
            System.out.print(a[i]+ " ");
        }

    }
}