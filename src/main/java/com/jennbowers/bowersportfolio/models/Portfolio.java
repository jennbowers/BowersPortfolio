package com.jennbowers.bowersportfolio.models;

public class Portfolio {
    private long id;
    private String photoUrl;
    private String githubPagesUrl;
    private String githubUrl;
    private String title;
    private String description;
    private String date;
    private String technologiesUsed;
    private String language;

    public Portfolio(long id, String photoUrl, String githubPagesUrl, String githubUrl, String title, String description, String date, String technologiesUsed, String language) {
        this.id = id;
        this.photoUrl = photoUrl;
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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
