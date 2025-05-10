package db;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class dbConnection {
    private static dbConnection instance;

    List<Student> studentList;

    private dbConnection(){
        studentList = new ArrayList<>();
        studentList.add(new Student("s001","kesh","kesh@gmail.com","0775486816","kelaniya","123"));
        studentList.add(new Student("s002","kesh1","kesh1@gmail.com","0775486816","kelaniya","123"));
        studentList.add(new Student("s003","kesh2","kesh2@gmail.com","0775486816","kelaniya","123"));
        studentList.add(new Student("s004","kesh3","kesh3@gmail.com","0775486816","kelaniya","123"));

    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public static dbConnection getInstance(){
        return instance == null ? instance = new dbConnection():instance;
    }

}
