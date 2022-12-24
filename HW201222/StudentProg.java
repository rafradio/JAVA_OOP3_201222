package HW201222;

import java.util.*;
import java.util.Iterator;

public class StudentProg {
    public static void main(String[] args) {
        LinkedList<Student> lstSt = new LinkedList<Student>(Arrays.asList(
            new Student("Иванов", 4.8f, "01.05.1985"),
            new Student("Петров", 4.3f, "01.08.1985"),
            new Student("Сидоров Максим", 4.5f, "01.02.1985"),
            new Student("Кузнецов", 4.1f, "01.03.1985"),
            new Student("Павлов", 4.0f, "01.11.1985")
        ));

        StudentGroup studentGroup = new StudentGroup(lstSt);
        
        Iterator<Student> studentIt = studentGroup.iterator();

        Iterator<Student> studentItDescending = studentGroup.descendingIterator();

        // listiterator начинаем с четвертой позиции
        ListIterator<Student> listStudetnIterator = studentGroup.listIterator(4);

        while (studentIt.hasNext()) {
            System.out.println(studentIt.next());
        }

        System.out.println("\n");

        while (studentItDescending.hasNext()) {
            System.out.println(studentItDescending.next());
        }

        System.out.println("\n");

        while (listStudetnIterator.hasPrevious()) {
            System.out.println(listStudetnIterator.previous());
        }

        System.out.println("\n");

        while (listStudetnIterator.hasNext()) {
            System.out.println(listStudetnIterator.next());
        }

        System.out.println("\n");

        while (listStudetnIterator.hasPrevious()) {
            System.out.println(listStudetnIterator.previous());
        }

        // listiterator начинаем с начала
        listStudetnIterator = studentGroup.listIterator();


        System.out.println("\nПерегруженный ListIterator\n");
        while (listStudetnIterator.hasNext()) {
            System.out.println(listStudetnIterator.next());
        }

        System.out.println("\n");

        while (listStudetnIterator.hasPrevious()) {
            System.out.println(listStudetnIterator.previous());
        }


        



      
         
    }

}