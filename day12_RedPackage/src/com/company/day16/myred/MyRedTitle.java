package com.company.day16.myred;

import com.company.day16.myred.utils.RedPacketFrame;

/**
 * @author Joker_Dong
 * @date 2020-7-31 18:26
 */

public class MyRedTitle extends RedPacketFrame {
    /**
     * 构造方法
     * title 界面的标题
     *
     * @param title
     */
    public MyRedTitle(String title) {
        super(title);
    }
}
