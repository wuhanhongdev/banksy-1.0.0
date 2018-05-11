package com.bootstrap.banksy.core.service;

import com.bootstrap.banksy.base.Constants;
import com.bootstrap.banksy.core.domain.SessionInfo;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class SessionService {

    /**
     * 获取session
     * @return
     */
    public SessionInfo getLoginInfo(HttpServletRequest request) {
        SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSION);
        return sessionInfo;
    }
}
