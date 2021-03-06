package com.example.restfullapi;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private Date createdAt;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private Date startedAt;
    private Date leftAt;
    private String email;
    private Long id;


    Employee() {
    }

    /**
     *  Employee konstruktor
     * @param createdAt
     * @param firstName
     * @param lastName
     * @param jobTitle
     * @param startedAt
     * @param leftAt
     * @param email
     * @param id
     */
    Employee(Date createdAt, String firstName, String lastName, String jobTitle, Date startedAt, Date leftAt, String email, Long id) {

        this.createdAt = createdAt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.startedAt = startedAt;
        this.leftAt = leftAt;
        this.email = email;
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getLeftAt() {
        return leftAt;
    }

    public void setLeftAt(Date leftAt) {
        this.leftAt = leftAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Zwei Employee Objekte vergleichen
     * @param o
     * @return true, falls die Employee Objekte sind gleich
     */
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.createdAt, employee.createdAt)
                && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.lastName, employee.lastName)
                && Objects.equals(this.jobTitle, employee.jobTitle)
                && Objects.equals(this.startedAt, employee.startedAt)
                && Objects.equals(this.leftAt, employee.leftAt)
                && Objects.equals(this.email, employee.email)
                && Objects.equals(this.id, employee.id);
    }

    /**
     *
     * @return hashCode ein Employee Objekt
     */
    @Override
    public int hashCode() {
        return Objects.hash( this.createdAt,this.firstName, this.lastName, this.jobTitle, this.startedAt, this.leftAt, this.email,this.id);
    }

    /**
     *
     * @return das Employee Objekt als String in Json Format
     */
    @Override
    public String toString() {
        return "Employee{" + "createdAt=" + this.createdAt
                + ", firstName='" + this.firstName
                + '\'' + ", lastName='" + this.lastName
                + '\'' + ", jobTitle='" + this.jobTitle
                + '\'' + ", startedAt'" + this.startedAt
                + '\'' + ", leftAt'" + this.leftAt
                + '\'' + ", email'" + this.email
                +'\'' + ", id'" + this.id + '}';
    }

}
