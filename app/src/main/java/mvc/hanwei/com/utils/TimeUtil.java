package mvc.hanwei.com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式时间
 * Created by cmh on 2017/3/7.
 */
public class TimeUtil {

    //获取的时间样式
    private static final SimpleDateFormat yyyymmddhhssmmFt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //格式成的样式
    private static final SimpleDateFormat hhmm = new SimpleDateFormat("HH:mm");

    //获取的小时的时间HH:mm
    public final static String getRealHour(String time) {

        if (time == null || "".equals(time)) {
            return "";
        }
        try {
            Date date1 = yyyymmddhhssmmFt.parse(time);
            return hhmm.format(date1);

        } catch (ParseException e) {
            return "";
        }
    }
}
