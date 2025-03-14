class Ellipse{
double area(int a,int b){
double pi=3.14;
double res=pi*a*b;
return res;
}


public static void main(String Args[]){
    Ellipse r=new Ellipse();
double x=r.area(10, 0);
System.out.println(x);
}
}