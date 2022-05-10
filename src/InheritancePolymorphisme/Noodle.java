package InheritancePolymorphisme;
/*Penjelasan Access Modifier:
    1. public : class, package, child class, global
    2. protected : class, package, child class
    3. no modifier : class, package
    4. private : class
 */

public class Noodle {
    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    //Penambahan final sebelum parent class method
    //membuat kita tidak bisa mengubah method itu
    //pada child class nya
    final public boolean isTasty() {

        return true;

    }

    public void cook() {
        System.out.println("Boiling.");
        this.texture = "cooked";

    }



    public String getCookPrep() {

        return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";

    }

    public static void main(String[] args) {
        Spaghetti spaghettiPomodoro = new Spaghetti();
        // kita bisa menginstansiasi objek dalam kelas yang berbeda dalam satu package yang sama.
        System.out.println(spaghettiPomodoro.texture);

        Ramen yasaiRamen = new Ramen();
        //System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());

        //instansiasi objek pada kelas spaetzle
        Spaetzle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();

        //Child classes in array and arraylist
        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        Noodle[] allTheNoodles = {spaghetti, ramen, pho};
        // Add your code below:
        for(Noodle noodle : allTheNoodles){
            System.out.println(noodle.getCookPrep());
        }

    }




}

