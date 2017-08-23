package com.jennbowers.bowersportfolio.models;

public class Portfolio {
    private long id;
    private String photoUrl1;
    private String photoUrl2;
    private String photoUrl3;
    private String photoUrl4;
    private String githubPagesUrl;
    private String githubUrl;
    private String title;
    private String description;
    private String date;
    private String technologiesUsed;
    private String language;

    public Portfolio(long id, String photoUrl1, String photoUrl2, String photoUrl3, String photoUrl4, String githubPagesUrl, String githubUrl, String title, String description, String date, String technologiesUsed, String language) {
        this.id = id;
        this.photoUrl1 = photoUrl1;
        this.photoUrl2 = photoUrl2;
        this.photoUrl3 = photoUrl3;
        this.photoUrl4 = photoUrl4;
        this.githubPagesUrl = githubPagesUrl;
        this.githubUrl = githubUrl;
        this.title = title;
        this.description = description;
        this.date = date;
        this.technologiesUsed = technologiesUsed;
        this.language = language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhotoUrl1() {
        return photoUrl1;
    }

    public void setPhotoUrl1(String photoUrl1) {
        this.photoUrl1 = photoUrl1;
    }

    public String getPhotoUrl2() {
        return photoUrl2;
    }

    public void setPhotoUrl2(String photoUrl2) {
        this.photoUrl2 = photoUrl2;
    }

    public String getPhotoUrl3() {
        return photoUrl3;
    }

    public void setPhotoUrl3(String photoUrl3) {
        this.photoUrl3 = photoUrl3;
    }

    public String getPhotoUrl4() {
        return photoUrl4;
    }

    public void setPhotoUrl4(String photoUrl4) {
        this.photoUrl4 = photoUrl4;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getGithubPagesUrl() {
        return githubPagesUrl;
    }

    public void setGithubPagesUrl(String githubPagesUrl) {
        this.githubPagesUrl = githubPagesUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTechnologiesUsed() {
        return technologiesUsed;
    }

    public void setTechnologiesUsed(String technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
