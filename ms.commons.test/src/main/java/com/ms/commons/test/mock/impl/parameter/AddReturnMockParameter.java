/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.test.mock.impl.parameter;

/**
 * @author zxc Apr 14, 2013 12:15:48 AM
 */
public class AddReturnMockParameter extends AbstractMockParameter {

    boolean isInvoked = false;

    public AddReturnMockParameter(Object returnValue) {
        super(returnValue);
    }

    public boolean isInvoked() {
        return isInvoked;
    }

    public void setInvoked(boolean isInvoked) {
        this.isInvoked = isInvoked;
    }
}
