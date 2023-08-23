import java.util.*;

public class StudentManage {

    Student student = new Student();
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> listStudent = new ArrayList<>();
    public void addStudent(String classes) {
        System.out.println("Enter number of student you need add: ");
        int size = sc.nextInt()+ listStudent.size();
        for (int i = listStudent.size()+1; i <= size; i++) {
            student.setId(i);
            System.out.println("Enter student name: ");
            student.setName(sc.next());
            System.out.println("Enter age: ");
            student.setAge(sc.nextInt());
            System.out.println("Enter gender: ");
            student.setGender(sc.next());
            System.out.println("Enter AvrPoint: ");
            student.setAvgPoint(sc.nextInt());
            Student student1 = new Student(
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getGender(),
                    student.getAvgPoint(),
                    classes);
            listStudent.add(student1);
        }
    }

    public void replaceStudent() {
        System.out.println("Enter id need change: ");
        int newID = sc.nextInt();
        for (Student listStudent : listStudent
        )
            if (newID == listStudent.getId()) {
                System.out.println("Enter name change: ");
                listStudent.setName(sc.next());
                System.out.println("Enter age change: ");
                student.setAge(sc.nextInt());
                System.out.println("Enter gender change: ");
                student.setGender(sc.next());
                System.out.println("Enter AvrPoint change: ");
                student.setAvgPoint(sc.nextInt());
                break;
            }
    }

    public void removeStudent() {
        System.out.println("Enter student's id need remove: ");
        int id = sc.nextInt();
        for (int i = 0; i < listStudent.size(); i++
        )
            if (id == listStudent.get(i).getId()) {
                listStudent.remove(i);
                break;
            }
    }

    public void sortStudentPoint() {
        listStudent.sort((s1, s2) -> {
            if (s1.getAge() < s2.getAge()) {
                return 1;
            } else {
                if (s1.getAge() == s2.getAge()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

    public void sortStudentAge() {
        listStudent.sort((s1, s2) -> {
            if (s1.getAge() > s2.getAge()) {
                return 1;
            } else {
                if (s1.getAge() == s2.getAge()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }
public void findStudentName () {
    System.out.println("Enter char you need find: ");
    char name = sc.next().charAt(0);
    ArrayList<Student> findStudent = new ArrayList<>();
    for (Student value : listStudent) {
        char[] ch = value.getName().toCharArray();
        for (int j = 0; j < ch.length; j++) {
            if (name == ch[j]) {
                findStudent.add(listStudent.get(j));
            }
        }
    }
for (int i = 0; i < findStudent.size(); i++) {
    System.out.println(findStudent);
    }
}
}
