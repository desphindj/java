import java.io.DataInputStream;
class Sales
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            double cm1,cm2,cm3,cm4,cm5;
            int sales;
            System.out.println("enter the sales amount");
            sales=Integer.parseInt(data.readLine());
            if(sales<0 || sales<=10000 )
            {
                cm1=sales*0;
                System.out.println(cm1);
            }
            else if(sales<=10000 && sales<=20000)
            {
                cm2=(sales*0.05);
                System.out.println(cm2);
            }
            else if(sales<=20000 && sales<=50000)
            {
                cm3=(sales*0.10);
                System.out.println(cm3);
            }
            else if(sales<=50000 && sales<=100000 )
            {
                cm4=(sales*0.15);
                System.out.println(cm4);
            }
            else{
                cm5= (sales*(0.20+500));
                System.out.println(cm5);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}