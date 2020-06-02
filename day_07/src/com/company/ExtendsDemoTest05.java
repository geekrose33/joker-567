package com.company;

import java.util.zip.ZipInputStream;

/**
 * @author Joker_Dong
 * @date 2020-6-2 13:13
 */

public class ExtendsDemoTest05 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        // 子类中有show 只会运行重写后的show
        zi.show();
    }
}
