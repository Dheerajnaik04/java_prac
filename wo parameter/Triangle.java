class Triangle{
    void area(){
        int r=10;
        int b=10;

       // double pi=3.14;
        double res=0.5*b*r;
        System.out.println(res);
    }
    public static void main (String [] args){
        Triangle c=new Triangle();
        c.area();
    }
}