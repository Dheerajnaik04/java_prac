class Ellipse{
    void area(){
        int a=10;
        int b=20;
        double pi=3.14;
        double res=pi*a*b;
        System.out.println(res);
    }
}
class Triangle{
    void area(){
        int b=10;
        int h=10;

        double res=0.5*b*h;
        System.out.println(res);
    }
}
class Trapiz{
    void area( ){
        int a=10;
        int b=20;
        int h=30;
        double res=0.5*(a+b)*h;
        System.out.println(res);

    }

}
class Sector{
    void area( ){
        int a=20;
        int b=20;

        double res=0.5*a*b*b;
        System.out.println(res);
    }
}
class Rectangel{
    void area( ){
        int a=23;
        int b=33;

        int res=a*b;
        System.out.println(res);  
    }
}
class Square{
    void area( ){
        int a=22;
        int res=a*a;
        System.out.println(res);  
    }
}
class Parll{
    void area( ){
        int a=20;
        int b=22;

        int res=a*b;
        System.out.println(res);  
    }
}
class Main1{
    public static void main(String [] args){
        Ellipse e=new Ellipse();
        e.area();
        Triangle t=new Triangle();
        t.area();
        Trapiz z=new Trapiz();

        z.area();
        Sector s=new Sector();
        s.area();
        Rectangel r=new Rectangel();
        s.area(10,20);
        Square q=new Square();
        q.area();
        Parll p=new Parll();
        p.area(s);
    }
}