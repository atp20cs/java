interface ShapeInterface{
double pi = 3.14;
public void area();
}
class Shape{
private double r;
public void setR(double r){
this.r = r;
}
public double getR(){
return r;
}
}
class Circle extends Shape implements ShapeInterface{
public void area(){
System.out.println("Area of Cirlce="+(pi*getR()*getR()));
}
}
class Test{
public static void main(String args[]){
Circle c = new Circle();
c.setR(10);
c.area();
}
}
