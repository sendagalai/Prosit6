package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public void displayAquaticAnimals(){
        for(Aquatique a: aquaticAnimals){
            if(a != null)
                a.swim();
        }

    }

    public boolean equals(Object obj){
        if(obj == null){
            return false ;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Aquatique aquatic=(Aquatique)obj;
        return this.name.equals(aquatic .name) && this.habitat.equalsIgnoreCase(aquatic.habitat) && this.age == aquatic.age;
    }


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
}
