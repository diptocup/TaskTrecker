package clases;

public class Task {
    private String description;
    private String dueDate;
    private int priority;

    public Task(String description, String task, int priority) {
        this.description = description;
        this.dueDate = task;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task [Описание задачи = " + description + ", Дата = " + dueDate + ", Приоретит = " + priority + "]";
    }
}
