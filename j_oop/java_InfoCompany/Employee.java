package j_oop.java_InfoCompany;

import java.util.List;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private Department department;
    private List<Task> tasks;

    public Employee(int id, String firstName, String lastName, String position, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
        this.tasks = new ArrayList<Task>();
    }

    // Геттеры и сеттеры для всех полей класса

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    // Методы для добавления и удаления задач

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    // Метод для получения информации о задачах сотрудника

    public String getTaskInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Задачи сотрудника ").append(firstName).append(" ").append(lastName).append(":\n");
        for (Task task : tasks) {
            sb.append(task.toString()).append("\n");
        }
        return sb.toString();
    }

    // Переопределение метода toString() для вывода информации о сотруднике

    @Override
    public String toString() {
        return "ID: " + id + ", " + firstName + " " + lastName + ", должность: " + position + ", отдел: " + department.getName();
    }
}
