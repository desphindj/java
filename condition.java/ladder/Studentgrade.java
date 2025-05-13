import java.io.DataInputStream;
class Studentgrade
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            String studentname;
            int  english,chemistry,physics,tamil,french,biology,total;
            System.out.println("enter the name of the student");
            studentname=(data.readLine());
            System.out.println("enter the mark of english ");
            english=Integer.parseInt(data.readLine());
            System.out.println("enter the mark of chemistry ");
            chemistry=Integer.parseInt(data.readLine());
            System.out.println("enter the mark of physics");
            physics=Integer.parseInt(data.readLine());
            System.out.println("enter the mark of tamil ");
            tamil=Integer.parseInt(data.readLine());
            System.out.println("enter the mark of french");
            french=Integer.parseInt(data.readLine());
            System.out.println("enter the mark of biology ");
            biology=Integer.parseInt(data.readLine());
            total=(english+chemistry+physics+tamil+french+biology);
            if (english<35)
            {
                System.out.println(" total subject fail");
            }
            else if (chemistry<35)
            {
                System.out.println(" total subject fail");
            }
             else if (physics<35)
            {
                System.out.println(" total subject fail");
            }
            if (tamil<35)
            {
                System.out.println("total subject fail");
            }
            if (french<35)
            {
                System.out.println(" total subject fail");
            }
            else 
            {
                System.out.println("total subject fail");
            }
            System.out.println(total);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}