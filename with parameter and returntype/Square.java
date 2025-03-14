class Square{
int area(int a,int b){
int res=a*a;
return res;
}
public static void main(String Args[]){
Rectangle2 r=new Square();
int x=r.area(10);
System.out.println(x);
}
}