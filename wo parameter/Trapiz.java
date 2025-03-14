class Trapiz{
    void area(){
        int r=10;
        int b=10;
        int a=10;

       // double pi=3.14;
        double res=0.5*(a+b)*r;
        System.out.println(res);
    }
    public static void main (String [] args){
        Trapiz c=new Trapiz();
        c.area();
    }
}