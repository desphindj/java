import java.io.DataInputStream;
class Cfk
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            double f,k,c,u;
            int cal;
            System.out.println("enter the value of f");
            f=Integer.parseInt(data.readLine());
            System.out.println("enter the value of k");
            k=Integer.parseInt(data.readLine());
            System.out.println("enter the value of c");
            c=Integer.parseInt(data.readLine());
            System.out.println("enter the cal  1.F>>C , 2.C>>F , 3.C>>K , 4.K>>F , 5.F>>K  , 6.K>>C");
            cal=Integer.parseInt(data.readLine());
            switch(cal)
            {
                case 1:
                    u=(f-32)*(5/9);
                    System.out.println(u);
                    break;
                case 2:
                    u=(c*(9/5)+32);
                    System.out.println(u);
                    break;
                case 3:
                    u=c+273.15;
                    System.out.println(u);
                    break;
                case 4:
                    u=(k-273.15)*(9/5)+32;
                    System.out.println(u);
                    break;
                case 5:
                    u=(f-32)*(5/9)+273.15;
                    System.out.println(u);
                    break;
                case 6:
                    u=(k-273.15);
                    System.out.println(u);
                    break;
            }
        }
        catch(Exception e)
        {
              System.out.println(e);
        }
    }
}