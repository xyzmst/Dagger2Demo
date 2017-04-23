package org.xyzmst.dagger2demo.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author mac
 * @title LilyFlower
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 12:08
 **/
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface LilyFlower {
}
