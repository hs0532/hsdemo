package com.hs.controller;

import com.hs.Mapper.PeopleMapper;
import com.hs.bean.People;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description =
        "（test",
        tags = "test")
@RequestMapping("test")
public class testController {

    @Autowired
    PeopleMapper peopleMapper;

    @GetMapping("demo")
    public People getPeople(Integer id){

        return peopleMapper.selectByPrimaryKey(id);
    }

}
