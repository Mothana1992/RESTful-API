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
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.createdAt, employee.createdAt) && Objects.equals(this.firstName, employee.firstName) && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.jobTitle, employee.jobTitle) && Objects.equals(this.startedAt, employee.startedAt) && Objects.equals(this.leftAt, employee.leftAt) && Objects.equals(this.email, employee.email) && Objects.equals(this.id, employee.id);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.jobTitle);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + ", role='" + this.jobTitle + '\'' + '}';
    }

}
