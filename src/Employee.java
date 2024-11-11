public class Employee {

    private static int idGenerator = 1;
    private String fullName;
    private int salary;
    private int departament;
    private int id;

    public Employee(String fullName, int departament, int salary) {
        id = idGenerator++;
        this.departament = departament;
        this.fullName = fullName;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getId() {
        return id;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", departament=" + departament +
                ", id=" + id ;
    }

}
