package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-23 8:41
 */

public class StringEqualsExam_02 {
    private char[] value;

    public StringEqualsExam_02(char[] value) {
        this.value = value;
    }

    public boolean equall(Object object1) {
        if (this == object1) {
            return true;
        }
        if (object1 instanceof StringEqualsExam_02) {
            StringEqualsExam_02 object2 = (StringEqualsExam_02) object1;
            int n = value.length;
            if (n == object2.value.length) {
                int i = 0;
                char[] v1 = value;
                char[] v2 = object2.value;
                while (n-- != 0) {
                    if (v1[i] == v2[i])
                        return true;
                    i++;
                }

            }
            return false;
        }

        return false;
    }
}



