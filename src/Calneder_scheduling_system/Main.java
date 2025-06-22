package Calneder_scheduling_system;

import java.time.LocalDateTime;

public class Main {
    public static void main(String args[]){
        CalendarService service = new InMemoryCalendarService();

        String personId = "user1";
        Meeting m1 = new Meeting("M1", "Standup", personId,
                LocalDateTime.of(2025, 6, 23, 10, 0),
                LocalDateTime.of(2025, 6, 23, 10, 30),
                "Daily sync");

        Meeting m2 = new Meeting("M2", "Demo", personId,
                LocalDateTime.of(2025, 6, 23, 10, 15),
                LocalDateTime.of(2025, 6, 23, 11, 0),
                "Client demo");

        service.addMeeting(m1);  // ✅ should succeed
        service.addMeeting(m2);  // ❌ conflict with m1

        System.out.println("Meetings for user1:");
        for (Meeting m : service.viewMeetings(personId)) {
            System.out.println(m.getTitle() + " - " + m.getStartTime());
        }

        service.removeMeeting("M1");
        System.out.println("After deletion:");
        for (Meeting m : service.viewMeetings(personId)) {
            System.out.println(m.getTitle());
        }
    }
}
