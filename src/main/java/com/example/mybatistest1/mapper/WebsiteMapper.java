package com.example.mybatistest1.mapper;

import com.example.mybatistest1.entity.Website;

import java.util.List;

public interface WebsiteMapper {
    public List<Website> findAllWebsite();
    public List<Website> findWebsiteById(int emp_id);
}
