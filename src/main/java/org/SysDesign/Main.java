package org.SysDesign;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Student> increaseGrades(Map<String, Student> students) {
        for (Student s : students.values()) {
            int current = s.getGrade();
            int increased = (int)Math.round(current * 1.10);
            if (increased > 100) increased = 100;
            s.setGrade(increased);
        }
        return students;
    }

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("Artem",   new Student("Artem", 78));
        students.put("Felipe",  new Student("Felipe", 92));
        students.put("Cristian",  new Student("Cristian", 64));
        students.put("David",  new Student("David", 85));

        System.out.println("Notas reales:");
        students.values().forEach(s ->
                System.out.println(s.getName() + " -> " + s.getGrade())
        );

        increaseGrades(students);

        System.out.println("\nNotas despues del 'empujoncito':");
        students.values().forEach(s ->
                System.out.println(s.getName() + " -> " + s.getGrade())
        );
    }
}
