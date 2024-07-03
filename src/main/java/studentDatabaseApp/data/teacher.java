package main.java.studentDatabaseApp.data;

public class teacher {
    private int teacherid;
    private String className;
    private String course;
    private String teacherFirstName;
    private String teacherLastName;
    private String teacherMiddleName;

    public teacher(int teacherid, String className, String course, String teacherFirstName, String teacherLastName, String teacherMiddleName) {
        this.teacherid = teacherid;
        this.className = className;
        this.course = course;
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.teacherMiddleName = teacherMiddleName;
    }
}
