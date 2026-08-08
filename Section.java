// Updated by Rakib
public class Section {
    private String sectionName;
    private int capacity;

    // Constructor
    public Section(String sectionName, int capacity) {
        this.sectionName = sectionName;
        this.capacity = capacity;
    }

    // Getters
    public String getSectionName() {
        return sectionName;
    }

    public int getCapacity() {
        return capacity;
    }

    // Setters
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}