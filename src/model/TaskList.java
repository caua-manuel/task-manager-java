package model;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
    public Task findById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
    public boolean removeById(int id) {
        Task task = findById(id);

        if (task != null) {
            tasks.remove(task);
            return true;
        }
        return false;
    }
    public boolean updateStatusById(int id, TaskStatus newStatus) {
        Task task = findById(id);

        if (task != null) {
            task.setStatus(newStatus);
            return true;
        }

        return false;
    }

}
