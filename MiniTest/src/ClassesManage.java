import java.util.ArrayList;
import java.util.Scanner;

public class ClassesManage{

    Scanner sc = new Scanner(System.in);
    Classes classes = new Classes();
    ArrayList<Classes> listClasses = new ArrayList<>();
    public void addClasses () {
        System.out.println("Enter ID: ");
        classes.setId(sc.nextInt());
        System.out.println("Enter class name: ");
        classes.setName(sc.next());
        listClasses.add(classes);
    }
    public void replaceClasses () {
        System.out.println("Enter id need change: ");
        int newID = sc.nextInt();
        for (Classes listClass : listClasses) {
            if (newID == listClass.getId()) {
                System.out.println("Enter name change: ");
              listClass.setName(sc.next());
                break;
            }
        }
    }

}
