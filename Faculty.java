// Updated by Rakib
public class Faculty {
    private int facultyId;
    private String facultyName;
    private String designation;

    // Constructor
    public Faculty(int facultyId, String facultyName, String designation) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.designation = designation;
    }

    // Getters
    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getDesignation() {
        return designation;
    }

    // Setters
    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}