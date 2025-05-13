import java.io.DataInputStream;
class Ex12
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a;
            a=Integer.parseInt(data.readLine());
            if(a%2==0)
            {
                System.out.println("a is a even number");
            }
            if(a%2!=0)
            {
                System.out.println("a is a odd number");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}