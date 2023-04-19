package j_oop.java_InfoCompany;

import java.util.List;
import java.util.ArrayList;

public class Department {
    private int id;
    private String name;
    private List<Employee> employees;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<Employee>();
    }

    // Геттеры и сеттеры для всех полей класса

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // Методы для добавления и удаления сотрудников в отдел

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setDepartment(this);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        employee.setDepartment(null);
    }

    // Метод для получения информации о сотрудниках в отделе

    public String getEmployeeInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Сотрудники отдела ").append(name).append(":\n");
        for (Employee employee : employees) {
            sb.append(employee.toString()).append("\n");
        }
        return sb.toString();
    }

    // Переопределение метода toString() для вывода информации об отделе

    @Override
    public String toString() {
        return "ID отдела: " + id + ", название отдела: " + name;
    }
}
