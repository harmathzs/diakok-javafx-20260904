package com.example.diakok20260904;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

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
        // Pre-load from file
        int n = 0;
        try {

            String line;
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            while ( (line = fileReader.readLine()) != null) {
                // Student student = new Student(line);
                n++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        setStudents(new Student[n]);
        // load data
        int i = 0;
        try {
            String line;
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            while ( (line = fileReader.readLine()) != null) {
                Student student = new Student(line);
                students[i] = student;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        return getStudents();
    }
}
