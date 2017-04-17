package bd.edu.easternuni.easternuniversityupdate.course;

import java.util.ArrayList;

/**
 * Created by SWOPON on 6/10/2016.
 */
public class Course {
    public String Name;
    public String Image;
    public ArrayList<String> semesters = new ArrayList<>();

    public Course(String Name){
        this.Name=Name;
    }

    @Override
    public String toString() {
        return Name;
    }
}
