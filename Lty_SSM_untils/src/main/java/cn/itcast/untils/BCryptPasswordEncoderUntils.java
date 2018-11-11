package cn.itcast.untils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

/**
 * @Description: java类作用描述
 * @Author: Lty
 * @CreateDate: 2018/11/8$ 23:38$
 * @Version: 1.0
 */

public class BCryptPasswordEncoderUntils {
    public static void main(String[] args) {
        String[] split = "cn.itcast.controller.SysLogController".split("\\.");
        System.out.println(split[3]);
//        System.out.println(jiami("123456"));
        //$2a$10$BGw4VX6K03mbQbm5Pw4xVOVjUOzNUScWDh12KkHVhbzwX.gabT8Oi
        //$2a$10$jAk/ereoKww2CLzMzLN76ur2YpgQzrzv9xMHZuOO/CsniY2jPNWBS
    }
    public static String jiami(String password){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return  bCryptPasswordEncoder.encode(password);

    }
}
