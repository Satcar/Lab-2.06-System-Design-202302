package org.SysDesign;

public class Student {
    private final String name;
    private int grade; // 0–100

    public Student(String name, int grade) {
        if (grade < 0 || grade > 100) throw new IllegalArgumentException("Grade out of range");
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public int getGrade() { return grade; }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) throw new IllegalArgumentException("Grade out of range");
        this.grade = grade;
    }
}
