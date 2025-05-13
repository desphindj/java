import java.io.DataInputStream;
class Vote
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a;
            a=Integer.parseInt(data.readLine());
            if(a>=18)
            {
                System.out.println("a is eligible to vote");
            }
            if(a<18)
            {
                System.out.println("a is not eligible");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}