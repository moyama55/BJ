public class BlackJack{
    /*以下の行から二種類のコメントアウトを使う
        //! = その動作が何を表しているのかを説明している 
        //? = 未完成部分のメソッドに何をさせたいのかを説明している    
    */
    public static void main(String[] args){
        //!自分の手札の枚数の合計
        int myhandSum = 0;
        //!
        
        //!自分の手札の値の合計
        int myValueSum = 0;  
        //!

        //!相手の手札の枚数の合計
        int enemyhandSum = 0;
        //!

        //!相手の手札の値の合計
        int enemyValueSum = 0;  
        //!
        
        //!トランプを表している配列
        int[] cards = new int[51];
        //!
        
        //!ゲーム開始時メッセージ
        System.out.println("ようこそブラックジャックの世界へ");
        System.out.println("ゲームを開始します");
        //!
        
        System.out.println("あなたの手札は");
        
        //?トランプを表す配列からランダムに一つとる
        //!自分の手札        
        System.out.print("自分の手札: ");
        System.out.print(myhandSum + "枚目");
        System.out.println(myhandSum + 1 +"枚目");
        //!相手の手札
        System.out.print("相手の手札: ");
        System.out.print(enemyhandSum + 1 +"枚目");
        System.out.println(enemyhandSum + 1 + "枚目");
        //?
        
        //?自分の手札ドロー
        System.out.print("自分の手札: ");
        
        //?    
        
        //?１枚目の手札と２枚目の手札の合計が21以上の場合バーストをしたとみなる
        if(myValueSum> 21){
            System.out.print("バーストしました。ゲームを終了します");
        }
        //?
    }
}