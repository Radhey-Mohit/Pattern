public class MergeArray {


    public static void main(String[] args) {
        int a[] = {1, 3, 2,25,5, 6};
        int b[] = {9, 8,87,21,20,11};
        int c[] = new int[12];
        int z=a.length;
        for (int i = 0; i < a.length ; i++)
        {
            c[i]=a[i];

        }
        System.out.println("\n");
        for (int j=0; j<b.length; j++)
        {
           c[j+z]=b[j];

        }
        for (int i=0; i<c.length; i++)
        {
            System.out.print(c[i]+ " ");
        }


    }
}

