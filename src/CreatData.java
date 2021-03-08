import java.text.SimpleDateFormat;
import java.util.Date;

public class CreatData {
    public static Date createMyData(String data){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date d  = null;
        //这里会有一个异常，所以要用try catch捕获异常
        try {
            d  = sdf.parse(data);
            return d;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
