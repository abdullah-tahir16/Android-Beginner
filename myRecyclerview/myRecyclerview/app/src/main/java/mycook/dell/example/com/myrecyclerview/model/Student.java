package mycook.dell.example.com.myrecyclerview.model;

/**
 * Created by DELL on 8/6/2017.
 */

public class Student {
    private String username;
    private String course;

    public Student(String username, String course) {
        this.username = username;
        this.course = course;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
