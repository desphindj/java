import java.io.DataInputStream;
class Lmonth
{
    public static void main(String args[]) 
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int month;
            System.out.println("enter 1(jan) ,2(feb),3(mar),4(aprl),5(may),6(june),7(july),8(august).9(septe),10(oct),11(novem),12(december)");
            month=Integer.parseInt(data.readLine());
            if(month==1)
            {
                System.out.println("january");
            }
            else if(month==2)
            {
                System.out.println("febuary");
            }
            else if(month==3)
            {
                System.out.println("march");
            }
            else if(month==4)
            {
                System.out.println("april");
            }
            else if(month==5)
            {
                System.out.println("may");
            }
            else if(month==6)
            {
                System.out.println("june");
            }
            else if(month==7)
            {
                System.out.println("july");
            }
            else if(month==8)
            {
                System.out.println("august");
            }
            else if(month==9)
            {
                System.out.println("september");
            }
            else if(month==10)
            {
                System.out.println("october");
            }
            else if(month==11)
            {
                System.out.println("november");
            }
            else 
            {
                System.out.println("december");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
