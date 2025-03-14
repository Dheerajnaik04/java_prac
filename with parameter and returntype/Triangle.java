class Triangle{
double area(int a,int b){
//double pi=3.14;
double res=0.5*a*b;
return res;
}


public static void main(String Args[]){
    Triangle r=new Triangle();
double x=r.area(10,10);
System.out.println(x);
}
}