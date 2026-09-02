public abstract class AbstractCommunityMember {
    public String memberName;
    public String memberRole;

    // Constructor: Initializes attributes
    public AbstractCommunityMember(String memberName, String memberRole) {
        this.memberName = memberName;
        this.memberRole = memberRole;
    }

    // Abstract method to be implemented by subclasses
    public abstract void attendEvent();
}