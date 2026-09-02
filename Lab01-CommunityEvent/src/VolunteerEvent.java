public class VolunteerEvent extends CommunityEvent {

    public VolunteerEvent(String eventName, String eventDate, String eventDescription) {
        super(eventName, eventDate, eventDescription);
    }

    @Override
    public void celebrateEvent() {
        System.out.println("Making an impact at " + eventName + " through community service and volunteer efforts!");
    }
}