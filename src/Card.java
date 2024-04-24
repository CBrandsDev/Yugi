public abstract class Card {
    protected String name;

    public Card(String n) {
        name = n;
    }
    public void setCard(){
        System.out.println("Card: ");
        System.out.println(name);
        System.out.println("");
    }
    
}