class Employee{
public void display(){
System.out.println("Name of Class is Employee");
}
public void calcSalary(){
System.out.println("Salary of Employee is 10000");
}
}
class Engineer extends Employee{
public void calcSalary(){
System.out.println("Salary of Employee is 20000");
}
}
class Test{
public static void main(String args[]){
Engineer e = new Engineer();
e.calcSalary();
e.display();
}
}