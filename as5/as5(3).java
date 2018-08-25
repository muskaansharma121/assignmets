class sample
{
int a;
void print()
{
System.out.println(a);
}
void print(int a)
{
System.out.println(a);
}
void print(float a)
{
System.out.println(a);
}
}
public class example
{
public static void main(String[] args)
{
int a=2;
float b=6.777f;
sample s1=new sample();
s1.print(b);
}
}
