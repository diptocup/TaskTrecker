import clases.Task;
import clases.TaskManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Показать все задачи");
            System.out.println("4. Сохранить задачи");
            System.out.println("5. Загрузить задачи");
            System.out.println("6. Выход");
            System.out.print("Введите номер действия: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите описание задачи");
                    String taskName = scanner.nextLine();
                    System.out.println("Введите срок выполнения (YYYY-MM-DD)");
                    String dueDate = scanner.nextLine();
                    System.out.println("Введите приоритет задачи (1-3)");
                    int priority = scanner.nextInt();
                    Task task = new Task(taskName, dueDate, priority);
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.println("Введите описание задачи, для удаления: ");
                    String removeTask = scanner.nextLine();
                    //Реализовать поиск
                    break;
                case 3:
                    for (Task t : manager.getTasks()) {
                        System.out.println(t);
                    }
                    break;
                case 4:
                    try {
                        manager.saveTasks("File//task.txt");
                    } catch (IOException e) {
                        System.out.println("Ошибка сохраниения");
                    }
                    break;
                case 5:
                    try {
                        manager.loadTasks("task.txt");
                    } catch (IOException e) {
                        System.out.println("Ошибка загрузки задач");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Ошибка ввода, пожалуста, ввидете правильный номер");
            }
        }
    }
}