package com.beery;

public class RecordBook {

    private int grade;
    private String course;

    public RecordBook(int grade, String course) {
        this.grade = grade;
        this.course = course;
    }



    public int getGrade() {
        return grade;
    }
    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Recordbook{" +
                "grade=" + grade +
                ", course='" + course + '\'' +
                '}';
    }
}
