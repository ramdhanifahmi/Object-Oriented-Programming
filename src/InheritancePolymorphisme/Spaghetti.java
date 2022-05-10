package InheritancePolymorphisme;

public class Spaghetti extends Noodle{
    //Java harus membuat konstruktor super pada child class nya
    Spaghetti(){
        super(30.0, 0.64, "flat", "rice flour");
    }

    @Override
    public String getCookPrep() {

        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";

    }
}
