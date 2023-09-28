package java_collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }


    public static void main(String[] args) {

        Set<Gender> genders = EnumSet.allOf(Gender.class);
        Set<Gender> male = EnumSet.of(Gender.MALE);

        for (var gender : male){
            System.out.println(gender);
        }




    }
}
