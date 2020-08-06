package ch17_tree_structures.chapter_examples.section6;

/**
 * This program demonstrates the use of a heap as a priority queue.
 *
 */
public class HeapDemo {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        System.out.println("is heap empty? " + heap.empty());
        System.out.println(heap.peek());
        System.out.println(heap + "\n");
        heap.add("Waterbed");
        System.out.println(heap.peek());
        System.out.println(heap + "\n");
        heap.add("Zoo");
        heap.add("Armadillo");
        System.out.println(heap.peek());
        System.out.println("is heap empty? " + heap.empty());
        System.out.println(heap + "\n");
        heap.add("Andrea");
        heap.add("Maricela");
        heap.add("Cynthia");
        heap.add("Gabriela");
        
        heap.add("Isabella");
        
        heap.add("Aaron");
        System.out.println(heap.peek());
        System.out.println(heap + "\n");
        heap.add("Jose Aaron");
        
        heap.add("Antonio");
        
        heap.add("Marisela");
        
        heap.add("Daniel");
        System.out.println(heap.peek());
        System.out.println(heap + "\n");

        while(!heap.empty()) {
            System.out.println(heap.remove());
        }
    }
}