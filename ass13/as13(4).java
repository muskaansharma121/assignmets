class Person
{
    String fname;
    int age;
    public Person() 
    {
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public String getFname() 
    {
        return fname;
    }
    public void setFname(String fname) 
    {
        this.fname = fname;
    }
    public Person(String fname,  int age) 
    {
        this.fname = fname;

        this.age = age;
    }
    public String toString() 
    {
        return fname  + age;
    }
}


public class Test 
{

    public static void main(String[] args) 
    {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("tiya", 54));
        persons.add(new Person("kiya", 20));
        persons.add(new Person("vibha", 19));
        persons.add(new Person("arjun", 28));

        Collections.sort(persons, new Comparator<Person>())
        {

            
            public int compare(Person t, Person t1) 
            {
                return t.getAge() - t1.getAge();
            }
        }
        System.out.println(persons);

    }
}
