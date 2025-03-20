class Triangle{
    double area(double a,double b){
        return 0.5*a*b;
    }

    
}
class Main1{
    public static void main(String [] args){
        Triangle c=new Triangle();
        System.out.println(c);;
        double x=c.area(1,9);
        System.out.println(x);
    
}
}