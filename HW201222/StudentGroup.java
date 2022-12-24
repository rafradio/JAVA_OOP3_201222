package HW201222;

import java.util.*;
 
public class StudentGroup implements Iterable<Student> {
    private LinkedList<Student> studentList;

    public StudentGroup(LinkedList<Student> studentList) {
        this.studentList = studentList;
    }

    // public List<Student> getStudentGroup() {
    //     return this.studentGroup;
    // }

    public int sizeOfGroup() {
        return this.studentList.size();
    }

    public Student getStudent(int index) {
        return this.studentList.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        
        return new StudentGroupIterator(this);
    }

    public Iterator<Student> descendingIterator() {
        
        return new DescendingIterator(this);
    }

    public ListIterator<Student> listIterator(int index) {
        
        return new GroupListIterator(this, index);
    }

    public ListIterator<Student> listIterator() {
        
        return new GroupListIterator(this);
    }

    

    
    
}
