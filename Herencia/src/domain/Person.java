package domain;
 //@author Kevin Navarro

import Exception.*;


public class Person {


    //Attributes
    private String name;
    private int yearOfBirth;
    private int gender;
    protected boolean isActive;
    
    //constructors
    public Person(){
        this.name = "";
        this.yearOfBirth = 0;
        this.gender = 0;
        this.isActive = false;
    }

    public Person(String name, int yearOfBirth, int gender, boolean isActive) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.isActive = isActive;
    }
    
    // get's and set's
    public String getName(){
        return this.name;
    }
    
    public void setName(String name) throws NameTooShortException{
        if(name.length()>1)
            this.name = name;
        else
            throw new NameTooShortException(2);
    }
    
        public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
 
    @Override
    public String toString(){
        return "Name: "+this.name+" Year of Birth: "+this.yearOfBirth+ " Gender: "+this.gender;
    }
    
    
    
}
