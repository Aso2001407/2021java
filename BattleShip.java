import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BattleShip{
    public static void main(String[] args)throws Exception{
	
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	//潜水艦の座標を乱数で生成
	int cx = (int)(Math.random()*10);
	int cy = (int)(Math.random()*10);
	//Math.random()は 0.0から1.0未満の乱数を返す

	boolean hit = false; //相手は沈んでいない

	//ループ開始
	for(int count = 0; count < 5; count++){  //forで5回ループ
	    System.out.println("砲撃のx座標を入力してください。(0-4)");
	    int bx = Integer.parseInt(buf.readLine());

	    System.out.println("砲撃のy座標を入力してください。(0-4)");
	    int by = Integer.parseInt(buf.readLine());

	    System.out.println("砲撃回数"+(count+1));

	    //終了判定(あたり判定)
	    if((bx == cx) && (by == cy)){ //bx,by cx,cyは同じ座標の場合
		System.out.println("砲撃(" + bx + "," + by + ")は命中しました！");
		System.out.println("相手の潜水艦を撃沈しました。【YOU WIN!】");
		hit = true; //相手を撃沈
		break;//ループを抜ける
	    }

	    //誤差表示
	    System.out.println("砲撃(" + bx + "," + by + ")は外れました・・・");
	    int error = Math.abs(bx-cx) + Math.abs(by-cy);
	    //Math.abs()は括弧の中が負の値の場合、正の値にして返す
	    System.out.println("相手戦艦との誤差は" + error);

	}//ループ終わり

	if(hit = false){ //相手が沈んでいなければ
	    System.out.println("相手からの攻撃でこちらの戦艦が撃沈されました。【YOU LOSE!】");
	}

    }//main終わり
}//class終わり
