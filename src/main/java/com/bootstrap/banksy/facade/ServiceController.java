package com.bootstrap.banksy.facade;

import com.bootstrap.banksy.core.base.Response;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author wuhanhong
 * @date 2018 - 05 - 29
 */
@RestController
public class ServiceController {


    /**
     * 公共服务类
     * @param request
     * @return
     */
    @PostMapping(value = "service")
    public Object baseService(Map<String, Object> request) {
        String serviceNo = (String) request.get("serviceNo");
        if (StringUtils.isEmpty(serviceNo)) {
            return Response.error("系统服务号为空");
        }

        return null;
    }
}
