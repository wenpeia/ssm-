package com.demo1.service.impl;

import com.demo1.dao.ItemsMapper;
import com.demo1.pojo.Items;
import com.demo1.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }

    //查询

}
