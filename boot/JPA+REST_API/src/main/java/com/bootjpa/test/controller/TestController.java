package com.bootjpa.test.controller;

import com.bootjpa.test.entity.TestTableDto;
import com.bootjpa.test.repository.TestTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    private TestTableRepository testTableRepository;

    public TestController(TestTableRepository testTableRepository) {
        this.testTableRepository = testTableRepository;
    }

    @PostMapping(path = "/all")
    public TestTableDto listAll() {
        Optional<TestTableDto> tests = testTableRepository.findById("A123");
        System.out.println(String.format(">> tests[%s]", tests.get().toString()));
        return tests.get();
    }
}
