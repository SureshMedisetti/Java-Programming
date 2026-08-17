public class GradeSystem {
    public void gradeSystem(int arr[]){
        for(int n : arr){
            if(n<100 && n>90){
                System.out.println("Marks = " + n + " - A Grade");
            }else if(n<90 && n>=75){
                System.out.println("Marks = " + n + " - B Grade");
            }else if(n<75 && n>=65){
                System.out.println("Marks = " + n + " - C Grade");
            }else if(n<65 && n>=40){
                System.out.println("Marks = " + n + " - D Grade");
            }else if(n>=0 && n<40){
                System.out.println("Marks = " + n + " - F Grade");
            }
        }
    }
    public static void main(String[] args) {
        int studentMarks[] = {24,40,56,77,89,98};
        GradeSystem obj = new GradeSystem();
        obj.gradeSystem(studentMarks);
    }
}
