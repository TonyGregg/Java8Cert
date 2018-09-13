package org.genil.learning.java8.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 7/9/2018 4:55 PM
 **/
public class UserProfile {
    @Override
    public String toString() {
        return "UserProfile{" +
                "lastName='" + lastName + '\'' +
                "Email count='" + emailCount + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //Test
        UserProfile userProfile1 = new UserProfile();
        userProfile1.setEmailCount(30);
        userProfile1.setLastName("Ben");

        UserProfile userProfile2 = new UserProfile();
        userProfile2.setEmailCount(10);
        userProfile2.setLastName("Dar");


        UserProfile userProfile3 = new UserProfile();
        userProfile3.setEmailCount(20);
        userProfile3.setLastName("Greg");

        List<UserProfile> userProfileList = new ArrayList<>();

        userProfileList.add(userProfile1);
        userProfileList.add(userProfile2);
        userProfileList.add(userProfile3);

        // Sort by emp  last name



//        Collections.sort(userProfileList,new UserProfileComparator());
//
//        // Sort by the email count default
        for (UserProfile userProfile: userProfileList) {
            System.out.println(userProfile);
        }







    }
    public int getEmailCount() {
        return emailCount;
    }

    public void setEmailCount(int emailCount) {
        this.emailCount = emailCount;
    }

    public int getPhoneCount() {
        return phoneCount;
    }

    public void setPhoneCount(int phoneCount) {
        this.phoneCount = phoneCount;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int emailCount;
    private int phoneCount;
    private String lastName;



}
