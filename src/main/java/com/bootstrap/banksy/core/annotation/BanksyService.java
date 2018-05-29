package com.bootstrap.banksy.core.annotation;

import java.lang.annotation.*;

/**
 * @author wuhanhong
 * @date 2018 - 05 - 29
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface BanksyService {
    String serviceNo();
    String description();
}
