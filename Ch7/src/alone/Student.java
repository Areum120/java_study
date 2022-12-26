package alone;

public class Student {
    private int studentID;//변수는 private이고 디폴트 생성자는 public으로 꼭 만들어야 하는지?
    private String name;

    public Student(){
        //디폴트 생성자는 꼭 만들어야 하는지?
    }

    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void studentShowInfo(){
        System.out.println( studentID+","+ name);
    }

}
