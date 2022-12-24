package HW201222;

import java.util.Iterator;

public class DescendingIterator implements Iterator<Student> {
    private int index;
    private StudentGroup studentGroup;

    public DescendingIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.index = this.studentGroup.sizeOfGroup();

    }

    @Override
    public boolean hasNext() {
        
        return this.index > 0;
    }

    @Override
    public Student next() {
        this.index--;
        return studentGroup.getStudent(this.index);
    }

    
}
