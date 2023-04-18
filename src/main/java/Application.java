
public class Application {
    public static void main(String[] args) {

        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
//        employeeDAO.getAllEmployee().forEach(System.out::println);
        System.out.println(employeeDAO.getEmployeeById(6));
    }
}
