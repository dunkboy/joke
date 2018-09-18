package com.poor.foolish.service.zuul;/**
 * +---------------------------+
 * |I am the most handsome coding peasant.|
 * +---------------------------+
 * <p>Title: MyFilter</p>
 * <p>Description: MyFilter</p>
 * <p>Copyright:Copyright(c) coder 2018/p>
 * <p>Company: </p>
 * <p>CreateTime: 2018/8/16 22:06</p>
 * @author cb
 * @version 1.0
 **/

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter
{
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType()
    {
        return "pre";
    }

    @Override
    public int filterOrder()
    {
        return 0;
    }

    @Override
    public boolean shouldFilter()
    {
        return true;
    }

    @Override
    public Object run()
    {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if (accessToken == null)
        {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try
            {
                ctx.getResponse().getWriter().write("token is empty");
            }
            catch (Exception e)
            {
            }

            return null;
        }
        log.info("ok");
        return null;
    }
}
