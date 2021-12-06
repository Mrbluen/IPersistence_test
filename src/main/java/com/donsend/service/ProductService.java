package com.donsend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donsend.domain.Product;
import com.donsend.domain.Product;

import java.util.List;

public interface ProductService extends IService<Product> {

    List<Product> findAll();

}
