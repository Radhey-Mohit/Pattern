import javafx.scene.transform.Scale;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int li=0,hi,mi;
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter a no ");
        int x=s.nextInt();
        hi=a.length-1;
        mi=(li+hi)/2;
        while (li<=hi)
        {
            if (mi==x)
            {
                System.out.println(x+" no is on "+(mi-1)+" index value.");
                break;
            }
            else if (x>mi)
            {
               li= mi+1;
            }
            else if (x<mi)
            {
                hi= mi-1;
            }
            mi= (li+hi)/2;

        }
    }
}
