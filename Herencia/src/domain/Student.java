package domain;

import Exception.NameTooShortException;

/**
 *
 * @author Equipo
 */
public class Student extends Person{
    
    //Attributes
    private String universityID;
    private String major;

    public Student() {
        super();
        this.universityID = "";
        this.major = "";
    }

    public Student(String name, int yearofBirth, int gender, boolean isActive,String id) throws NameTooShortException {
        
        super(name, yearofBirth, gender, isActive);
        this.universityID = id;
        this.major = "";
    }
            
            
    public Student(String universityID, String major) {
        super();
        this.universityID = universityID;
        this.major = major;
    }

    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString(){
        return super.toString()+ ". Univesity ID: "+ this.universityID;
    }
    
    
    
}
