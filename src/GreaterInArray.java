public class GreaterInArray
{
    public static void main(String[] args) {
        int [] a ={23,34,54,2,45,67,54,25,19};
        int x=a[0],y=a[0];
        for (int i=1; i<a.length-1; i++)
        {
            if (a[i]>x)
            {
                x=a[i];
            }
            if (a[i]<y)
            {
                y=a[i];
            }
        }
        System.out.println(" The greater no is -> " +x);
        System.out.println(" The smallest no is -> "+y);
    }
}
