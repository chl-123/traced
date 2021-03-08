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
        /*Calendar specialDate = Calendar.getInstance();
        specialDate.setTime(date); //注意在此处将 specialDate 的值改为特定日期
        specialDate.add(Calendar.YEAR, 1); //特定时间的1年后
        specialDate.add(Calendar.YEAR, -1); //特定时间的1年前
*/
    }

}
