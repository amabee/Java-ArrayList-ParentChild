package Hospital;
import java.util.*;

public class PatientInfo{
 
    private List<Hospitalinfo> patientList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int pID, pAge,choose;
    static String pName,pDepartment,pStatus,pGender;

    private PatientInfo addPatients() {
        System.out.print("Enter Patient ID: ");
        pID = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Name: ");
        pName = scan.nextLine();
        System.out.print("Enter Age: ");
        pAge = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Gender: ");
        pGender = scan.nextLine();
        System.out.print("Enter Status: ");
        pStatus = scan.nextLine();
        System.out.print("Enter Department: ");
        pDepartment = scan.nextLine();

        Hospitalinfo hospital = new Hospitalinfo(pID, pName, pAge, pGender, pStatus, pDepartment);
        patientList.add(hospital);
        System.out.print("Success\n");
        return hospital; 
    }

    private void PrintPatients(){
        for(Hospitalinfo patients : patientList){
            System.out.print(" ID: " + patients.getID() + "\nPatient Name: " + patients.getName() + "\nPatient Age" + 
            patients.getAge()  + "\nPatient Gender: " + patients.getGender() + "\nPatient Status: " + patients.getStatus()
            + "\nPatient Department: " + patients.getDepartment() + "\n \n");
        }
    }

    private void SearchPatient(){
        System.out.print("Who to search?: ");
        scan.nextLine();
        String nameSearch = scan.nextLine();
        for(Hospitalinfo patients : patientList){
            if(patients.getName().equalsIgnoreCase(nameSearch)){
                System.out.print("Patient Found!");
                System.out.print(" ID: " + patients.getID() + "\nPatient Name: " + patients.getName() + "\nPatient Age: " + 
                patients.getAge()  + "\nPatient Gender: " + patients.getGender() + "\nPatient Status: " + patients.getStatus()
                + "\nPatient Department: " + patients.getDepartment() + "\n \n");
            }
        }
    }

    private void DeletePatient(){
        System.out.print("Enter patient name to be Deleted: ");
        scan.nextLine();
        String nameDelete = scan.nextLine();
        Iterator<Hospitalinfo> itr = patientList.iterator();
        while(itr.hasNext()){
            if(itr.next().getName().equalsIgnoreCase(nameDelete)){
                itr.remove();
                System.out.print("Success!");
                break;
            }
        }
    }

    private void UpdatePatient(){
        System.out.print("What to Update?");
        System.out.print("[1] :: ID \n[2] :: Name \n[3] :: Status");
        scan.nextLine();
        choose = scan.nextInt();
        switch(choose){
            case 1: System.out.print("Enter Patient ID to be Changed!");
            pID = scan.nextInt();
            System.out.print("Enter new ID: ");
            int newpID = scan.nextInt();
            for(Hospitalinfo patients : patientList){
                if(patients.getID() == pID){
                    patients.setID(newpID);
                }
            }
            break;
            
            case 2: System.out.print("Enter Patient Name: ");
            scan.nextLine();
            pName = scan.nextLine();
            System.out.print("Enter New Name: ");
            String newpName = scan.nextLine();
            for(Hospitalinfo patients : patientList){
                if(patients.getName().equalsIgnoreCase(pName)){
                    patients.setName(newpName);
                }
            }
            break;

            case 3: System.out.print("Enter Patient Name: ");
            scan.nextLine();
            pName = scan.nextLine();
            System.out.print("Enter Status Update: ");
            pStatus = scan.nextLine();
            for(Hospitalinfo patients : patientList){
                if(patients.getName().equalsIgnoreCase(pName)){
                    patients.setStatus(pStatus);
                }
            }
            break;
        }
    }
    
    static PatientInfo patientInfo = new PatientInfo();
    
    public static void RunMe(){
        while(choose != 6){   
            System.out.println("[1] :: Add Patients \n[2] :: Show Patient List \n[3] :: Search Patient \n[4] :: Delete Patient Record \n[5] :: Update Patient");
            choose = scan.nextInt();  
            switch(choose){
                case 1: patientInfo.addPatients(); break;
                
                case 2: patientInfo.PrintPatients(); break;

                case 3: patientInfo.SearchPatient(); break;

                case 4: patientInfo.DeletePatient(); break;

                case 5: patientInfo.UpdatePatient(); break;
            }
        }
    }
}
