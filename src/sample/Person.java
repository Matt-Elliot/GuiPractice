package sample;

public class Person {

    private String name;
    private int telephone;
    private String relationship;

    public Person(String name, int telephone, String relationship){
        this.name = name;
        this.telephone = telephone;
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }



}

