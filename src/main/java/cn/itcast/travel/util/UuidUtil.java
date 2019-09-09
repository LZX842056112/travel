package cn.itcast.travel.util;

import java.util.UUID;

/**
 * @auther lizongxiao
 * @date 2019/9/9 - 15:37
 */
public final class UuidUtil {
    private UuidUtil(){
    }
    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
    //测试
    public static void main(String[] args) {
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
    }

}
