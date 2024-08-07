package ch15JavaCollectionsFramework.practice_exercises;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Implement a to do list. Tasks have a priority between 1 and 9, and a description. When the user enters the command add
 * priority description, the program adds a new task. When the user enters next, the program removes and prints the most urgent
 * task. The quit command quits the program. Use a priority queue in your solution.
 *
 * Difficulty: Easy
 * 
 * TIME: 00:43:23
 * Time Complexity: N/A
 * Space Complexity: N/A
 *
 * TODO: Implement a JSF application for this program.
 */
public class E15_11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = "";
        ToDoList list = new ToDoList();

        do {
            menu();
            input = in.nextLine();

            if(input.contains("add")) {
                String[] arr = input.split(" ");
                list.add(new Task(Integer.valueOf(arr[1]), arr[2]));
            }
            else if(input.contains("next")) {
                System.out.println(list.remove());
            }
        } while(!input.equalsIgnoreCase("quit"));
        in.close();
    }

    private static void menu() {
        System.out.println("add <PRIORITY> <DESCRIPTION>");
        System.out.println("next");
        System.out.println("quit");
        System.out.println();
    }
}

class Task implements Comparable<Task> {
    private int priority;
    private String description;

    /**
     * Constructs a default task with low priority.
     */
    public Task() {
        priority = 9;
        description = "Sample Task";
    }

    /**
     * Constructs a task with given priority and description.
     *
     * @param priority the priority of this task, from 1 to 9. 1 being the most important, and 9 being the least important task.
     * @param description the description of the task.
     */
    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    /**
     * Compares this task to the other task, and returns a negative integer, zero, or a positive integer as this task is less
     * than, equal to, or greater than the other task.
     *
     * @return a negative integer, zero, or a positive integer as this task is less than, equal to, or greater than other task.
     */
    public int compareTo(Task other) {
        if (this.getPriority() > other.getPriority()) {
            return 1;
        }
        else if (this.getPriority() < other.getPriority()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    /**
     * Returns the task description.
     *
     * @return task description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the task priority.
     *
     * @return task priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the task description.
     *
     * @param description the task description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the task priority.
     *
     * @param priority the task priority.
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    /**
     * Returns the string representation of this task.
     *
     */
    public String toString() {
        return "Task[priority=" + priority + ", description= " + description + "]";
    }
}

class ToDoList {
    private PriorityQueue<Task> todoList;

    /**
     * Constructs an empty todo list.
     */
    public ToDoList() {
        todoList = new PriorityQueue<>();
    }

    /**
     * Adds a new task to the todo list.
     *
     * @param task the task to add
     */
    public void add(Task task) {
        todoList.add(task);
    }

    /**
     * Removes the next highest priority task.
     *
     * @return the next hghest priority task
     */
    public Task remove() {
        return todoList.remove();
    }
}