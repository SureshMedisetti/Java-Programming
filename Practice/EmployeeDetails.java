class Employee{
    private String name;
    private long id;
    private int salary;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();

        employees[0].setId(2400030621l);
        employees[0].setName("Suresh");
        employees[0].setSalary(175000);

        employees[1].setId(2400032879l);
        employees[1].setName("Rajesh");
        employees[1].setSalary(85000);

        employees[2].setId(2400031021l);
        employees[2].setName("Charan");
        employees[2].setSalary(76000);

        System.out.println(employees[0].getName());
        System.out.println(employees[0].getId());
        System.out.println(employees[0].getSalary());
        
        System.out.println(employees[1].getName());
        System.out.println(employees[1].getId());
        System.out.println(employees[1].getSalary());

        System.out.println(employees[2].getName());
        System.out.println(employees[2].getId());
        System.out.println(employees[2].getSalary());
    }
}
