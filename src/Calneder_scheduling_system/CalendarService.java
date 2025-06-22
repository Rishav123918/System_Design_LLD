package Calneder_scheduling_system;

import java.util.List;

public interface CalendarService {
    boolean addMeeting(Meeting meeting);
    boolean removeMeeting(String meetingId);
    List<Meeting> viewMeetings(String personId);
}
