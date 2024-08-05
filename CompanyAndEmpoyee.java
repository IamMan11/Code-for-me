import java.util.ArrayList;

class Employee {
    private String name;
    private double salary;
    private int exp; // Experience in years

    // Constructor
    public Employee(String name, double salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and Setter for exp
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    // Method to calculate bonus
    public double calBonus() {
        return (salary * exp) * 0.3;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Experience: " + exp + " years, Bonus: " + calBonus());
    }
}

class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    // Getter and Setter for companyName
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to set employee's salary
    public void setEmployeeSalary(String name, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.setSalary(newSalary);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Method to display company information and details of all employees
    public void displayInfo() {
        System.out.println("Company Name: " + companyName);
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}

public class CompanyAndEmpoyee {
    public static void main(String[] args) {
        // Example usage
        Company company = new Company("Tech Corp");

        Employee emp1 = new Employee("Alice", 50000, 5);
        Employee emp2 = new Employee("Bob", 60000, 7);

        company.addEmployee(emp1);
        company.addEmployee(emp2);

        company.displayInfo();

        System.out.println("Updating Alice's salary...");
        company.setEmployeeSalary("Alice", 55000);
        company.displayInfo();
    }
}
