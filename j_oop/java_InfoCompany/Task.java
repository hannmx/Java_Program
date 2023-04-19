package j_oop.java_InfoCompany;

public class Task {
    private int id;
    private String taskname;
    private String description;
    private Priority priority;
    private Status status;
    private Employee assignee;

    public Task(int id, String taskname, String description, Priority priority, Status status, Employee assignee) {
        this.id = id;
        this.taskname = taskname;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.assignee = assignee;
    }

    // Геттеры и сеттеры для всех полей класса

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskname;
    }

    public void setTaskName(String taskname) {
        this.taskname = taskname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Employee getAssignee() {
        return assignee;
    }

    public void setAssignee(Employee assignee) {
        this.assignee = assignee;
    }

    // Переопределение метода toString() для вывода информации о задаче

    @Override
    public String toString() {
        return "ID задачи: " + id + ", название задачи: " + taskname + ", описание задачи: " + description + ", приоритет: " + priority + ", статус: " + status + ", ответственный: " + assignee.getFirstName() + " " + assignee.getLastName();
    }
}
