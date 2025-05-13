import java.io.DataInputStream;
class Els2n
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
            System.out.println("b is smaller");
        }
        else{
            System.out.println("a is smaller");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}