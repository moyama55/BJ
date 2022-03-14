import java.util.*;
public class BlackJack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
        
        //自分の手札ドロー
        System.out.print("自分の手札: ");
        System.out.println("次のカードを引きますか？:");
        System.out.println("カードを引く場合はyesをそのままの場合はnoを書いてください");
        String drawCard = sc.next();
        if(drawCard == "yes"){
            //カードを引ける処理
        }else if(drawCard == "no"){
            //そのまま続行する処理
        }
        //１枚目の手札と２枚目の手札の合計が21以上の場合バーストをしたとみなる
        if(myValueSum> 21){
            System.out.print("バーストしました。ゲームを終了します");
        }
    }
}