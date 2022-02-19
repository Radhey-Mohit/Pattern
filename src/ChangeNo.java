import java.sql.SQLOutput;
import java.util.Scanner;

public class ChangeNo
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={23,34,45,56,11};
        int x;
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" \n Which no you want to delete");
        int y=s.nextInt();
        for (int i=0; i<a.length; i++)
        {
            if (y==a[i])
            {
                System.out.println(" Which no you want to put on the Place of ->"+y);
                int z=s.nextInt();
                a[i]=z;
            }

        }
        System.out.print(" After deletion Array is ->  ");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+ "  ");
        }
    }
}
