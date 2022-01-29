package cc.mmail.jspi;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author zhuang.ma
 * @date 2022/1/29
 */
@Slf4j
public class DemoTest extends TestCase {

    @Test
    public void testJdkSpi(){
        ServiceLoader<MyLog> serviceLoader = ServiceLoader.load(MyLog.class);
        Iterator<MyLog> iterator = serviceLoader.iterator();

        while (iterator.hasNext()){
            MyLog myLog = iterator.next();
            myLog.log("JDK SPI");
        }

    }

    @Test
    public void testDubboSPpi(){
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("dubbo");
        log.info("{}",protocol);
    }


}