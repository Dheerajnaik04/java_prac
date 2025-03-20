class Ellipse{
    double area(double a,double b){
        return 3.14*a*b;
    }

    
}
class Main1{
    public static void main(String [] args){
        Ellipse c=new Ellipse();
        System.out.println(c);;
        double x=c.area(1,9);
        System.out.println(x);
    
}
}