package Module1.class16;

import java.util.*;

class UserProfile {
    private String username;
    private String bio;
    private Set<UserProfile> followers;

    public UserProfile(String username, String bio) {
        this.username = username;
        this.bio = bio;
        this.followers = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public void follow(UserProfile user) {
        followers.add(user);
    }

    public void unfollow(UserProfile user) {
        followers.remove(user);
    }

    public Set<UserProfile> getFollowers() {
        return followers;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "username='" + username + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}

class FollowerSystem {
    private Map<String, UserProfile> userProfiles;

    public FollowerSystem() {
        userProfiles = new HashMap<>();
    }

    public void createUserProfile(String username, String bio) {
        UserProfile userProfile = new UserProfile(username, bio);
        userProfiles.put(username, userProfile);
    }

    public UserProfile getUserProfile(String username) {
        return userProfiles.get(username);
    }

    public void followUser(String followerUsername, String followedUsername) {
        UserProfile follower = getUserProfile(followerUsername);
        UserProfile followed = getUserProfile(followedUsername);

        if (follower != null && followed != null) {
            follower.follow(followed);
        }
    }

    public void unfollowUser(String followerUsername, String followedUsername) {
        UserProfile follower = getUserProfile(followerUsername);
        UserProfile followed = getUserProfile(followedUsername);

        if (follower != null && followed != null) {
            follower.unfollow(followed);
        }
    }
}

public class SocialMediaApp9 {
    public static void main(String[] args) {
        FollowerSystem followerSystem = new FollowerSystem();

        followerSystem.createUserProfile("alice", "Nature lover");
        followerSystem.createUserProfile("bob", "Tech enthusiast");
        followerSystem.createUserProfile("carol", "Foodie");

        followerSystem.followUser("alice", "bob");
        followerSystem.followUser("carol", "alice");

        UserProfile aliceProfile = followerSystem.getUserProfile("alice");
        UserProfile bobProfile = followerSystem.getUserProfile("bob");
        UserProfile carolProfile = followerSystem.getUserProfile("carol");

        System.out.println("Followers of Alice: " + aliceProfile.getFollowers());
        System.out.println("Followers of Bob: " + bobProfile.getFollowers());
        System.out.println("Followers of Carol: " + carolProfile.getFollowers());

        followerSystem.unfollowUser("alice", "bob");

        System.out.println("Updated followers of Alice: " + aliceProfile.getFollowers());
    }
}
