package com.derek.metalslug.comp;

import java.util.Random;

/**
 * Created by asus on 2016/12/18.
 * Email:763433963@qq.com
 */

public class Util {
    public static Random random = new Random();
    // 返回一个0～range的随机数
    public static int rand(int range)
    {
        // 如果range为0，直接返回0
        if (range == 0)
            return 0;
        // 获取一个0～range之间的随机数
        return Math.abs(random.nextInt() % range);
    }
}
