package springframework;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private static final int MAX_EMPLOYEES = 10;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String firstName, String lastName) throws EmployeeStorageIsFullException, EmployeeAlreadyAddedException {
        // реализация метода addEmployee
    }

    public void removeEmployee(String firstName, String lastName) throws EmployeeNotFoundException {}
        // реализация метода removeEmployee


    public Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        return null;
    }
        // реализация метода findEmployee


    public List<Employee> getAllEmployees() {
        return employees;
    }
}
