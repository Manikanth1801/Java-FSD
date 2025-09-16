/*
 * File Order: 5
 * Intent: Create a custom List class to demonstrate how packages prevent name collisions
 * 
 * This file shows:
 * - Creating a class with the same name as a Java built-in class (java.util.List)
 * - How packages prevent naming conflicts
 * - Simple implementation of a custom List
 * 
 * Key Learning Points:
 * 1. Packages allow classes with same names to coexist
 * 2. Full package name distinguishes between classes: mypackage.List vs java.util.List
 * 3. This prevents naming conflicts in large projects
 */

package mypackage; // Package declaration for our custom package

/**
 * Custom List class that demonstrates name collision avoidance
 * This class has the same name as java.util.List, but they don't conflict
 * because they are in different packages
 */
public class List {
    
    // Simple array-based implementation
    private String[] items;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    
    /**
     * Constructor creates a new List with default capacity
     */
    public List() {
        items = new String[DEFAULT_CAPACITY];
        size = 0;
    }
    
    /**
     * Constructor creates a new List with specified capacity
     * @param capacity Initial capacity of the list
     */
    public List(int capacity) {
        items = new String[capacity];
        size = 0;
    }
    
    /**
     * Adds an item to the list
     * @param item Item to add to the list
     * @return true if item was added successfully
     */
    public boolean add(String item) {
        if (size < items.length) {
            items[size] = item;
            size++;
            System.out.println("Added '" + item + "' to custom List");
            return true;
        } else {
            System.out.println("List is full! Cannot add '" + item + "'");
            return false;
        }
    }
    
    /**
     * Gets an item at the specified index
     * @param index Index of the item to retrieve
     * @return Item at the specified index, or null if index is invalid
     */
    public String get(int index) {
        if (index >= 0 && index < size) {
            return items[index];
        } else {
            System.out.println("Invalid index: " + index);
            return null;
        }
    }
    
    /**
     * Removes an item at the specified index
     * @param index Index of the item to remove
     * @return Removed item, or null if index is invalid
     */
    public String remove(int index) {
        if (index >= 0 && index < size) {
            String removedItem = items[index];
            
            // Shift elements to fill the gap
            for (int i = index; i < size - 1; i++) {
                items[i] = items[i + 1];
            }
            
            size--;
            items[size] = null; // Clear the last element
            
            System.out.println("Removed '" + removedItem + "' from custom List");
            return removedItem;
        } else {
            System.out.println("Invalid index for removal: " + index);
            return null;
        }
    }
    
    /**
     * Returns the current size of the list
     * @return Number of items in the list
     */
    public int size() {
        return size;
    }
    
    /**
     * Checks if the list is empty
     * @return true if the list has no items
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Displays all items in the list
     */
    public void display() {
        System.out.println("=== Custom List Contents ===");
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Size: " + size + " items");
            for (int i = 0; i < size; i++) {
                System.out.println("[" + i + "] " + items[i]);
            }
        }
        System.out.println("==========================");
    }
    
    /**
     * Returns information about this custom List
     * @return String describing this List implementation
     */
    public String getInfo() {
        return "Custom List from 'mypackage' - Simple array-based implementation";
    }
}
