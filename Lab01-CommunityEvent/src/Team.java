public class Team {
    private VolunteerEvent[] volunteerEvents;
    private int eventCount;

    // Constructor: Initializes the array with a given size
    public Team(int capacity) {
        this.volunteerEvents = new VolunteerEvent[capacity];
        this.eventCount = 0;
    }

    // Adds a volunteer event if space is available
    public void addVolunteerEvent(VolunteerEvent event) {
        if (eventCount < volunteerEvents.length) {
            volunteerEvents[eventCount] = event;
            eventCount++;
        } else {
            System.out.println("Team event capacity reached. Cannot add " + event.eventName);
        }
    }

    // Prints details of all stored volunteer events
    public void listVolunteerEvents() {
        System.out.println("\n--- Team Volunteer Events ---");
        for (int i = 0; i < eventCount; i++) {
            System.out.println(volunteerEvents[i].getEventDetails());
        }
    }
}