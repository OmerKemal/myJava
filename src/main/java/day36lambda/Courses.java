package day36lambda;


        /*
        If a class has;
                i) private variables
                ii) constructor with all parameters
                iii) constructor without any parameters
                iv) All getters and setters
                v) toString method
         then it is called "POJO CLASS"
         POJO stands for "PLAIN OLD JAVA OBJECT"
         */


public class Courses {

    private String courseName;
    private int numOfStudents;
    private String season;
    private double avgScore;

    public Courses(String courseName, int numOfStudents, String season, double avgScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.avgScore = avgScore;
    }

    public Courses() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}
