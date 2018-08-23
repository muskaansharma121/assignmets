class Student{
    static String collage;
    int id;
    String name;

    Student(String name, int id)
    {
        this.name=name;
        this.id=id;
    }

    static{

        collage="chitkara university";
    }

    public static void main(String args[])
    {
        Student st1,st2;
        st1=new Student("muskaan",123);
        st2=new Student("roshni",456);

        System.ou.println(st1.name + "   " + st1.id+ "  "+ st1.collage);
        System.ou.println(st2.name + "   " + st2.id+ "  "+ st2.collage);
    }
}
