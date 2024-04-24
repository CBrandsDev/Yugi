public class Deck {
    private Card[] DK;
    private int index;

    public Deck() {
        DK = new Card[5];
        index = 0;
    }
    public void addCard(Card C){
        DK[index] = C;
        index++;
    }

    public void removeCard(Card C){
        for(int i=0; i<index; i++){
            if(DK[i] == C){
                DK[i] = DK[index-1];
                DK[index-1] = null;
                index--;
            }
        }
    }

    public void findCard(Card C){
        boolean found = false;
        for(int j=0; j<index; j++){
            if (DK[j] == C){
                System.out.println("The card was found in your deck at " + (j+1) + "ª position.");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("The card was not found in your deck.");
        }
    }

    public void setDeck(){
        for(int k=0; k<index; k++){
            DK[k].setCard();
        }
    }
    public void clean() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}