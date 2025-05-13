import java.io.DataInputStream;
class Elnum
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a;
            a=Integer.parseInt(data.readLine());
            if(a%2==0)
            {
                System.out.println("a is even");
            }
            else
            {
                System.out.println("a is odd");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}