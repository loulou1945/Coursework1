public class Employee {
    private final String surName;
    private final String firstName;
    private final String lastName;
    private static int count = 1;
    private int department;
    private double salary;
    private final int id;

    public Employee(String surName, String firstName, String lastName, int department, double salary) {
        this.surName = surName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee a2 = (Employee) other;
        return firstName.equals(a2.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }

    @Override
    public String toString() {
        return "Фамилия: " + surName + "\n" +
                "Имя: " + firstName + "\n" +
                "Отчество: " + lastName + "\n" +
                "Зарплата: " + salary + "\n" +
                "Отдел: " + department + "\n" +
                "ID: " + id + "\n";
    }
}