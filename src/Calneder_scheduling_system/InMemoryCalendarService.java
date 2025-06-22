package Calneder_scheduling_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryCalendarService implements CalendarService{
    private final Map<String, List<Meeting>> userMeetings = new HashMap<>();

    @Override
    public boolean addMeeting(Meeting meeting) {
        if (meeting.getStartTime().isAfter(meeting.getEndTime())) return false;

        userMeetings.putIfAbsent(meeting.getPersonId(), new ArrayList<>());
        List<Meeting> meetings = userMeetings.get(meeting.getPersonId());

        for (Meeting m : meetings) {
            if (overlaps(m, meeting)) return false; // conflict
        }

        meetings.add(meeting);
        return true;
    }

    @Override
    public boolean removeMeeting(String meetingId) {
        for (List<Meeting> meetings : userMeetings.values()) {
            meetings.removeIf(m -> m.getMeetingId().equals(meetingId));
        }
        return true;
    }

    @Override
    public List<Meeting> viewMeetings(String personId) {
        return userMeetings.getOrDefault(personId, new ArrayList<>());
    }

    private boolean overlaps(Meeting a, Meeting b) {
        return a.getStartTime().isBefore(b.getEndTime()) && b.getStartTime().isBefore(a.getEndTime());
    }
}
