package java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHoby(String hobby){
        hobbies.add(hobby);
    }

    public List<String> getHobbies (){
        //return Collections.unmodifiableList(hobbies);
        return hobbies;
    }

    public String getName(){
        return name;
    }



}
