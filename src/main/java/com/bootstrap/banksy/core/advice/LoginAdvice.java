package com.bootstrap.banksy.core.advice;


import com.bootstrap.banksy.base.Constants;
import com.bootstrap.banksy.core.annotation.Authentication;
import com.bootstrap.banksy.core.domain.SysUser;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wuhanhong
 * @date 2018 - 04 - 30
 */
public class LoginAdvice implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Authentication authentication = handlerMethod.getMethod().getAnnotation(Authentication.class);
            if (authentication != null) {
                SysUser user = (SysUser) request.getSession().getAttribute(Constants.SESSION);
                if (user == null) {
                    response.sendRedirect("");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
