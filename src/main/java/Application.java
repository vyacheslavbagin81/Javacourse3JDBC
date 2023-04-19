
public class Application {
    public static void main(String[] args) {

        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        employeeDAO.getAllEmployee().forEach(System.out::println);
        System.out.println();

        employeeDAO.updateEmployee(6);

        System.out.println(employeeDAO.getEmployeeById(6));
        System.out.println();

        employeeDAO.deleteEmployee(7);

        employeeDAO.getAllEmployee().forEach(System.out::println);
        System.out.println();

        employeeDAO.createEmloyee();

        employeeDAO.getAllEmployee().forEach(System.out::println);
        System.out.println();
    }
}
