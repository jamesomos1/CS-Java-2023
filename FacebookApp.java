import java.util.ArrayList;
import java.util.List;

class Name 
{
    private String fName;
    private String lName;
    
    public Name(String fName, String lName) 
    {
        this.fName = fName;
        this.lName = lName;
    }
    
    public String getFirstName() 
    {
        return fName;
    }
    
    public void setFirstName(String fName) 
    {
        this.fName = fName;
    }
    
    public String getLastName() 
    {
        return lName;
    }
    
    public void setLastName(String lName) 
    {
        this.lName = lName;
    }
}

class Profile 
{
    private Name profileName;
    private String status;
    private List<Profile> friends;
    
    public Profile(String fName, String lName, String status) 
    {
        this.profileName = new Name(fName, lName);
        this.status = status;
        this.friends = new ArrayList<>();
    }
    
    public Name getProfileName() 
    {
        return profileName;
    }
    
    public void setProfileName(String fName, String lName) 
    {
        this.profileName = new Name(fName, lName);
    }
    
    public String getStatus() 
    {
        return status;
    }
    
    public void setStatus(String status) 
    {
        this.status = status;
    }
    
    public List<Profile> getFriends() 
    {
        return friends;
    }
    
    public void addFriend(Profile friend) 
    {
        friends.add(friend);
    }
    
    public void removeFriend(Profile friend) 
    {
        friends.remove(friend);
    }
    
    public void display() 
    {
        System.out.println("Name: " + profileName.getFirstName() + " " + profileName.getLastName());
        System.out.println("Status: " + status);
        System.out.println("Friends: ");
        for (Profile friend : friends)
        {
            System.out.println(friend.getProfileName().getFirstName() + " " + friend.getProfileName().getLastName());
        }
    }
}

class ProfileManager 
{
    private List<Profile> aProfile;
    
    public ProfileManager() 
    {
        this.aProfile = new ArrayList<>();
    }
    
    public void addProfile(Profile profile) 
    {
        aProfile.add(profile);
    }
    
    public void removeProfile(Profile profile) 
    {
        aProfile.remove(profile);
    }
    
    public void createFriendship(Profile profile1, Profile profile2) 
    {
        profile1.addFriend(profile2);
        profile2.addFriend(profile1);
    }
    
    public void endFriendship(Profile profile1, Profile profile2) 
    {
        profile1.removeFriend(profile2);
        profile2.removeFriend(profile1);
    }
    
    public void displayProfiles() 
    {
        for (Profile profile : aProfile)
         {
            profile.display();
            System.out.println();
        }
    }
}

public class FacebookApp 
{
    public static void main(String[] args)
    {

        System.out.println("Creating profiles and adding friendships...");

        ProfileManager profileManager = new ProfileManager();
        
        Profile profile1 = new Profile("Kanye", "West", "I love fashion and music!!");
        Profile profile2 = new Profile("Will", "Smith", "Famous Actor and Entertainer");
        Profile profile3 = new Profile("LeBron", "James", "The Greatest Basketball Player Ever");
        
        profileManager.addProfile(profile1);
        profileManager.addProfile(profile2);
        profileManager.addProfile(profile3);
        
        profileManager.createFriendship(profile1, profile2);
        profileManager.createFriendship(profile2, profile3);
        
        profileManager.displayProfiles();
        
        profileManager.endFriendship(profile1, profile2);
        
        profileManager.removeProfile(profile3);
        
        profileManager.displayProfiles();
    }
}
