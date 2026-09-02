public class CulturalFestival extends CommunityEvent {

    public CulturalFestival(String eventName, String eventDate, String eventDescription) {
        super(eventName, eventDate, eventDescription);
    }

    @Override
    public void celebrateEvent() {
        System.out.println("Celebrating " + eventName + " with lively music, traditional dance, and delicious food!");
    }
}