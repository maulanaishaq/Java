package java_collection;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Maulana");

        person.addHoby("Game");
        person.addHoby("Football");

        doSomethingWithHobbies(person.getHobbies());


        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan hobi saya");
    }



}
