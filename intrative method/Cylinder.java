class Cylinder
{
    public static void main (String args[])
    {
        int R,r,h;
        double A;
        System.out.println("enter the value of R");
        R=Integer.parseInt(args[0]);
        System.out.println("enter the value of r");
        r=Integer.parseInt(args[1]);
        System.out.println("enter the value of h");
        h=Integer.parseInt(args[2]);
        A=((2*3.14*h)*(R*R)-(r*r));
        System.out.println(A);
    }
}