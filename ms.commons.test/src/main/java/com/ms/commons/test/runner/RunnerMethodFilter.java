/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.test.runner;

import java.lang.reflect.Method;

/**
 * @author zxc Apr 14, 2013 12:19:32 AM
 */
public interface RunnerMethodFilter {

    boolean shouldRunMethod(Method method);
}
