public class Volunteer extends AbstractCommunityMember {

    public Volunteer(String memberName) {
        super(memberName, "Volunteer");
    }

    @Override
    public void attendEvent() {
        System.out.println(memberName + " (" + memberRole + ") is setting up equipment and guiding visitors at the event.");
    }
}