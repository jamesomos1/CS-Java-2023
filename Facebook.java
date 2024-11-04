import java.util.ArrayList;
import java.util.List;

class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class Profile {
    private Name profileName;
    private String status;
    private List<Profile> friends;

    public Profile(Name profileName, String status) {
        this.profileName = profileName;
        this.status = status;
        this.friends = new ArrayList<>();
    }

    public Name getProfileName() {
        return profileName;
    }

    public String getStatus() {
        return status;
    }

    public List<Profile> getFriends() {
        return friends;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addFriend(Profile friendProfile) {
        friends.add(friendProfile);
    }

    public void removeFriend(Profile friendProfile) {
        friends.remove(friendProfile);
    }

    public void display() {
        System.out.println("Profile Name: " + profileName.getFirstName() + " " + profileName.getLastName());
        System.out.println("Status: " + status);
        System.out.println("Friends:");
        for (Profile friend : friends) {
            System.out.println("- " + friend.getProfileName().getFirstName() + " " + friend.getProfileName().getLastName());
        }
        System.out.println();
    }
}

class ProfileManager {
    private List<Profile> allProfiles;

    public ProfileManager() {
        this.allProfiles = new ArrayList<>();
    }

    public List<Profile> getAllProfiles() {
        return allProfiles;
    }

    public void addProfile(Profile profile) {
        allProfiles.add(profile);
    }

    public void removeProfile(Profile profile) {
        allProfiles.remove(profile);
    }

    public void createFriendship(Profile profile1, Profile profile2) {
        profile1.addFriend(profile2);
        profile2.addFriend(profile1);
    }

    public void endFriendship(Profile profile1, Profile profile2) {
        profile1.removeFriend(profile2);
        profile2.removeFriend(profile1);
    }

    public void displayAllProfiles() {
        System.out.println("All Profiles:");
        for (Profile profile : allProfiles) {
            profile.display();
        }
    }
}

public class Facebook {
    public static void main(String[] args) {
        ProfileManager manager = new ProfileManager();

        // Creating profiles
        Name name1 = new Name("John", "Doe");
        Profile profile1 = new Profile(name1, "Hello, I'm John!");
        Name name2 = new Name("Jane", "Smith");
        Profile profile2 = new Profile(name2, "Nice to meet you!");

        manager.addProfile(profile1);
        manager.addProfile(profile2);

        // Creating friendships
        manager.createFriendship(profile1, profile2);

        // Displaying profiles and profile manager info
        manager.displayAllProfiles();

        // Ending friendship
        manager.endFriendship(profile1, profile2);

        // Removing profiles
        manager.removeProfile(profile1);
        manager.removeProfile(profile2);

        // Displaying updated profiles and profile manager info
        manager.displayAllProfiles();
    }
}