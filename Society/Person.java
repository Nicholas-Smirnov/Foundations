package Society;
import java.util.ArrayList;
import java.util.HashMap;

public class Person {

    // Personal characteristics
    private String name;
    private int age;
    private String gender;

    // Characteristics in society
    private Estate estate;
    private int socialSecurity;
    private double totalMoney;

    // Other characteristics (relationships)
    private ArrayList<Person> contacts;
    private Person partner = null;
    private ArrayList<Child> children;

    // Extra
    private HashMap<Integer, Integer> grades;

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name; this.age = age; 
        this.gender = gender;
        contacts = new ArrayList<Person>();
        children = new ArrayList<Child>();
        socialSecurity = (int) (Math.random()*(99999999-10000000+1)+10000000);  
    }

    // Accessor methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public Estate getEstate() { return estate; }
    public ArrayList<Child> getChildren() { return children; }

    // Checking methods
    public boolean checkSocialSecurity(int socialSec) {
        if (socialSec == socialSecurity) { return true; } return false;
    }

    // Mutator methods
    public void addChild(Child child) { children.add(child); }

    // Contacts with low-level relationships


    // Contacts with high-level relationships
    public void getInRelationship(Person partner) {
        if (this.partner == null) {
            this.partner = partner;
            System.out.println(partner);
            System.out.println(String.format(
                "%s got in a relationship with %s", 
                this.name, partner.getName()));
        } else {
            System.out.println(
                String.format("%s is currently in a relationship.", 
                this.name));
        }   
    }
    
    public Person haveKid(Person person, String name, String gender) {
        Child child = null;
        if (this.gender.equals("Male")) {
            child = new Child(name, gender, this, partner);
        } else {
            child = new Child(name, gender, partner, this);
        }
        addChild(child); partner.addChild(child);
        return child;
    }

    // ToString Method
    public String toString() {
        String allStats = "";
        allStats += String.format("%s : Age = %s, Gender = %s ", name, age, gender);
        if (partner == null || age < 18) {
            int grade = age - 5;
            String output;
            if (grade < 3) {
                allStats += String.format("Estate = %s, Not in school", estate);
            } else 
                allStats += String.format("Estate = %s, Grade = %s", estate, Integer.toString(grade));
        }   
        else {
            if (age >= 18) {
                allStats += String.format("Estate = %s, Currently Single", estate);
            } else 
                allStats += String.format("Estate = %s, Partner = %s", estate, partner.getName());
        } 
        
        return allStats;
    }

}