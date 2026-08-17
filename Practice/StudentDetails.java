public class StudentDetails {
    public static void main(String[] args){
        String name = "Suresh M";
        int age = 20;
        int marks[] = {89,98,76};
        int totalMarks = 0;

        for(int i =0;i<marks.length;i++){
            totalMarks += marks[i];
        }
        double avgMarks = (double)totalMarks/marks.length;

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Marks = " + avgMarks);
    }
}
