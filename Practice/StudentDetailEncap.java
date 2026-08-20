class Student{
    String name;
    int rollNo;
    int marks;

    public Student(String name,int rollNo,int marks){
        this.name =name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void Display(){
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollNo);
        System.out.println("Marks = " + marks);
        System.out.println();
    }
}


public class StudentDetailEncap {
    public static void main(String[] args) {
        Student student1 = new Student("Suresh", 101, 87);
        student1.Display();
        Student student2 = new Student("Ram", 102, 98);
        student2.Display();
        Student student3 = new Student("Rajesh", 103, 97);
        student3.Display();
    }
}
