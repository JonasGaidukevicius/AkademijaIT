import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class SocialNetworkImpl implements SocialNetwork {

    List<Friend> friendList = new ArrayList<>();
    private final static Logger logger = LoggerFactory.getLogger(SocialNetworkImpl.class);

    @Override
    public void addFriend(Friend friend) {
        if (friend == null || friend.getFirstName() == null || friend.getFirstName().equals("") || friend.getLastName() == null || friend.getLastName().equals("")){
            logger.info("Provided argument is null or empty");
            throw new IllegalArgumentException("Provided argument is null or empty");
        }

        if (this.friendList != null){
            boolean isFriendAlreadyInList = this.friendList.contains(friend);
            if(!isFriendAlreadyInList){
                friendList.add(friend);
            } else {
                logger.info("Such friend already is in friends list");
            }
        }
    }

    @Override
    public int getNumberOfFriends() {
        return this.friendList.size();
    }

    @Override
    public Friend findFriend(String s, String s1) throws FriendNotFoundException {
        Friend foundFriend = null;
        if(s == null || s1 == null){
            logger.info("No argument provided");
            throw new IllegalArgumentException ("No argument provided");
        }
        if(friendList != null){
            for (Friend currentFriend: this.friendList) {
                if(currentFriend.getFirstName().equals(s) && currentFriend.getLastName().equals(s1)){
                    foundFriend = currentFriend;
                }

            }
            if(foundFriend == null){
                logger.info("There is no such friend: " + s + " " + s1);
                throw new FriendNotFoundException(s, s1);
            }
        }
        return foundFriend;
    }

    @Override
    public Collection<Friend> findByCity(String s) {

        if(s == null){
            logger.info("No argument provided");
            throw new IllegalArgumentException ("No argument provided");
        }

        return friendList.stream().filter(friend -> friend.getCity().equals(s)).collect(Collectors.toList());
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
        return friendList.stream()
                .sorted(Comparator.comparing(Friend::getFirstName))
                .sorted(Comparator.comparing(Friend::getLastName))
                .sorted(Comparator.comparing(Friend::getCity))
                .collect(Collectors.toList());
    }
}
