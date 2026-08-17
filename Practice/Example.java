class Student{
    public int Rollno;
    public String Name;

    Student(int Rollno, String Name){
        this.Rollno = Rollno;
        this.Name = Name;
    }
}
public class Example{
    public static void main(String[] args){
        Student students[] = new Student[5];
        students[0] = new Student(0,"Suresh");
        students[1] = new Student(1,"Suresh");
        students[2] = new Student(2,"Suresh");
        students[3] = new Student(3,"Suresh");
        students[4] = new Student(4,"Suresh");

        for (Student n : students){
            System.out.println(n.Rollno + " " + n.Name);
        } 
    }
}