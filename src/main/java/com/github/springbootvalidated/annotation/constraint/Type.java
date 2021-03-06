package com.github.springbootvalidated.annotation.constraint;

import com.github.springbootvalidated.annotation.validator.TypeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 创建时间为 下午6:19 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
//指定注解的处理类
@Constraint(validatedBy = {TypeValidator.class})
public @interface Type {

    String[] value() default "";

    String message() default "不在指定的范围内";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
