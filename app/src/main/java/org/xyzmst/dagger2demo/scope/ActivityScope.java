package org.xyzmst.dagger2demo.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author mac
 * @title ActivityScope
 * @description
 * @modifier
 * @date
 * @since 2017/4/21 01:10
 **/
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
