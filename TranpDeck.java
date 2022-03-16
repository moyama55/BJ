import java.util.*;
public class TranpDeck {
    //トランプを表している配列と要素
    Map<String, Integer>prefs = new HashMap<String, Integer>();
    private int[] decks = new int[51];
    private String[] marks = new String[3];
    private int count = 0;
    private int num = 1;
    public void deck(){
        //カードの絵柄決め
        for(int i = 0; i < 4; i++){
            switch(i){
                case 0:
                    marks[i] = "ハートの";
                    break;
                case 1:
                    marks[i] = "ダイヤの";
                    break;
                case 2:
                    marks[i] = "スペードの";
                    break;
                case 3:
                    marks[i] = "クローバーの";
                    break;
            }
            //カードの数値決め    
            for(int j = 0; j < 13; j++){
                decks[count] = j++;
            }
        }    
        
    }
    public String[] getMarks(){
        return this.marks;
    }
    public int[] getDecks(){
        return this.decks;
    }
}   

