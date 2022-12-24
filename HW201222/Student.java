package HW201222;

import javax.xml.crypto.Data;

public class Student {
    private String name;
    private float averageGrade;
    private String dateOfBirth;

    public Student(String name, float averageGrade, String dateOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.dateOfBirth = dateOfBirth;

    }

    public String getName() {
        return this.name;
    }   

    public float getAverageBall() {
        return averageGrade;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", averageGrade=" + averageGrade + ", dateOfBirth=" + dateOfBirth + "]";
    }

    

    
    
}
