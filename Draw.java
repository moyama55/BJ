import java.util.*;

public class Draw {
    public void draw(){
    
    //自分の手札ドロー
    Scanner sc = new Scanner(System.in);
    System.out.print("自分の手札: ");
    System.out.println("次のカードを引きますか？:");
    System.out.println("カードを引く場合はyesをそのままの場合はnoを書いてください");
    String drawCard = sc.next();
        if(drawCard == "yes"){
            
        }else if(drawCard == "no"){
            //そのまま続行する処理
        }
    }
}
