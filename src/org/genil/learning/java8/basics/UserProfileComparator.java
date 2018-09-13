package org.genil.learning.java8.basics;

import java.util.Comparator;

/**
 * Created by anton on 7/9/2018 4:59 PM
 **/
public class UserProfileComparator implements Comparator<UserProfile> {

    @Override
    public int compare(UserProfile o1, UserProfile o2) {
        return o1.getEmailCount()-o2.getEmailCount();
    }
}


