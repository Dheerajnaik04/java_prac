class Ellipse{
    void area(int a,int b){
        double pi=3.14;
        double res=pi*a*b;
        System.out.println(res);
    }
}
class Triangle{
    void area(int b, int h){
        double res=0.5*b*h;
        System.out.println(res);
    }
}
class Trapiz{
    void area(int a,int b, int h){
        double res=0.5*(a+b)*h;
        System.out.println(res);

    }

}
class Sector{
    void area(int a,int b ){
        double res=0.5*a*b*b;
        System.out.println(res);
    }
}
class Rectangel{
    void area(int a,int b ){
        int res=a*b;
        System.out.println(res);  
    }
}
class Square{
    void area(int a ){
        int res=a*a;
        System.out.println(res);  
    }
}
class Parll{
    void area(int a,int b ){
        int res=a*b;
        System.out.println(res);  
    }
}
class Main{
    public static void main(String [] args){
        Ellipse e=new Ellipse();
        e.area(10,10);
        Triangle t=new Triangle();
        t.area(10,23);
        Trapiz z=new Trapiz();

        z.area(10,2,0);
        Sector s=new Sector();
        s.area(2,2);
        Rectangel r=new Rectangel();
        s.area(10,20);
        Square q=new Square();
        q.area(33);
        Parll p=new Parll();
        p.area(10,10);
    }
}