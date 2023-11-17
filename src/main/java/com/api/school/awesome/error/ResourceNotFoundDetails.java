package com.api.school.awesome.error;

public class ResourceNotFoundDetails {
    private String title;
    private int status;
    private String details;
    private long timestamp;
    private String developerMessage;

    public ResourceNotFoundDetails() {
    }

    public ResourceNotFoundDetails(String title, int status, String details, long timestamp, String developerMessage) {
        this.title = title;
        this.status = status;
        this.details = details;
        this.timestamp = timestamp;
        this.developerMessage = developerMessage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }
}
