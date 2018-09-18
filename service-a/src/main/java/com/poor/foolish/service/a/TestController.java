package com.poor.foolish.service.a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * +---------------------------+
 * |I am the most handsome coding peasant.|
 * +---------------------------+
 * <p>Title: TestController</p>
 * <p>Description: TestController</p>
 * <p>Copyright:Copyright(c) coder 2018/p>
 * <p>Company: </p>
 * <p>CreateTime: 2018/8/16 14:46</p>
 * @author cb
 * @version 1.0
 **/

@RestController
@RefreshScope
public class TestController
{


    @Value("${server.port}")
    String port;
    @Value("${poor}")
    String poor;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "poor") String name)
    {
        return "hi " + name + " ,i am from port:" + port+" "+poor;
    }
}
