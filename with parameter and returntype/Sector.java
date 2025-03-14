class Sector{
double area(int a,int b){
//double pi=3.14;
double res=a*a*b;
return res;
}


public static void main(String Args[]){
    Sector r=new Sector();
double x=r.area(10, 0);
System.out.println(x);
}
}