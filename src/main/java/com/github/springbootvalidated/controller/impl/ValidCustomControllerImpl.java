package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IValidController;
import com.github.springbootvalidated.pojo.dto.ValidCustomDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 石少东
 * @date 2020-11-12 10:51
 * @since 1.0
 */

@RestController
public class ValidCustomControllerImpl implements IValidController<ValidCustomDTO> {

    @PostMapping("custom")
    @Override
    public ValidCustomDTO valid(@Valid @RequestBody ValidCustomDTO data) {
        return data;
    }
}
