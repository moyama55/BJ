import java.util.*;
public class BlackJack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TranpDeck deck = new TranpDeck();

        //自分の手札の枚数の合計
        int myhandSum = 0;
        
        //自分の手札の値の合計
        int myValueSum = 0;  

        //相手の手札の枚数の合計
        int enemyhandSum = 0;

        //相手の手札の値の合計
        int enemyValueSum = 0;  
        
        System.out.println("ようこそブラックジャックの世界へ");
        System.out.println("ゲームを開始します");
        System.out.println("あなたの手札は");
        
        //トランプを表す配列からランダムに一つとるのを敵味方で４回繰り返す
        
        //自分の手札        
        System.out.print("自分の手札: ");
        System.out.print(myhandSum + "枚目");
        System.out.println(myhandSum + 1 +"枚目");
        //相手の手札
        System.out.print("相手の手札: ");
        System.out.print(enemyhandSum +"枚目");
        
        //自分の１枚目の手札と２枚目以降のの手札の合計が21以上の場合バースト
        if(myValueSum > 21){
            System.out.print("バーストしました。ゲームを終了します");
        }
        //相手の手札ドロー(17以上になるまで引き続ける)
        //相手の１枚目の手札と２枚目以降のの手札の合計が21以上の場合バースト
        if(enemyValueSum > 21){
            System.out.print("バーストしました。ゲームを終了します");
        }
        //プレイヤーとディーラーが引き終えたら勝負
    }
}