package HW201222;

import java.util.Iterator;
import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    // private int startIndex = -1;
    private int index;
    private StudentGroup studentGroup;

    public GroupListIterator(StudentGroup studentGroup, int index) {
        this.studentGroup = studentGroup;
        this.index = index - 1;

    }

    public GroupListIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.index = -1;

    }

    @Override
    public boolean hasNext() {
        if (this.index == (this.studentGroup.sizeOfGroup() - 1)) this.index += 1;
        return this.index < this.studentGroup.sizeOfGroup() - 1;
    }

    @Override
    public boolean hasPrevious() {
        if (this.index == 0) this.index -= 1;
        return this.index > 0;
    }

    @Override
    public Student next() {
        this.index++;
        return studentGroup.getStudent(this.index);
    }

    @Override
    public Student previous() {
        this.index--;
        return studentGroup.getStudent(this.index);
    }

    @Override
    public int nextIndex() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int previousIndex() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub
        
    }
    
    
}
