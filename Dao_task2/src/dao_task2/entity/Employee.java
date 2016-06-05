/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_task2.entity;

/**
 *
 * @author Prithivi Raj
 */
public class Employee {
    int id;
    String fname,lname,email;
    String ph,salary;
    boolean status;

    public Employee() {
    }

    public Employee(int id, String fname, String lname, String email, String ph, String salary, boolean status) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.ph = ph;
        this.salary = salary;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
