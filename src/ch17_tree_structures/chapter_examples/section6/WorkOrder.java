package ch17_tree_structures.chapter_examples.section6;

/**
 * This class encapsulates a work order with a priority
 *
 */
public class WorkOrder implements Comparable {
    private int priority;
    private String description;

    /**
     * Constructs a work order with a given priority and description.
     *
     * @param priority the priority of this work order
     * @param description the description of this work order
     */
    public WorkOrder(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WorkOrder[priority=")
          .append(priority)
          .append(", description=")
          .append(description)
          .append("]");
        
        return sb.toString();
    }

    /**
     * Compares this work order to the other work order.
     *
     * @param other the work order to compare to
     *
     * @return a negative number if this priority is less than the other priority, a positive number if this priority is greater
     *         than the other priority, or 0 if both priorities are the same
     */
    public int compareTo(Object other) {
        WorkOrder order = (WorkOrder) other;

        if(this.priority < other.priority) {
            return -1;
        }
        else if(this.priority > other.priority) {
            return 1;
        }
        else {
            return 0;
        }
    }
}