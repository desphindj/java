import java.io.DataInputStream;
class Grosspay
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int salary ;
            double hra1,hra2,hra3,da1,da2,da3,gross;
            hra1=0.2;
            hra2=0.25;
            hra3=0.30;
            da1=0.80;
            da2=0.90;
            da3=0.95;
            System.out.println("enter the salary");
            salary=Integer.parseInt(data.readLine());
            if(salary<=10000 )
            {
                gross=salary+hra1+da1;
                System.out.println(gross);
            }
            else if (salary<=20000)
            {
                gross=salary+hra2+da2;
                System.out.println(gross);
            }
            else{
                gross=salary+hra3+da3;
                System.out.println(gross);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}