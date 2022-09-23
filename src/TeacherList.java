import java.util.ArrayList;
import java.util.List;

public class TeacherList {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher(10001, "小山", "Java"));
        teacherList.add(new Teacher(10002, "田中", "Python"));
        teacherList.add(new Teacher(10003, "佐藤", "Kotlin"));
        
        System.out.println("TeacherList");
        System.out.println("------------------------------------------------");
        System.out.printf("%-18s %-20s %-10s \n", "ID", "Name", "Course");
        System.out.println("------------------------------------------------");
        
        for (Teacher teacher : teacherList) {
            System.out.format("%-15d %-20s %-10s \n", teacher.getId(), teacher.getTeacherName(), teacher.getCourse());
        }
        
        System.out.println("------------------------------------------------");
        System.out.println();
        
        System.out.println("Q&A");
        System.out.println("------------------------------------------------");
        System.out.println("Q1.小山さんはTeacherListに存在しますか？");
        
        boolean koyamaExists = false;
        
        for (Teacher teacher : teacherList) {
            if (("小山").equals(teacher.getTeacherName())) {
                koyamaExists = true;
                break;
            }
        }
        
        if (koyamaExists) {
            System.out.println("A1.小山さんはTeacherListに存在します。");
        } else {
            System.out.println("A1.小山さんはTeacherListに存在しません。");
        }
        
        System.out.println();
        System.out.println("Q2.鈴木さんはTeacherListに存在しますか？");
        
        boolean suzukiExists = teacherList.stream().anyMatch(t -> t.getTeacherName().equals("鈴木"));
        
        if (suzukiExists) {
            System.out.println("A1.鈴木さんはTeacherListに存在します。");
        } else {
            System.out.println("A1.鈴木さんはTeacherListに存在しません。");
        }
        
        System.out.println("------------------------------------------------");
        System.out.println();
        
        //意図的な例外を発生
        System.out.println("例外");
        System.out.println("------------------------------------------------");
        System.out.println("ID：10004の先生を表示してください。");
        
        try {
            for (Teacher teacher : teacherList) {
                if (10004 == teacher.getId()) {
                    System.out.println(teacher.getTeacherName());
                    break;
                } else {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            System.out.println("存在しません。");
        }
        
        System.out.println("------------------------------------------------");
    }
}
