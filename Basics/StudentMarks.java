public class StudentMarks {
    public static void main(String[] args){
        int arr[] = {89, 78, 57, 34, 46};

        int sum = 0;
        for (int Arr : arr){
            sum += Arr;
        }

        double Avg = (double) sum/arr.length;

        System.out.println(" Average Marks of Students = " + Avg);

        for (int Arr : arr){
            if (Arr > 90 && Arr <= 100)
                System.out.println("Grade A");
            else if (Arr > 75 && Arr <= 90)
                System.out.println("Grade B");
            else if (Arr > 40 && Arr <= 75)
                System.out.println("Grade C");
            else if (Arr > 0 && Arr <= 40)
                System.out.println("Grade F");
            else
                System.out.println("Invalid Marks...");
        }
    }
}
