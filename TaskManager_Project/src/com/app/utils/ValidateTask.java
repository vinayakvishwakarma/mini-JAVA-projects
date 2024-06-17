package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.customexception.TaskCustomException;
import com.app.task.Status;
import com.app.task.Task;

public class ValidateTask {
	public static Task validateTask(String taskName, String taskDesc, String taskDate) {
		
		return new Task(taskName,taskDesc,parsedate(taskDate));
	}
	public static LocalDate parsedate(String date) {
		return LocalDate.parse(date);
	}
	public static Status parseStatus(String status)throws TaskCustomException {
		Status st=Status.valueOf(status.toUpperCase());
		if(st==null)
			throw new TaskCustomException("Invalid status!");
		return st;
		
	}
	public static Task validateId(int id,List<Task> managerTask)throws TaskCustomException{
		Task task=new Task(id);
		if(managerTask.contains(task))
			return task;
		throw new TaskCustomException("Invalid id");	
	}

}
