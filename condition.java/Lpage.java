import java.io.DataInputStream;
class Lpage
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int Age;
            Age=Integer.parseInt(data.readLine());
            if( Age<17)
            {
                System.out.println("the person is a child");
            }
            else if( Age<30)
            {
                System.out.println("the person is an adult");

            }
            else{
                System.out.println("the person is a senior citizen");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}