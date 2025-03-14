class Circle{
double area(int a){
double pi=3.14;
double res=pi*a*a;
return res;
}


public static void main(String Args[]){
    Circle r=new Circle();
double x=r.area(10);
System.out.println(x);
}
}