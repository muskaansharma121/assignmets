class parent {
int x;
parent()
{
  System.out.println("default constructor");
}
parent(int a)
{
 this();
 System.out.println("a = "+a);
}

}

class Defaultconst{
  public static void main(String[] args) {
    parent c=new parent(10);
    System.out.println("We are studying in java");
  }
}