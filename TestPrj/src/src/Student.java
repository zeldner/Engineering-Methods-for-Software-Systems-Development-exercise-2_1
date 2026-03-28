package src;


public class Student {
    private String name;
    private int id;
    private float averageGrade;

    // Kryo needs an empty constructor!
    public Student() {
    }

    public Student(String name, int id, float averageGrade) {
        this.name = name;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public float getAverageGrade() { return averageGrade; }
    public void setAverageGrade(float averageGrade) { this.averageGrade = averageGrade; }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", ID=" + id + ", Grade=" + averageGrade + "]";
    }
}
