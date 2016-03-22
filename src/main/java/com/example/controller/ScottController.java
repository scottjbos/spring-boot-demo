package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO Fill me in, don't get lazy.
 *
 * @author boss
 */
@Controller
public class ScottController {

    @RequestMapping
    public String home() {
        return "scott";
    }
}
