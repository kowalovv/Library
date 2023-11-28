package com.solvd.solvdexercise.data.clients;

public class Student extends LibraryMember{

    private String firstName;
    private String lastName;
    private String idNumber;
    private int mobileNumber;
    private String mailAddress;

    public Student(int index, String firstName, String lastName, String idNumber, int mobileNumber, String mailAddress) {
        super(index);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.mobileNumber = mobileNumber;
        this.mailAddress = mailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
}
