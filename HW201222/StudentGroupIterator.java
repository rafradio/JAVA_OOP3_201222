package HW201222;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private int index = -1;
    private StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;

    }

    @Override
    public boolean hasNext() {
       

        // boolean x =  this.index < this.studentGroup.sizeOfGroup();
        
        return this.index < this.studentGroup.sizeOfGroup() - 1;
    }

    

    @Override
    public Student next() {
        this.index++;
        return studentGroup.getStudent(this.index);
    }
    
}
