import java.util.Scanner;

public class LenierSearch
{
    public static void main(String[] args) {
        int [] a ={ 23,43,56,76,86,45,34,56,78,98,65,34};
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter a no");
        int x= s.nextInt();
        for (int i=0 ; i<a.length; i++)
        {
            if (x==a[i])
            {
                System.out.println(x+ " no is  Array on index value of "+a[i]);
            }
        }
    }
}
