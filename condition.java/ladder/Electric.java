import java.io.DataInputStream;
class Electric
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            double g,a,b,c,d,f;
            int unit;
            String customer;
            System.out.println("customer name");
            customer=(data.readLine());
             System.out.println("customer units");
            unit=Integer.parseInt(data.readLine());
            if( unit<=0 && unit<=199)
            {
                g=(unit*1.20);
            }
             else if( unit<=200 && unit<=400)
            {
                a=(unit-199);
                b=(199*1.20);
                g=((a*1.50)+b);
            }
            else if( unit<=400 && unit<=600)
            {
                a=unit-400;
                b=200;
                c=199;
                g=((a*1.80)+ (b*1.50) +(c*1.20) );
            }
           else 
            {
                a=(unit-600);
                b=200;
                g=(a*2.00) +(b*1.80) + (b*1.50) +(b*1.20);
                if (g<=400)
                    {
                        f=g*0.15;
                        System.out.println(f);
                }
                else{
                    System.out.println(g);
                }
            }   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}