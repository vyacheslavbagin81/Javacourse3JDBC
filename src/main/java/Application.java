import java.util.List;

public class Application {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        CitiDAOImpl citiDAO = new CitiDAOImpl();

        Citi citi = Citi.builder().citiName("Томбов").build();


        Employee employee1 = Employee.builder().
                firstName("Василий").
                lastName("Маврин").
                gender("муж").
                age(60).
                citiName(citi).
                build();
        Employee employee2 = Employee.builder().
                firstName("Олег").
                lastName("Зуев").
                gender("муж").
                age(45).
                citiName(citi).
                build();
        Employee employee3 = Employee.builder().
                firstName("Корней").
                lastName("Жуков").
                gender("муж").
                age(24).
                citiName(citi).
                build();

        citi.setEmployees(List.of(employee1, employee2, employee3));

        citiDAO.createCiti(citi);

        citi.getEmployees().get(1).setFirstName("TesT");
        citiDAO.updateCiti(citi);

        citiDAO.deleteCiti(1);
    }
}
