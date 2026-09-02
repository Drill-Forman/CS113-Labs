public class Main {
    public static void main(String[] args) {
        System.out.println("=== PART 1 & 2: Testing Event Objects & Polymorphism ===");
        
        // 1. Create event objects
        CulturalFestival festival = new CulturalFestival("Solstice Cultural Fest", "2026-06-21", "Annual music and dance gathering");
        LanguageWorkshop workshop = new LanguageWorkshop("Spanish Basics", "2026-07-10", "Interactive intro language course", "Spanish");
        VolunteerEvent parkCleanup = new VolunteerEvent("River Park Cleanup", "2026-08-05", "Community park restore effort");

        // 2. Demonstrate celebrateEvent()
        festival.celebrateEvent();
        workshop.celebrateEvent();
        parkCleanup.celebrateEvent();

        System.out.println("\n=== PART 3: Testing Team Aggregation ===");
        // 3. Create and test Team
        Team volunteerTeam = new Team(3);
        volunteerTeam.addVolunteerEvent(parkCleanup);
        volunteerTeam.addVolunteerEvent(new VolunteerEvent("Beach Cleanup", "2026-09-12", "Coastal preservation project"));
        volunteerTeam.listVolunteerEvents();

        System.out.println("\n=== PART 4: Testing CulturalHub Composition ===");
        // 4. Create and test CulturalHub
        CulturalHub hub = new CulturalHub("Oceanside Cultural Center", 5);
        hub.addEvent(festival);
        hub.addEvent(workshop);
        hub.addEvent(parkCleanup);
        hub.listEvents();

        System.out.println("\n=== PART 5: Testing Member Polymorphism ===");
        // 5. Instantiate Volunteer and Participant objects
        Volunteer volunteer = new Volunteer("Alex");
        Participant participant = new Participant("Jordan");

        volunteer.attendEvent();
        participant.attendEvent();
    }
}