package pl.training.singleton;

import java.util.LinkedList;
import java.util.Queue;

public enum Tasks {

    INSTANCE;

    //private static final Tasks INSTANCE = new Tasks();

    private Queue<Task> tasksQueue = new LinkedList<>();

    //private Tasks() {
    //}

    //public static Tasks getInstance() {
    //    return INSTANCE;
    //}

    public void add(Task task) {
        tasksQueue.add(task);
    }

    public Task executeNext() {
        Task task = tasksQueue.poll();
        task.run();
        return task;
    }

}
