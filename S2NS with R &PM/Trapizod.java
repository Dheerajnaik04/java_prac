class Trapizod{
    double area(double a,double b,double c){
        return 0.5*(a+b)*c;
     
    }

    
}
class Main1{
    public static void main(String [] args){
        Trapizod c=new Trapizod();
        System.out.println(c);;
        double x=c.area(1,2,9);
        System.out.println(x);
    
}
}