package com.bootstrap.banksy.facade;

import com.bootstrap.banksy.base.InitializeData;
import com.bootstrap.banksy.core.annotation.Authentication;
import com.bootstrap.banksy.core.domain.SessionInfo;
import com.bootstrap.banksy.core.domain.SysModule;
import com.bootstrap.banksy.core.domain.SysUser;
import com.bootstrap.banksy.core.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DefaultController {

    @Autowired
    private SessionService sessionService;

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    /**
     * 根据页面ID做页面跳转，跳转时根据用户权限加载按钮
     * @param sourceId
     * @return
     */
    //@Authentication
    @RequestMapping("/jump")
    public ModelAndView source(
            HttpServletRequest request, HttpServletResponse response,
            @RequestParam("sourceId") String sourceId, String param){
        ModelAndView modelAndView = null;
        try {
            SysModule module = InitializeData.loadModule(sourceId);

            if (module == null) {
                modelAndView = new ModelAndView("error/404");
            } else {
                modelAndView = new ModelAndView(module.getLocation());
                //加载登陆人的页面权限
                /*SessionInfo session = sessionService.getLoginInfo(request);
                if (session == null) {
                    response.sendRedirect("");
                }

                session.getPageButton(sourceId);*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }
}
