public class TranpDeck {
    //トランプを表している配列
    int[] decks = new int[51];
    String[] marks = new String[3];
    int count = 0;
    int num = 1;
    public void deck(){
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
            for(int j = 0; j < 13; j++){
                if(10 <= j){
                    decks[count] = 10;
                }else{
                    decks[count] = j++;
                }
                count++;
            }
        }    
    }
}
