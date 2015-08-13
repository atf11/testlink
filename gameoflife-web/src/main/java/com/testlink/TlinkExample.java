package com.testlink;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Zhong, Hong-Wei
 * @version 1.0
 * @since 2015/8/13,16:54
 */
public class TlinkExample {

    private Date currentTime;

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Date getSystemTime() {
        currentTime = Calendar.getInstance().getTime();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(currentTime));
        return currentTime;
    }
}
