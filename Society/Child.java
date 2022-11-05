package Society;

public class Child extends Person {

    Person father;
    Person mother;

    /**
     * @param name
     * @param gender
     * @param f // Father
     * @param m // Mother
     */
    public Child(String name, String gender, Person f, Person m) {
        super(name, 0, gender);
        father = f;
        mother = m;
    }

    public Person getFather() { return father; }
    public Person getMother() { return mother; }

    public String toString() {
        return super.toString() + String.format(
            ", Child of %s and %s", father.getName(), mother.getName());
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((father == null) ? 0 : father.hashCode());
        result = prime * result + ((mother == null) ? 0 : mother.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Child other = (Child) obj;
        if (father == null) {
            if (other.father != null)
                return false;
        } else if (!father.equals(other.father))
            return false;
        if (mother == null) {
            if (other.mother != null)
                return false;
        } else if (!mother.equals(other.mother))
            return false;
        return true;
    }

}
