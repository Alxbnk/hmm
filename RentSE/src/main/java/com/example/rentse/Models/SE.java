package com.example.rentse.Models;

import java.util.ArrayList;

public class SE {

    private int idSE;
    private String userName;
    private String password;
    private String name;
    private int age;
    private int startWage;
    private String description;
    private ArrayList<Education> education;
    private ArrayList<FJob> fJobs;

    public SE() {
    }

    public SE(int idSE, String userName, String password, String name, int age, int startWage, String description, ArrayList<Education> education, ArrayList<FJob> fJobs) {
        this.idSE = idSE;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.startWage = startWage;
        this.description = description;
        this.education = education;
        this.fJobs = fJobs;
    }

    public SE(int idSE, String userName, String password, String name, int age, int startWage, String description) {
        this.idSE = idSE;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.startWage = startWage;
        this.description = description;
    }

    public int getIdSE() {
        return idSE;
    }

    public void setIdSE(int idSE) {
        this.idSE = idSE;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStartWage() {
        return startWage;
    }

    public void setStartWage(int startWage) {
        this.startWage = startWage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public ArrayList<FJob> getfJobs() {
        return fJobs;
    }

    public void setfJobs(ArrayList<FJob> fJobs) {
        this.fJobs = fJobs;
    }

    @Override
    public String toString() {
        return "SE{" +
                "idSE=" + idSE +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", startWage=" + startWage +
                ", description='" + description + '\'' +
                ", education=" + education +
                ", fJobs=" + fJobs +
                '}';
    }
}
