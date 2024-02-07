package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicListOperation {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Collections.reverse(list);
        list.forEach(System.out::println);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sanjeev", 50));
        students.add(new Student(2, "Rupesh", 10));
        students.add(new Student(3, "Yuvi", 150));
        students.add(new Student(4, "Gagan", 30));
        students.forEach(System.out::println);

        Comparator<Student> studentMarksComparator = new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o2.getMarks() - o1.getMarks();
            }

        };
       Collections.reverseOrder(studentMarksComparator);

    }

}

class Student {

    private int rollNo;
    private String name;
    private int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
    }

}
