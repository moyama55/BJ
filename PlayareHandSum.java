import java.util.*;

public class PlayareHandSum {
    public void playerHand(){
        //どっちかというとDraw.java
        TranpDeck td = new TranpDeck();
        Random rd = new Random();
        td.deckMark();
        td.deckCard();
        int[] decks = td.getDecks();
        String[] marks = td.getMarks();
        int randomMark = rd.nextInt(3);
        int randomDeck = rd.nextInt(51);
        int confirmNum = decks[randomDeck];
        if(confirmNum == 1){
            System.out.println("あなたの引いたカードは" + marks[randomMark] + "A");
        }else{
            System.out.println("あなたの引いたカードは" + marks[randomMark] + confirmNum);
        }
        
        //引いたカードを配列から消す
        //マークの配列とカードの配列に関係性を持たせたい
    }
}
