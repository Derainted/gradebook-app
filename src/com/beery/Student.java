package com.beery;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private long SSN;
    private List<RecordBook> recordbook;

    public Student(String name, long SSN) {
        this.name = name;
        this.SSN = SSN;
        this.recordbook = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public long getSSN() {
        return SSN;
    }

    public List<RecordBook> getRecordbook() {
        return recordbook;
    }

    public void addCourse(int grade, String course) {
        this.recordbook.add(new RecordBook(grade,course));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", SSN=" + SSN +
                ", recordbook=" + recordbook +
                '}';
    }
}
