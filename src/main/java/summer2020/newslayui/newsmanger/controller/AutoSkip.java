package summer2020.newslayui.newsmanger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.io.IOException;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/8
 */
@Slf4j//日志
@Configuration
public class AutoSkip {
    @EventListener({ApplicationReadyEvent.class})
    public void applicationReadyEvent() {
        log.info("应用程序准备启动");
        System.out.println("应用已经准备就绪 ... 启动浏览器");
        String url = "http://localhost:8081/login";
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
