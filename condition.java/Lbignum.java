import java.io.DataInputStream;
class Lbignum
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c;
            a=Integer.parseInt(data.readLine());
            b=Integer.parseInt(data.readLine());
            c=Integer.parseInt(data.readLine());
            if (a>b && a>c)
            {
                System.out.println("A is greater");
            }
            else if(b>a && b>c)
            {
                System.out.println("b is greater");
            }
            else
            {
                System.out.println("c is greater");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}