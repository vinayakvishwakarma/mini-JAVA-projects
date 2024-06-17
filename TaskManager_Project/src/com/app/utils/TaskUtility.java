package com.app.utils;

import java.util.List;
import static com.app.utils.ValidateTask.*;
import com.app.customexception.TaskCustomException;
import com.app.task.Task;

public class TaskUtility {
	public static String removeTask(Task task,List<Task> managerTask)throws TaskCustomException{
		int index=managerTask.indexOf(task);
		Task task1=managerTask.get(index);
		task1.setActive(false);
		return "task deleted!";
	}
	public static String updateStatus(Task task,List<Task> managerTask,String status)throws TaskCustomException{
		int index=managerTask.indexOf(task);
		Task task2=managerTask.get(index);
		task2.setStatus(parseStatus(status));
		return "Status updated!";
		
	}

}
