
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("ahmet", 1100, 45, 2000);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        System.out.println(employee);
    }
}
