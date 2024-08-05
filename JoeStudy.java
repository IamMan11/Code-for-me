// UniversityMember class
class UniversityMember {
    private String ID;
    private String name;

    // Constructor
    public UniversityMember(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    // Getter and Setter for ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method attend
    public void attend() {
        System.out.println(name + " is attending the university");
    }
}

// Student class
class Student extends UniversityMember {
    private String major;

    // Constructor
    public Student(String ID, String name, String major) {
        super(ID, name);
        this.major = major;
    }

    // Getter and Setter for major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Method study
    public void study() {
        System.out.println(getName() + " is studying " + major);
    }
}

// GraduateStudent class
class GraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public GraduateStudent(String ID, String name, String major, String researchTopic) {
        super(ID, name, major);
        this.researchTopic = researchTopic;
    }

    // Getter and Setter for researchTopic
    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    // Method research
    public void research() {
        System.out.println(getName() + " is researching on " + researchTopic);
    }
}

// Main class to test the classes
public class JoeStudy {
    public static void main(String[] args) {
        // Creating an object of GraduateStudent
        GraduateStudent gs = new GraduateStudent("GS123", "John Doe", "Software Engineering", "OOP");

        // Print the name and ID
        System.out.println("Name: " + gs.getName());
        System.out.println("ID: " + gs.getID());

        // Call methods
        gs.attend();
        gs.study();
        gs.research();

        // Change research topic
        gs.setResearchTopic("Back End Dev.");
        gs.research();
    }
}
