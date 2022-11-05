package Ecology;

public class Species {
    
    private String name;
    private String desc;
    private Species partner;

    public Species(String name, String desc) {
        this.name = name; this.desc = desc;
    }

    public void mate(Species partner) {
        this.partner = partner;
    }

}
