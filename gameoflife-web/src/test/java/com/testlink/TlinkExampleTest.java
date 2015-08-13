package com.testlink;

import junit.framework.TestCase;

/**
 * @author Zhong, Hong-Wei
 * @version 1.0
 * @since 2015/8/13,16:57
 */
public class TlinkExampleTest extends TestCase {

    public void testGetSystemTime() throws Exception {
        TlinkExample tst = new TlinkExample();
        tst.getSystemTime();
        System.out.println("result = " + 10 / 0);
    }
}