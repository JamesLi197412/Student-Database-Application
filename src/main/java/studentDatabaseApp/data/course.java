package main.java.studentDatabaseApp.data;

public class course {
    private int courseid;
    private String coursename;
    private int grade;
    private int level;

    public course(int courseid, String coursename, int grade, int level) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.grade = grade;
        this.level = level;
    }

    public int getlevel(){
        return level;
    }

    public int setlevel(){
        return level;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int count(int count){
        count +=1;
        return count;
    }
}
