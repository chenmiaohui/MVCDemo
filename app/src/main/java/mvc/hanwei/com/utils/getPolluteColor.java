package mvc.hanwei.com.utils;

import mvc.hanwei.com.R;

/**
 * 获取污染物的颜色
 * Created by cmh on 2017/3/7.
 */
public class getPolluteColor {

    public static int getAqiStateDrawable(String aqiLevel){
        if (aqiLevel.equals("1")) {
            return R.drawable.uicornerbg_air_level1;
        }
        if (aqiLevel.equals("2")) {
            return R.drawable.uicornerbg_air_level2;
        }
        if (aqiLevel.equals("3")) {
            return R.drawable.uicornerbg_air_level3;
        }
        if (aqiLevel.equals("4")) {
            return R.drawable.uicornerbg_air_level4;
        }
        if (aqiLevel.equals("5")) {
            return R.drawable.uicornerbg_air_level5;
        }
        if (aqiLevel.equals("6")) {
            return R.drawable.uicornerbg_air_level6;
        }
        return R.drawable.uicornerbg_air_level1;
    }


    public static String getAqiState(String aqiLevel){
        if (aqiLevel.equals("1")) {
            return "优";
        }
        if (aqiLevel.equals("2")) {
            return "良";
        }
        if (aqiLevel.equals("3")) {
            return "轻度污染";
        }
        if (aqiLevel.equals("4")) {
            return "中度污染";
        }
        if (aqiLevel.equals("5")) {
            return "重度污染";
        }
        if (aqiLevel.equals("6")) {
            return "严重污染";
        }
        return "";
    }
}
