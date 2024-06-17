package com.app.customsort;

import java.util.Comparator;

import com.app.task.Task;

public class SortByDate implements Comparator<Task> {
	public int compare(Task t1,Task t2) {
		return t1.getTaskDate().compareTo(t2.getTaskDate());
	}

}
