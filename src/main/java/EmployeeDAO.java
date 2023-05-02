import java.util.List;

public interface EmployeeDAO {
    void createEmloyee(Object employee);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployee();

    void updateEmployee(Employee employee, int id);

    void deleteEmployee(int id);
}
