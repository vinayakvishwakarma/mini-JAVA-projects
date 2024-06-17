package com.app.task;

import java.time.LocalDate;

public class Task {
	
	private int taskId;
	private String taskName;
	private String desc;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	private static int counter=0;
	public Task(String taskName, String desc, LocalDate taskDate) {
		super();
		counter++;
		this.taskId=counter;
		this.taskName = taskName;
		this.desc = desc;
		this.taskDate = taskDate;
		this.status=status.PENDING;
		this.active=true;
		
	}
	public Task(int taskId) {
		this.taskId=taskId;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Task) {
			Task task=(Task)obj;
			return this.taskId==task.taskId;
			//return this.taskId.equals(task.taskId);
		}
		return false;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", desc=" + desc + ", taskDate=" + taskDate
				+ ", status=" + status + ", active=" + active + "]";
	}
	
	
	

}
