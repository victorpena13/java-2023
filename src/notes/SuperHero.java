package notes;

public class SuperHero extends PersonNotes {
    private String alterEgo;


    public SuperHero(String firstname, String lastname, String alterEgo) {
        // referencing the PersonNotes constructor withe the 'super' keyword. 
        super(firstname, lastname);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        // super keyword will call the PersonNotes .getName method instead of the SuperHero .getName method
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("clark", "kent", "superman");
        System.out.println(theManOfSteel.getSecretIdentity());
        System.out.println(theManOfSteel.getName());
    }

    
    
}
