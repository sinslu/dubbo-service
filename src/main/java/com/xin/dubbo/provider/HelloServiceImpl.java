package com.xin.dubbo.provider;

import com.xin.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created by xsl on 2019/4/1.
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
        @Override
        public String sayHello(String name) {
            System.out.println("provider received invoke of sayHello: " + name);
            sleepWhile();
            return "Annotation, hello " + name;
        }
        public String sayGoodbye(String name) {
            System.out.println("provider received invoke of sayGoodbye: " + name);
            sleepWhile();
            return "Goodbye, " + name;
        }

        private void sleepWhile() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
