package OOPs;
class Student{

    String name;
    int rollNo;

    //Static variable
    static String collegeName;

    //Static Block
    static{
        System.out.println("In Static Block");
    }
    
    public void Display(){
        System.out.println("Student Name -> " + name);
        System.out.println("Student Roll Number -> " + rollNo);
        System.out.println("Student College Name -> " + collegeName);
    }

    //Static Method
    public static void College(){
        System.out.println("Student College Name -> " + collegeName);
    }
}
public class StaticDemo {
    //Main is Static because it needs to call itself without creating object first
    public static void main(String[] args){
        Student.collegeName = " Kl University";
        Student student1 = new Student();
        student1.name = "Suresh";
        student1.rollNo = 30621;
        student1.Display();

        Student student2 = new Student();
        student2.name = "Suresh";
        student2.rollNo = 30621;
        student2.Display();

        Student.College();
    }
}
