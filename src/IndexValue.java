import java.util.Scanner;

public class IndexValue
{
    public static void main(String[] args) {
        int a[]={ 12,23,43,45,43,23,45,67};
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter a no.");
        int x=s.nextInt();
        int y=0;
        for (int i=0; i<=a.length-1; i++)
        {
            if (x==a[i])
            {y++;
                System.out.println(" The Index value of "+x+"  is "+i);
            }

        }
        if (y==0)
        {
            System.out.println(" No is not found in Array.");
        }
    }
}
