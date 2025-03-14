class Ellipse{
    void area(){
        int r=10;
        int b=10;
        double pi=3.14;
        double res=pi*r*b;
        System.out.println(res);
    }
    public static void main (String [] args){
        Ellipse c=new Ellipse();
        c.area();
    }
}