enum Day{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
public class EnumDay {
    public static void main(String[] args) {
        Day today = Day.Friday;
        switch(today){
            case Monday:
                System.out.println("WeekDay");
                break;
            case Tuesday:
                System.out.println("WeekDay");
                break;
            case Wednesday:
                System.out.println("WeekDay");
                break;
            case Thursday:
                System.out.println("WeekDay");
                break;
            case Friday:
                System.out.println("WeekEnd");
                break;
            case Saturday:
                System.out.println("WeekEnd");
                break;
            case Sunday:
                System.out.println("WeekEnd");
                break;
            default:
                System.out.println("Inavlid Input");
                break;
        }
    }
}
