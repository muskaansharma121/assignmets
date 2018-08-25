class Student{  
     int rollno;  
     String name;  
     static String college = "chandigarh university";  
     
     static void change(){  
     college = "chitkara university";  
     }  
     Student(int r, String n){  
     rollno = r;  
     name = n;  
     } 
     void display(){System.out.println(rollno+" "+name+" "+college);}  
}  

public class example{  
    public static void main(String args[]){  
    Student.change();
    Student s1 = new Student(1,"Kriti");  
    Student s2 = new Student(2,"Aayan");  
    Student s3 = new Student(3,"Sonia");   
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}