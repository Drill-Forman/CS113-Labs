public abstract class CommunityEvent {
    // Attributes
    public String eventName;
    protected String eventDate;
    private String eventDescription;

    // Constructor
    public CommunityEvent(String eventName, String eventDate, String eventDescription) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
    }

    // Getter and Setter for private attribute eventDescription
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    // Public method returning formatted details
    public String getEventDetails() {
        return "Event: " + eventName + " | Date: " + eventDate + " | Description: " + eventDescription;
    }

    // Abstract method to be implemented by subclasses
    public abstract void celebrateEvent();
}