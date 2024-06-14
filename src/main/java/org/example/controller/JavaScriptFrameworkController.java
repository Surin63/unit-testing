package org.example.controller;

import org.example.data.JavaScriptFramework;
import org.example.service.JavaScriptFrameworkService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JavaScriptFrameworkController {
    private final JavaScriptFrameworkService javaScriptFrameworkService;

    public List<JavaScriptFramework> getFrameWorks() {
return javaScriptFrameworkService.getAll();
    }
}
