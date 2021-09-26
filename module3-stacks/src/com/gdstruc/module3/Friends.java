package com.gdstruc.module3;

import java.util.Objects;

public class Friends { //simple Friends class
    private int friendCount;
    private String friendName;
    private int yearsKnown;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friends friends = (Friends) o;
        return friendCount == friends.friendCount &&
                yearsKnown == friends.yearsKnown &&
                Objects.equals(friendName, friends.friendName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(friendCount, friendName, yearsKnown);
    }

    @Override
    public String toString() {
        return "Friends{" +
                "Friend Count=" + friendCount +
                ", Friend's Name='" + friendName + '\'' +
                ", Years Known=" + yearsKnown +
                '}';
    }

    public Friends(int friendCount, String friendName, int yearsKnown) {
        this.friendCount = friendCount;
        this.friendName = friendName;
        this.yearsKnown = yearsKnown;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public int getYearsKnown() {
        return yearsKnown;
    }

    public void setYearsKnown(int yearsKnown) {
        this.yearsKnown = yearsKnown;
    }
}
