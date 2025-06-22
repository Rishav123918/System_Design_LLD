package Calneder_scheduling_system;

import java.time.LocalDateTime;

public class Meeting {
    private String meetingId;
    private String title;
    private String personId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;

    public Meeting(String meetingId, String title, String personId, LocalDateTime startTime, LocalDateTime endTime, String description) {
        this.meetingId = meetingId;
        this.title = title;
        this.personId = personId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    // ✅ Getters and Setters
    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
