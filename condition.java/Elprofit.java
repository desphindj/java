import java.io.DataInputStream;
class Elprofit
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a;
            a=Integer.parseInt(data.readLine());
            if(a>=1000)
            {
                System.out.println("profit is above 1000 , so PROFIT");
            }
            else
            {
                System.out.println("loss and the amount is lesser than 1000");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}