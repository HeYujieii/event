import java.util.ArrayList;
import java.util.Date;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void addAttendee(String attendee) {
        eventAttendees.add(attendee);
    }

    public void removeAttendee(String attendee) {
        eventAttendees.remove(attendee);
    }

    public void updateAttendee(String oldName, String newName) {
        if (eventAttendees.contains(oldName)) {
            eventAttendees.set(eventAttendees.indexOf(oldName), newName);
        }
    }

    public String findAttendee(String attendee) {
        if (eventAttendees.contains(attendee)) {
            return attendee;
        } else {
            return "Attendee not found";
        }
    }

    public void displayTotalAttendees() {
        System.out.println("Total number of attendees: " + eventAttendees.size());
    }

    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                "\n eventName='" + eventName + '\'' +
                "\n eventVenue='" + eventVenue + '\'' +
                "\n eventDate=" + eventDate +
                "\n eventAttendees=" + eventAttendees +
                '}';
    }

    public static void main(String[] args) {
        Event event = new Event("1", "Party", "Alice'home", new Date());
        event.addAttendee("Alice");
        event.addAttendee("John");
        event.displayTotalAttendees();
        System.out.println(event);
    }
}