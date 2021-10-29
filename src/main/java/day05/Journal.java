package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> names = new ArrayList<>();

    public void addName(String name){
        this.names.add(name);
    }

    public List<String> getNames() {
        return names;
    }

    public boolean addStudent(String studentName){
        if(studentName.indexOf(" ") > 0){
           this.addName(studentName);
           return true;
        }else {
            return false;
        }
    }
}
