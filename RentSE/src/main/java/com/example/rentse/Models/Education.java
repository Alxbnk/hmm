package com.example.rentse.Models;

public class Education {

    private enum edu {
        TOEMRERE, SNEDKERE, MURER, MALER, JORDBETON, TAG, ELEKTRIKKER, SMED, VVS
    }

    private int idEdu;
    private edu education;
    private String name;
    private String description;
    private String time;

    public Education() {
    }

    public Education(int idEdu, edu education, String name, String description, String time) {
        this.idEdu = idEdu;
        this.education = education;
        this.name = name;
        this.description = description;
        this.time = time;
    }

    public int getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(int idEdu) {
        this.idEdu = idEdu;
    }

    public edu getEducation() {
        return education;
    }

    public void setEducation(edu education) {
        this.education = education;
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
        return "Education{" +
                "idEdu=" + idEdu +
                ", education=" + education +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
