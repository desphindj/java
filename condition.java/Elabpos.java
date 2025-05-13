import java.io.DataInputStream;
class  Elabpos
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c;
            System.out.println("enter a");
            a=Integer.parseInt(data.readLine());
            if(a>=0)
            {
                System.out.println("A is absoulte positive====>..."+a);
            }
            else
            {
                a=a*(-1);
                System.out.println("A is  positive===>..."+a);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}