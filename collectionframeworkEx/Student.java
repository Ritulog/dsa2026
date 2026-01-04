package collectionframeworkEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<Student> , Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
    return id + " - " + name;
    }


    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Rita"));
        list.add(new Student(1, "Aman"));
        list.add(new Student(2, "John"));
        Collections.sort(list);

        list.forEach(System.out::println);

//        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
//
//        list.forEach(System.out::println);

    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }



}
