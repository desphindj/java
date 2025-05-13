class Cy{
    public static void main(String args[])
    {
        double P;
        int h,R,r;
        System.out.println("enter the value of h");
        h=Integer.parseInt(args[0]);
        System.out.println("enter the value of R");
        R=Integer.parseInt(args[1]);
        System.out.println("enter the value of r");
        r=Integer.parseInt(args[2]);
        P=((3.14*r*h)*(R*R)*(r*r));
        System.out.println(P);
    }
}