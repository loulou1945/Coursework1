public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.setEmployees(new Employee("Смирнова", "Виктория", "Сергеевна", 3, 40_000));
        employeeBook.setEmployees(new Employee("Долгова", "Ангелина", "Юрьевна", 1, 30_000));
        employeeBook.setEmployees(new Employee("Поляков", "Антон", "Иванович", 2, 25_000));
        employeeBook.setEmployees(new Employee("Зотов", "Александр", "Андреевич", 4, 28_000));
        employeeBook.setEmployees(new Employee("Карпова", "Анастасия", "Сергеевна", 3, 15_000));
        employeeBook.setEmployees(new Employee("Чернов", "Дмитрий", "Александрович", 2, 39_000));
        employeeBook.setEmployees(new Employee("Власова", "Анастасия", "Сергеевна", 5, 41_000));
        employeeBook.setEmployees(new Employee("Максимова", "Мария", "Александровна", 1, 33_000));

        employeeBook.printAll();
        employeeBook.printAllSalaryByMonth();
        employeeBook.printEmployeeWithMinSalary();
        employeeBook.printEmployeeWithMaxSalary();
        employeeBook.printMiddleSalary();
        employeeBook.printFIO();
        employeeBook.printIndexSalary();
        employeeBook.printMinSalaryInDepartment(1);
        employeeBook.printMaxSalaryInDepartment(3);
        employeeBook.printSalaryInDepartment(4);
        employeeBook.printMiddleSalaryInDepartment(2);
        employeeBook.printIndexInDepartment(1.05, 5);
        employeeBook.printEmployeeInDepartment(1);
        employeeBook.printEmployeeWithSalaryLassNumber(20_000);
        employeeBook.printEmployeeWithSalaryMoreNumber(35_000);
        employeeBook.AddingEmployee(new Employee("Андреева", "Елена", "Геннадьевна", 2, 34_000));
        employeeBook.removeEmployee(2);
        employeeBook.printEmployeeByID(1);
    }
}