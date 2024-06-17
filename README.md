# mini-JAVA-projects
1.) Pen Project:
A company StyleWithPen sells stylish Pens online. 
Company needs an interface for site admin to manage stocks.

Write a console-based menu driven java program for site ADMIN to perform following operations: 

1. Add new Pen
2. Update stock of aPen
3.Set discount of 20% for all the pens which are not at all sold in last 3 months
4. Remove Pens which arenever sold once listed in 9 months

You can define a class Pen with the following fields – 
a.	ID (unique identifier for each Pen, should be generated automatically)
b.	Brand (Example:  Cello, Parker, Reynolds etc.)
c.	Color
d.	InkColor
e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
f.	Stock (Available quantity)
g.	Stock Update Date (it changed every time when admin update stock or user order executed)
h.	Stock Listing Date (date on which product is added to site for sale)
i.	Price (in INR) 
j.	Discounts (in percentage)

Note: You can use java collection to store items in memory.

2.)TaskManager Project:
Create a menu driven application "TaskManager" to manage your day-to-day tasks. 

You can create a class Task with fields like taskId, taskName, description, taskDate, status, active. 
taskId should be unique and generated automatically.
status should be either PENDING, IN PROGRESS or COMPLETED.
active should be either true or false. Deleted task will have active=false 
Newly added task should have default status as PENDING and active=true

You can use suitable data structure to store data in memory.

Following functionalities are expected -

a. Add New Task                       
b. Delete a task                         
c. Update task status               
d. Display all pending tasks     
e. Display all pending tasks for today           
f.  Display all tasks sorted by taskDate