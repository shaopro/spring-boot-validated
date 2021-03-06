package com.github.springbootvalidated.controller.impl.old;

import com.github.springbootvalidated.controller.old.IUserCommonController;
import com.github.springbootvalidated.pojo.doo.UserCommonDO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 创建时间为 10:28 2019-04-16
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
public class UserCommonControllerImpl implements IUserCommonController {

    @PostMapping("common")
    @Override
    public UserCommonDO postUserCommon(@RequestBody @Valid UserCommonDO userCommonDO) {
        return userCommonDO;
    }

}
