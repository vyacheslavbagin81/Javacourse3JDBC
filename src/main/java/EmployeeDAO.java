import java.util.List;

public interface EmployeeDAO {
    void createEmloyee(Employee employee);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployee();

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);
}
