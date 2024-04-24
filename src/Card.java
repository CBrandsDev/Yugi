public abstract class Card {
    protected String name;

    public Card(String n) {
        name = n;
    }
    public void setCard(){
        System.out.println("Your Deck: ");
        System.out.println(name);
    }
}