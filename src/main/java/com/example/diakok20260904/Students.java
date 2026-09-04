package com.example.diakok20260904;

public class Students {
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
/*
    private int studentsLength;

    public int getStudentsLength() {
        return studentsLength;
    }

    public void setStudentsLength(int studentsLength) {
        this.studentsLength = studentsLength;
    }
*/
    public Students() {
        students = new Student[200];
    }
    public Students(int length) {
        students = new Student[length];
    }

    public Student[] loadFromFile(String filename) {
        // TODO - load from file
        return getStudents();
    }
}
