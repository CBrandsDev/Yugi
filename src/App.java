import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        MonsterCard TimeWizard = new MonsterCard("Time Wizard",4, 1200, 0700, "The ultimate wizard in terms of attack and defense.", "Spellcaster", "Dark");
        MonsterCard BabyDragon = new MonsterCard("Baby Dragon",3, 2500, 2100, "Much more than just a child, this dragon is gifted with untapped power.", "Dragon", "wind");
        MonsterCard Misairuzame = new MonsterCard("Misairuzame",5, 1400, 1600, "A missile-launching fish protected by deadly spikes.", "Fish", "Water");
        SpellCard MonsterReborn = new SpellCard("Monster Reborn","Spell", "Target 1 monster in either GY; Special Summon it.");
        TrapCard TrapHole = new TrapCard("Trap Hole", "When your opponent Normal or Flip Summons a monster with 1000 or more ATK: Target that monster; destroy that target.");

        Deck Deck = new Deck();

        Scanner sc = new Scanner(System.in);

        Deck.addCard(TimeWizard);
        Deck.addCard(BabyDragon);
        Deck.addCard(Misairuzame);
        Deck.addCard(MonsterReborn);
        Deck.addCard(TrapHole);

        Deck.clean();
        Deck.setDeck();

        boolean index = false;
        while(index == false) {
            System.out.println("");
            System.out.println("Which card do you want to view? [1 - 5, for exit type 9]");
            int pass = 0;
            pass = sc.nextInt();
            if(pass == 1) {
                Deck.clean();
                TimeWizard.setMonsterCard();
            } else if (pass == 2) {
                Deck.clean();
                BabyDragon.setMonsterCard();
            } else if(pass == 3) {
                Deck.clean();
                Misairuzame.setMonsterCard();
            } else if (pass == 4) {
                Deck.clean();
                MonsterReborn.setSpellCard();
            } else if (pass == 5) {
                Deck.clean();
                TrapHole.setTrapCard();
            } else if (pass == 9) {
                System.exit(0);
            }

        }
        sc.close();
       
    }
}
