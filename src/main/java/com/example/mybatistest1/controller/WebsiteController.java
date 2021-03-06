package com.example.mybatistest1.controller;
import com.example.mybatistest1.entity.Website;
import com.example.mybatistest1.mapper.WebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class WebsiteController {
    @Autowired(required=false)
    public WebsiteMapper websiteMapper;

    public List<Website> findAllWebsite(){
        return websiteMapper.findAllWebsite();
    }

    public List<Website> findWebsiteById(int id){
        return websiteMapper.findWebsiteById(id);
    }
}
