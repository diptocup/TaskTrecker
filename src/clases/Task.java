package clases;

import Enum.Category;

public class Task {
    private String description;
    private String dueDate;
    private int priority;
    private Category category;

    public Task(String description, String task, int priority, Category category) {
        this.description = description;
        this.dueDate = task;
        this.priority = priority;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task [Описание задачи = " + description + ", Дата = " + dueDate + ", Преоритет = " + priority + ", Категория = " + category + "]";
    }
}
