package com.poor.foolish.service.ribbon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * +---------------------------+
 * |I am the most handsome coding peasant.|
 * +---------------------------+
 * <p>Title: FeignServiceA</p>
 * <p>Description: FeignServiceA</p>
 * <p>Copyright:Copyright(c) coder 2018/p>
 * <p>Company: </p>
 * <p>CreateTime: 2018/8/16 16:01</p>
 * @author cb
 * @version 1.0
 **/
@FeignClient(value = "service-a", fallback = FeignServiceAHystrix.class)
public interface FeignServiceA
{
    @GetMapping(value = "/hi")
    String sayCaoNiMa(@RequestParam(value = "name") String name);
}
