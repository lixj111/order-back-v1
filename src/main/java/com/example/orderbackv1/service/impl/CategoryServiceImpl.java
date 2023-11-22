package com.example.orderbackv1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.orderbackv1.domain.Category;
import com.example.orderbackv1.service.CategoryService;
import com.example.orderbackv1.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author 李西军
* @description 针对表【category】的数据库操作Service实现
* @createDate 2023-11-22 10:25:48
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




