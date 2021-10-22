package com.example.mybatistest1.entity;

public class Website {
    private int emp_id;
    private String emp_name;
    private String gender;
    private int email;
    private String d_id;

    public int getEmp_id(){
        return emp_id;
    }
    public void setEmp_id(){
        this.emp_id = emp_id;
    }
    public String  getEmp_name(){
        return emp_name;
    }
    public void setEmp_name(){
        this.emp_name = emp_name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(){
        this.gender = gender;
    }
    public int getEmail(){
        return email;
    }
    public void setEmail(){
        this.email =email;
    }
    public String getD_id(){
        return d_id;
    }
    public void setD_id(){
        this.d_id= d_id;
    }
    @Override
    public String toString() {
        return "WebSite{" +
                "name=" + emp_id +
                ", url='" + gender + '\'' +
                ", Alexa='" + email + '\'' +
                ",country=" + d_id + '\'' +
                '}';
    }
}
