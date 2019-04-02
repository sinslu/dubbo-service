package com.xin.dubbo.provider;

import com.xin.dubbo.api.GreetingService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created by xsl on 2019/4/1.
 */
@Service(version ="1.0.0")
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greeting(String name) {
        System.out.println("provider received invoke of greeting: " + name);
        sleepWhile();
        return "Annotation, greeting " + name;
    }

    public String replyGreeting(String name) {
        System.out.println("provider received invoke of replyGreeting: " + name);
        sleepWhile();
        return "Annotation, fine " + name;
    }

    private void sleepWhile() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
