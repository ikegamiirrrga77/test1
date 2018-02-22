package test1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Try {
  public static void main(String args[]){

    //Dateを生成
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日'E'曜日'k'時'mm'分'ss'秒'");
    Date d = new Date();
    sdf.setTimeZone(TimeZone.getTimeZone("Pacific/Honolulu"));
    //画面出力
    System.out.println("現在のハワイの時刻は" + sdf.format(d));

  }
}