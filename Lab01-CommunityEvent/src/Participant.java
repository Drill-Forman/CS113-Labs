public class Participant extends AbstractCommunityMember {

    public Participant(String memberName) {
        super(memberName, "Participant");
    }

    @Override
    public void attendEvent() {
        System.out.println(memberName + " (" + memberRole + ") is actively participating in activities and enjoying the event.");
    }
}