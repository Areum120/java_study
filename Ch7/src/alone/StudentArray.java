package alone;

public class StudentArray {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student(1001, "James");
        students[1] = new Student(1002, "Tomas");
        students[2] = new Student(1003, "Edward");

        for(int i = 0; i<students.length; i++){
            students[i].studentShowInfo();//println 안해도 됨
        }
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i]);//인스턴스 주소 값
        }

    }


}
