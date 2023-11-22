package com.example.orderbackv1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.example.orderbackv1.common.ApiResult;
import com.example.orderbackv1.domain.GoodsDetail;
import com.example.orderbackv1.service.impl.GoodsDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/v1/goods")
public class GoodsController {

    @Autowired
    private GoodsDetailServiceImpl goodsDetailService;

    @GetMapping("/detail/{goods_id}")
    public ApiResult<GoodsDetail> getGoodsDetail(@PathVariable("goods_id") int goods_id){
        LambdaQueryWrapper<GoodsDetail> lqw = new LambdaQueryWrapper<>();
        lqw.eq(GoodsDetail::getGoodsId,goods_id);
        lqw.eq(GoodsDetail::getGoodsDeleted,0);
        GoodsDetail goodsDetail = goodsDetailService.getOne(lqw);
        return new ApiResult<>(goodsDetail,new ApiResult.Meta("获取成功",200));
    }
}
