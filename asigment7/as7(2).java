abstract class animals
{
String color;
String breed;
String name;
abstract void eat();
void speak()
{
System.out.println("Animals don't speak");
}
}
class Dog extends animals
{
public void eat()
{
System.out.println("Animal eat grass");
}
}
class exam
{
public static void main(String[] args)
{
Dog d=new Dog();
d.eat();
}
}
