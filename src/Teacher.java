public class Teacher {
    private int id;
    private String teacherName;
    private String course;
    
    public Teacher(int id, String teacherName, String course) {
        this.id = id;
        this.teacherName = teacherName;
        this.course = course;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTeacherName() {
        return teacherName;
    }
    
    public String getCourse() {
        return course;
    }
    
    @Override
    public String toString() {
        return this.id + this.teacherName + this.course;
    }
}
