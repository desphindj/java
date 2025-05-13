import java.io.DataInputStream;
class  Abpos
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
            if(a<=0)
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