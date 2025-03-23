public class EmployeeBook {
    private static final Employee[] employees = new Employee[10];

    public void setEmployees(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void printAll() {
        System.out.println("Список всех сотрудников (toString)");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printAllSalaryByMonth() {
        System.out.println("Сумма затрат на ЗП в месяц");
        double salaryAll = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryAll = salaryAll + employee.getSalary();
            }
        }
        System.out.println(salaryAll + "\n");
    }

    public void printEmployeeWithMinSalary() {
        System.out.println("Сотрудник с минимальной зарплатой");
        double minSalary = 1_000_000_000;
        for (Employee employee : employees) {
            if (employee != null && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println(minSalary + "\n");
    }

    public void printEmployeeWithMaxSalary() {
        System.out.println("Сотрудник с максимальной зарплатой");
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println(maxSalary + "\n");
    }

    public void printMiddleSalary() {
        System.out.println("Среднее значение зарплат");
        double middleSalary = 0;
        int countEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                middleSalary += employee.getSalary();
                countEmployee += 1;
            }
        }
        middleSalary /= countEmployee;
        System.out.println(middleSalary + "\n");
    }

    public void printFIO() {
        System.out.println("Ф.И.О. всех сотрудников (метод void)");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getSurName() + " " + employee.getFirstName() + " " + employee.getLastName());
            }
        }
        System.out.println();
    }

    public void printIndexSalary() {
        System.out.println("Индексирование зарплаты всех сотрудников");
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * 1.05);
                System.out.println(employee.getSalary());
            }
        }
        System.out.println();
    }

    public void printMinSalaryInDepartment(int department) {
        System.out.println("Сотрудник с минимальной зарплатой по отделу");
        double minSalary = 1_000_000_000;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println(minSalary + "\n");
    }

    public void printMaxSalaryInDepartment(int department) {
        System.out.println("Сотрудник с максимальной зарплатой по отделу");
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println(maxSalary + "\n");
    }

    public void printSalaryInDepartment(int department) {
        System.out.println("Сумма затрат на зп по отделу");
        double allSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                allSalary += employee.getSalary();
            }
        }
        System.out.println(allSalary + "\n");
    }

    public void printMiddleSalaryInDepartment(int department) {
        System.out.println("Среднее значение зарплат по отделу");
        double middleSalary = 0;
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                middleSalary += employee.getSalary();
                countEmployees += 1;
            }
        }
        middleSalary /= countEmployees;
        System.out.println(middleSalary + "\n");
    }

    public void printIndexInDepartment(double percent, int department) {
        System.out.println("Индексирование зарплаты отдела");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * percent);
                System.out.println(employee.getSalary());
            }
        }
        System.out.println();
    }

    public void printEmployeeInDepartment(int department) {
        System.out.println("Вывод сотрудников по отделу");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getSurName() + " " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
            }
        }
        System.out.println();
    }

    public void printEmployeeWithSalaryLassNumber(double salary) {
        System.out.println("Сотрудники с зп меньше числа");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee.getId() + " " + employee.getSurName() + " " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
            }
        }
        System.out.println();
    }

    public void printEmployeeWithSalaryMoreNumber(double salary) {
        System.out.println("Сотрудники с зп больше (или равно) числа");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " " + employee.getSurName() + " " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
            }
        }
        System.out.println();
    }

    public void AddingEmployee(Employee employee) {
        System.out.println("Добавление нового сотрудника (вывод false/true)");
        boolean result = true;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                result = true;
                break;
            } else {
                result = false;
            }
        }
        System.out.println(result + "\n");
    }

    public void removeEmployee(int id) {
        System.out.println("Удаление сотрудника по ID");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
        System.out.println();
    }

    public void printEmployeeByID(int id) {
        System.out.println("Вывод сотрудника по ID");
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                System.out.println(employee);
            }
        }
    }
}