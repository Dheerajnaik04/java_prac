class Circle{
    double area(double r){
        return 3.14*r*r;
    }

    
}
class Main{
    public static void main(String [] args){
        Circle c=new Circle();
        System.out.println(c);;
        double x=c.area(19);
        System.out.println(x);
    
}
}