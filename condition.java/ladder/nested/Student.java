import java.io.DataInputStream;
class Student
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int maths,english,hindi,evs,total;
            maths=Integer.parseInt(data.readLine());
            english=Integer.parseInt(data.readLine());
            hindi=Integer.parseInt(data.readLine());
            evs=Integer.parseInt(data.readLine());
            total=(maths+english+hindi+evs)/4;
            if(maths>=35 )
            {
                System.out.println("maths pass");
            }
            else if( english>=35)
            {
                System.out.println("english pass");
            }
           
            else if( hindi>=35)
            {
                System.out.println("hindi pass");
            }
            
            else if( evs>=35)
            {
                System.out.println("evs pass");
            }
            else 
            {
                System.out.println("evs fail");
            }
              
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}