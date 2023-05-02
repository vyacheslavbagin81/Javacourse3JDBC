import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        CitiDAOImpl citiDAO = new CitiDAOImpl();

        Employee employee1 = new Employee("Василий", "Маврин", "муж", 60, 3);
        Employee employee2 = new Employee("Олег", "Зуев", "муж", 45, 2);
        Employee employee3 = new Employee("Корней", "Жуков", "муж", 24, 1);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Citi citi = new Citi("Voronej", employees);

        citiDAO.createCiti(citi);

//        employeeDAO.getAllEmployee();
//
//        citiDAO.createCiti(city);
//
//        employeeDAO.getEmployeeById(5);
//
//        employeeDAO.updateEmployee(employee2, 5);
//
//        employeeDAO.deleteEmployee(13);
    }


}
