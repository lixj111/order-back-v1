package com.example.orderbackv1.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderNumberGenerator {

    public static String generateOrderNumber() {
        // 获取当前时间
        Date now = new Date();

        // 定义时间格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");

        // 格式化时间
        String timestamp = dateFormat.format(now);

        // 生成随机码
        String randomCode = generateRandomCode(3);

        // 拼接订单号
        return timestamp + randomCode;
    }

    public static String generateRandomCode(int length) {
        // 生成随机码的字符集
        String chars = "0123456789";
        Random random = new Random();
        StringBuilder randomCode = new StringBuilder();

        // 生成指定长度的随机码
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            randomCode.append(chars.charAt(index));
        }

        return randomCode.toString();
    }
}

