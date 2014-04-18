/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.test.datareader.impl;

import com.ms.commons.test.datareader.AbstractDataReader;
import com.ms.commons.test.memorydb.MemoryDatabase;

/**
 * @author zxc Apr 13, 2013 11:36:58 PM
 */
public class ExcelReader extends AbstractDataReader {

    public static final String DEFAULT_EXT = ".xls";

    public String defaultExt() {
        return DEFAULT_EXT;
    }

    protected MemoryDatabase internalRead(String resourceName) {
        return ExcelReadUtil.readExcel(resourceName, false);
    }
}
