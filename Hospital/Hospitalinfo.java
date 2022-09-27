package Hospital;

public class Hospitalinfo extends PatientInfo{
    private int id,age;
    private String name,gender,status,department;

    public Hospitalinfo(int pID, String pName, int pAge, String pGender, String pStatus, String pDepartment){
        this.id = pID;
        this.name = pName;
        this.age = pAge;
        this.gender = pGender;
        this.status = pStatus;
        this.department = pDepartment;
    }

    public int setID(int pID){
        this.id = pID;
        return this.id;
    }

    public String setName(String pName){
        this.name = pName;
        return this.name;
    }

    public int setAge(int pAge){
        this.age = pAge;
        return this.age;
    }

    public String setGender(String pGender){
        this.gender = pGender;
        return this.gender;
    }

    public String setStatus(String pStatus){
        this.status = pStatus;
        return this.status;
    }
    
    public String setDepartment(String pDepartment){
        this.department = pDepartment;
        return this.department;
    }
    
    //GETTERS

    public int getID(){
      
        return this.id;
    }

    public String getName(){
        
        return this.name;
    }

    public int getAge(){
       
        return this.age;
    }

    public String getGender(){
        
        return this.gender;
    }

    public String getStatus(){
       
        return this.status;
    }
    
    public String getDepartment(){
       
        return this.department;
    }
}
