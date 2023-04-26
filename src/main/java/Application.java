public class Application {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

        Employee employee1 = new Employee("Василий", "Маврин", "муж", 60, 3);
        Employee employee2 = new Employee("Олег", "Зуев", "муж", 45, 2);
        Employee employee3 = new Employee("Корней", "Жуков", "муж", 34, 1);

        employeeDAO.getAllEmployee();

        employeeDAO.createEmloyee(employee1);

        employeeDAO.getEmployeeById(5);

        employeeDAO.updateEmployee(employee2, 5);

        employeeDAO.deleteEmployee(13);
    }


}
