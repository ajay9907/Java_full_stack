public class Emp1{

int age;
String name="Prasad";
String city;
byte id;
float marks;

public void emp2(){

System.out.println("Emp age is:" + age);
System.out.println("Emp name is:" + name);
System.out.println("Emp city is:" +city);
System.out.println("Emp id is:" +id);
System.out.println("Emp marks:" +marks);
}
public static void main(String[]args)
{
Emp1 e=new Emp1();
e.emp2();
}

}

