public class CulturalHub {
    public String hubName;
    private CommunityEvent[] events;
    private int eventCount;

    // Constructor: Initializes the event array
    public CulturalHub(String hubName, int capacity) {
        this.hubName = hubName;
        this.events = new CommunityEvent[capacity];
        this.eventCount = 0;
    }

    // Adds an event if space is available
    public void addEvent(CommunityEvent event) {
        if (eventCount < events.length) {
            events[eventCount] = event;
            eventCount++;
        } else {
            System.out.println("Cultural Hub capacity reached. Cannot add " + event.eventName);
        }
    }

    // Prints details of all stored events
    public void listEvents() {
        System.out.println("\n--- " + hubName + " Scheduled Events ---");
        for (int i = 0; i < eventCount; i++) {
            System.out.println(events[i].getEventDetails());
        }
    }
}