package com.company.day11.ClassMember;

/**
 * @author Joker_Dong
 * @date 2020-7-25 11:44
 */

public class Armour {
    //
    String name;
    int protect;    // 护甲能力

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }

    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }
}
