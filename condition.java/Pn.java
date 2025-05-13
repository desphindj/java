import java.io.DataInputStream;
class Pn
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a;
            a=Integer.parseInt(data.readLine());
            if(a>=0)
            {
                System.out.println("a is positive");
            }
            if(a<=0)
            {
                System.out.println("a is a negative ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}