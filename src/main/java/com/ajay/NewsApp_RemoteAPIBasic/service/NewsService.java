package com.ajay.NewsApp_RemoteAPIBasic.service;


import com.ajay.NewsApp_RemoteAPIBasic.configuration.RestTemplateConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

@Autowired
RestTemplate restTemplate;                                    // not restTempConfiguration

public Object getLatestNews(String country, String apiKey){
String url = "https://newsapi.org/v2/top-headlines?";
url = prepareUrl(url, country, apiKey);

return restTemplate.getForObject(url, Object.class);   // this method is auto created in config layer
// Object is expected return type, as we are not sure how 3rd party responds, we are receiving in cosmic super class
}

public String prepareUrl(String url, String country, String apiKey){
    String conc = url + "country=" + country + "&apiKey=" + apiKey;
    return conc;
}
}
