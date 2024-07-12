package com.jamesli.data;

public class people {
    private String firstName;
    private String lastName;
    private static long id;
    private String email;
    private String address;


    public people(long id, String firstName, String lastName,String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = generateemail();
    }

    // Show status
    public void show() {
        System.out.println("Name :" + firstName + " " + lastName);
    }

    public String generateemail(){
        String email = firstName + lastName + "@student.school.edu";
        return email;
    }

    public long generateId(){
        return 0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
