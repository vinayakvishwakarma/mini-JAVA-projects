package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static com.app.utils.ValidateTask.*;
import static com.app.utils.TaskUtility.*;

import com.app.customsort.SortByDate;
import com.app.task.Status;
import com.app.task.Task;

public class Client {

	public static void main(String[] args) {
		List<Task> managerTask = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("1. Add New Task \n" + "2. Delete a task  \n" + "3. Update task status \n"
							+ "4. Display all pending tasks\n" + "5. Display all pending tasks for today \n"
							+ "6. Display all tasks sorted by taskDate \n");
					switch (sc.nextInt()) {
					case 1:// add task
						System.out
								.println("Enter the details:\n" + "task name\n" + "task description\n" + "task date\n");
						Task task = validateTask(sc.next(), sc.next(), sc.next());
						managerTask.add(task);
						System.out.println("new task added successfully!");
						break;
					case 2:// delete task
						System.out.println("Enter Id:");
						task = validateId(sc.nextInt(), managerTask);
						System.out.println(removeTask(task, managerTask));
						for (Task t : managerTask) {
							if (!task.isActive()) {
								System.out.println(t);
							}
						}
						break;
					case 3:// update
						System.out.println("Enter Id:");
						task = validateId(sc.nextInt(), managerTask);
						System.out.println("enter the status:");
						System.out.println(updateStatus(task, managerTask, sc.next()));
						break;
					case 4:// display pending task
						System.out.println("all pending task:");
						for (Task t : managerTask) {
							if (t.getStatus() == Status.PENDING) {
								System.out.println(t);
							}
						}
						break;
					case 5:// display today's pending task
						System.out.println("today's pending task:");
						for (Task t : managerTask) {
							if (t.getStatus() == Status.PENDING && t.getTaskDate().equals(LocalDate.now())) {
								System.out.println(t);
							}
						}
						break;
					case 6://sorted by date
						System.out.println("Tasks sorted by date:");
						Collections.sort(managerTask, new SortByDate());
						for(Task t:managerTask) {
							System.out.println(t);
						}
					default:
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		}

	}

}
