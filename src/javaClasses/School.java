package javaClasses;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;

//    Constructors
    public School() {
        this.members = new ArrayList<>();
    }
    public School(List<Person> members) {
        this.members = members;
    }

//    Accessor and Mutator
    public List<Person> getMembers() {
        return members;
    }

    public void addMember(Person person) {
        this.members.add(person);
    }

//  Methods
    @Override
    public String toString() {
        return members.toString();
    }

}
