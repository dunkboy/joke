package com.poor.foolish.service.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class TestController
{

    @Autowired
    private TestService testService;

    @Autowired
    private FeignServiceA feignServiceA;

    @RequestMapping("/cao")
    public String home(@RequestParam(value = "name", defaultValue = "feign") String name)
    {
//        return testService.service1(name);
        return feignServiceA.sayCaoNiMa(name);
    }
}
