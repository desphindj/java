import java.io.DataInputStream;
class Elb2n
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
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}