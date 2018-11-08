import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;
import java.util.stream.Collectors;

public class SocialNetworkImpl implements SocialNetwork {

    List<Friend> friendList = new ArrayList<>();

    @Override
    public void addFriend(Friend friend) {
        if (friend == null || friend.getFirstName() == null || friend.getFirstName().equals("") || friend.getLastName() == null || friend.getLastName().equals("")){
            throw new IllegalArgumentException("Provided argument is null or empty");
        }

        if (this.friendList != null){
            boolean isFriendAlreadyInList = this.friendList.contains(friend);
            if(!isFriendAlreadyInList){
                friendList.add(friend);
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
            throw new IllegalArgumentException ("No argument provided");
        }
        if(friendList != null){
            for (Friend currentFriend: this.friendList) {
                if(currentFriend.getFirstName().equals(s) && currentFriend.getLastName().equals(s1)){
                    foundFriend = currentFriend;
                }

            }
            if(foundFriend == null){
                throw new FriendNotFoundException(s, s1);
            }
        }
        return foundFriend;
    }

    @Override
    public Collection<Friend> findByCity(String s) {

        if(s == null){
            throw new IllegalArgumentException ("No argument provided");
        }



        /*if(friendList != null){
            for (Friend currentFriend: this.friendList) {
                if(currentFriend.getCity().equals(s)){
                    friendInCity.add(currentFriend);
                }
                //friendInCity.add(currentFriend);
            }
        }*/

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
