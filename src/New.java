
class Test
{
static int a=10;
        void show()
        {
        int b=20;
        System.out.print(a);
        System.out.print(b);
        }
}
class NewClass
{
    public static void main(String [] args)
    {
        Test t= new Test();
        t.show();
        System.out.print(Test.a);

    }
}