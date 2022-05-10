package InheritancePolymorphisme;

public class Pho extends Noodle{
    //Child class dapat mewarisi field dan method parent classnya.
    //Child class juga dapat mewarisi konstruktor parent classnya dengan constructor super()
    Pho(){
        super(30.0, 0.64, "flat", "rice flour");
    }


  /*  @Override
    public String getCookPrep() {

        return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";

    }

   */

    @Override
    public String getCookPrep() {

        return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";

    }
}
