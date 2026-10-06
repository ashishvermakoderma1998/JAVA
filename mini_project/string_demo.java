package mini_project;
import java.util.*;
import java.util.stream.Collectors;


final class Student {
private final int id;
private final String name;
private final String course;

public Student(int id, String name, String course) {
    
    this.id = id;
    this.name = name;
    this.course = course;
}

public int getId() {
    return id;
}

public String getName() {
    return name;
}

public String getCourse() {
    return course;
}


}

public class string_demo {
    public static void main(String[] args) {

        Student S = new Student(10,"V", "Java");
        System.out.println(S.getId() + " " + S.getName() + " " + S.getCourse());
    }
}