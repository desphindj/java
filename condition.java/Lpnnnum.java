import java.io.DataInputStream;
class Lpnnnum
{
    public static void main(String args[])
    { try{
        DataInputStream data=new DataInputStream(System.in);
        int a;
        a=Integer.parseInt(data.readLine());
        if(a<0)
        {
            System.out.println("the number is negative number");
        }
        else if(a>0)
        {
            System.out.println("the number is positive number");
        }
        else{
            System.out.println("netural number");
        }
    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}