package net.foreach.data.pipeline;

/**
 * Created by aitor on 1/7/17.
 */
public interface Task {

    void initialize();

    void execute(TaskContext context, TaskSession session);
}
