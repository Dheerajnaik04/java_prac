class Trapezoid{
double area(int a,int b,int h){
//double pi=3.14;
double res=0.5*(a+b)*h;
return res;
}


public static void main(String Args[]){
    Trapezoid r=new Trapezoid();
double x=r.area(10, 0);
System.out.println(x);
}
}