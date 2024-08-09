package com.ajay.NewsApp_RemoteAPIBasic.controller;

import com.ajay.NewsApp_RemoteAPIBasic.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/latestNews")
    public Object getLatestNews(@RequestParam String country, @RequestParam String apiKey){
        return newsService.getLatestNews(country, apiKey);
    }
}
