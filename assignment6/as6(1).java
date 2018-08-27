class parent {
public void display()
{
  System.out.println("hello muskaan");
  }
}
class child extends parent{
  public void display()
  {
    super.display();
    System.out.println("how are you");
  }
}
class Without_obj{
  public static void main(String[] args) {
    child c=new child();
    c.display();
    System.out.println(" i am fine");
  }
}