public class Teacher {

    private int id;
    private String name;
    private String subject;

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher(101, "Rahim Sir", "Mathematics");

        System.out.println("ID: " + teacher.getId());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Subject: " + teacher.getSubject());

        teacher.setSubject("Physics");

        System.out.println("Updated Subject: " + teacher.getSubject());
    }
}