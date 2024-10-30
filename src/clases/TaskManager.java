package clases;

import Enum.Category;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    public void saveTasks(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Task task : tasks) {
            fileWriter.write(task.toString() + "\n");
        }
        fileWriter.close();
    }

    public void loadTasks(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        tasks.clear();
        while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split(",");
            Task task = new Task(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Category.valueOf(tokens[3]));
            this.tasks.add(task);
        }
        bufferedReader.close();
    }
}
