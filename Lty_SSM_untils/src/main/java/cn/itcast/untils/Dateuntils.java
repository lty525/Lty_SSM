package cn.itcast.untils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/7$ 12:29$
 * @Version: 1.0
 */

public class Dateuntils {
    /**
     * 时间转换成字符串
     * @param date
     * @param pattern
     * @return
     */
    public  static  String date2String(Date date ,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String format = sdf.format(date);
        return format;
    }

    public  static  Date string2Date(String str ,String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = sdf.parse(str);
            return date;
        } catch (ParseException e) {
          throw  new RuntimeException("解析出错!!!");
        }

    }
}
