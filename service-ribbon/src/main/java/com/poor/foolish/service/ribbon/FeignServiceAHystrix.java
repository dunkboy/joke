package com.poor.foolish.service.ribbon;/**
 * +---------------------------+
 * |I am the most handsome coding peasant.|
 * +---------------------------+
 * <p>Title: FeignServiceAHystrix</p>
 * <p>Description: FeignServiceAHystrix</p>
 * <p>Copyright:Copyright(c) coder 2018/p>
 * <p>Company: </p>
 * <p>CreateTime: 2018/8/16 16:18</p>
 * @author cb
 * @version 1.0
 **/

import org.springframework.stereotype.Component;

@Component
public class FeignServiceAHystrix implements FeignServiceA
{
    @Override
    public String sayCaoNiMa(String name)
    {
        return "sorry " + name;
    }
}
