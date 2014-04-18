/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.test.tool.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zxc Apr 14, 2013 12:18:45 AM
 */
public class ConsoleUtil {

    private static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() throws IOException {
        return consoleReader.readLine();
    }
}
