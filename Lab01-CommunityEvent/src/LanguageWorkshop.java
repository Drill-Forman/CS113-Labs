public class LanguageWorkshop extends CommunityEvent {
    public String language;

    public LanguageWorkshop(String eventName, String eventDate, String eventDescription, String language) {
        super(eventName, eventDate, eventDescription);
        this.language = language;
    }

    @Override
    public void celebrateEvent() {
        System.out.println("Promoting language diversity by teaching " + language + " at the " + eventName + " workshop.");
    }
}