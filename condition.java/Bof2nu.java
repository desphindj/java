import java.io.DataInputStream;
class Bof2nu
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b;
            a=Integer.parseInt(data.readLine());
            b=Integer.parseInt(data.readLine());
            if(a>b)
            {
                System.out.println("b is the smaller number");
            }
            if(a<b)
            {
                System.out.println("a is the smaller number");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}