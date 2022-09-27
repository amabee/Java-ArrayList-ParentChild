package Students;

public class School extends studentinfo{
    
    private int id,age;
    private String name,gender,course;

    public School(int ID, String NAME, int AGE, String GENDER, String COURSE){
        this.id = ID;
        this.name = NAME;
        this.age = AGE;
        this.gender = GENDER;
        this.course = COURSE;
    }

    //SETTERS
    public int setID(int ID){
        this.id = ID;
        return this.id;
    }

    public String setNAME(String NAME){
        this.name = NAME;
        return this.name;
    }

    public int setAGE(int AGE){
        this.age = AGE;
        return this.age;
    }

    public String setGENDER(String GENDER){
        this.gender = GENDER;
        return this.gender;
    }

    public String setCOURSE(String COURSE){
        this.course = COURSE;
        return this.course;
    }
    
    //GETTERS

    public int getID(){
        
        return this.id;

    }
    
    public String getNAME(){
    
        return this.name;
    }

    public int getAGE(){
    
        return this.age;
    }

    public String getGENDER(){
    
        return this.gender;
    }

    public String getCOURSE(){
        
        return this.course;
    }
}
