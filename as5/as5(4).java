abstract class Vehicle{
String regNo;
vehicle(){
System.out.println("Creating Vehicle");      
}
public abstract void start();
public abstract void stop();
public void display(){
System.out.println("Vehicle reg no : "+regNo);
}
}

class TwoWheeler extends Vehicle{  
    public void start() {  
        System.out.println("Two wheeler start logic");      
  }      
public void stop() {  
        System.out.println("Two Wheeler stop logic");      
  }      
public class VehicleManager{  
    public static void main(String[] args) {  
        Vehicle twoWheeler = new TwoWheeler();
twoWheeler.regNo="HR01 Q2125";
       
        twoWheeler.start();  
        twoWheeler.stop();  
        twoWheeler.display();
     
    }  
}  
