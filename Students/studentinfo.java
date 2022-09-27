package Students;
import java.util.*;

public class studentinfo {
    
    private List<School>studentList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int ID,  AGE, COURSEINT,choose;
    static String NAME,  GENDER,  COURSE;

    private School Addstudents(){
        System.out.print("Enter Student ID: ");
        ID = scan.nextInt();
        System.out.print("Enter Student Name: ");
        scan.nextLine();
        NAME = scan.nextLine();
        System.out.print("Enter Student Age: ");
        AGE = scan.nextInt();
        System.out.print("Enter Student Gender: ");
        scan.nextLine();
        GENDER = scan.nextLine();
        System.out.print("Enter Student Course: ");
        COURSEINT = scan.nextInt();
        switch(COURSEINT){
            case 1: COURSE = "BSIT"; break;
            case 2: COURSE = "BSED"; break;
            case 3: COURSE = "CRIMINOLOGY"; break;
        }

        School studentinfo = new School(ID, NAME, AGE, GENDER, COURSE);
        studentList.add(studentinfo);
        System.out.print("SUCCESS!\n");
        return studentinfo;
    }
    
    private void Printing(){
        for(School students : studentList){
            System.out.print("--------------------\n"+"Student ID: " + students.getID()
            + "\nStudent Name: " + students.getNAME()
            + "\nStudent Age: " + students.getAGE()
            + "\nStudent Gender: " + students.getGENDER()
            + "\nStudent Course: " + students.getCOURSE()
            + "\n--------------------\n");
        }
    }

    private void Delete(){
        Printing();
        System.out.print("Enter name to Delete: ");
        scan.nextLine();
        NAME = scan.nextLine();
        
        Iterator<School>itr = studentList.iterator();
        while(itr.hasNext()){
            if(itr.next().getNAME().equalsIgnoreCase(NAME)){
                itr.remove();
                System.out.print("SUCCESS!\n");
            }
        }

    }

    static studentinfo stud = new studentinfo();

    public static void RunMe(){
        while(choose != 4){
            System.out.print("[1] :: Add Student \n[2] :: Show Student List \nOption: ");
            choose = scan.nextInt();
            switch(choose){
                case 1: stud.Addstudents(); break;
                case 2: stud.Printing(); break;
                case 3: stud.Delete(); break;
            }
        }
    }
}
