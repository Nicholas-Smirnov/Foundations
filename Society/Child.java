package Society;

public class Child extends Person {

    Person father;
    Person mother;

    public Child(String name, String gender, Person f, Person m) {
        super(name, 0, gender);
        
        father = f;
        mother = m;
    }
    
    public Person getFather() { return father; }
    public Person getMother() { return mother; }

    public String toString() {
        return super.toString() + String.format(
            "\n Child of %s and %s", father.getName(), mother.getName());
    }

}
