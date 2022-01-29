package cc.mmail.jspi;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhuang.ma
 * @date 2022/1/29
 */
@Slf4j
public class MyLog4j implements MyLog{
    @Override
    public void log(String info) {
        System.out.println(info);
        log.info("MyLog4j=====>>{}",info);
    }
}
