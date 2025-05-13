import java.io.DataInputStream;
class Elvote
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int age;
            age=Integer.parseInt(data.readLine());
            if(age>=18)
            {
                System.out.println("eligible to vote");
            }
            else
            {
                System.out.println("not eligible to vote");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}