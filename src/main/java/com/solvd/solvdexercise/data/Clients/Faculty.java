package com.solvd.solvdexercise.data.Clients;

public class Faculty extends LibraryMember{

    private String facultyName;

    public Faculty(int index, String facultyName) {
        super(index);
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
