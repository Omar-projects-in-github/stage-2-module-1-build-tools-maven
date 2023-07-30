package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        return NumberUtils.isParsable(str) && str.charAt(0) != '0' &&
                Double.parseDouble(str) > 0;
    }
}
