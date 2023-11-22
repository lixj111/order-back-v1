package com.example.orderbackv1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.orderbackv1.common.ApiResult;
import com.example.orderbackv1.domain.Category;
import com.example.orderbackv1.domain.GoodsDetail;
import com.example.orderbackv1.service.impl.CategoryServiceImpl;
import com.example.orderbackv1.service.impl.GoodsDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/public/v1/categories")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Autowired
    private GoodsDetailServiceImpl goodsDetailService;

    @GetMapping
    public ApiResult<Category> get_all_categories(){
        LambdaQueryWrapper<Category> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Category::getCatDeleted, 0);
        List<Category> list = categoryService.list(lqw);
        for (Category category : list) {
            LambdaQueryWrapper<GoodsDetail> lqw2 = new LambdaQueryWrapper<>();
            lqw2.eq(GoodsDetail::getGoodsDeleted,0);
            // 将 Integer 转换为字符串
            String catId = category.getCatId() != null ? category.getCatId().toString() : null;
            lqw2.like(StringUtils.isNotBlank(catId),GoodsDetail::getGoodsCat, catId);
            List<GoodsDetail> childrenList = goodsDetailService.list(lqw2);
            category.setChildren(childrenList);
        }

        return new ApiResult<>(list,new ApiResult.Meta("获取成功",200));

    }
}
