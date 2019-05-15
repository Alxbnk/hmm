package com.example.rentse.Models;

public class FJob {

    private int idFJob;
    private String name;
    private String description;
    private String time;

    public FJob() {
    }

    public FJob(int idFJob, String name, String description, String time) {
        this.idFJob = idFJob;
        this.name = name;
        this.description = description;
        this.time = time;
    }

    public int getIdFJob() {
        return idFJob;
    }

    public void setIdFJob(int idFJob) {
        this.idFJob = idFJob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "FJobs{" +
                "idFJob=" + idFJob +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
