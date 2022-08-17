public class TouristExperienceInviteGuest {

    private int tourist_experience_invite_guest_id;
    private int tourist_id;
    private int tour_id;
    private String invite_day;
    private String guest_email;

    public TouristExperienceInviteGuest(int tourist_experience_invite_guest_id, int tourist_id, int tour_id, String invite_day, String guest_email){
        this.tourist_experience_invite_guest_id = tourist_experience_invite_guest_id;
        this.tourist_id = tourist_id;
        this. tour_id = tour_id;
        this.invite_day = invite_day;
        this.guest_email = guest_email;
    }
}
