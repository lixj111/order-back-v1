package com.example.orderbackv1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.orderbackv1.common.ApiResult;
import com.example.orderbackv1.common.OrderNumberGenerator;
import com.example.orderbackv1.domain.GoodsDetail;
import com.example.orderbackv1.domain.Order;
import com.example.orderbackv1.service.impl.GoodsDetailServiceImpl;
import com.example.orderbackv1.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/public/v1/my/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private GoodsDetailServiceImpl goodsDetailService;

    @GetMapping("/all")
    public Map<String,Object> getAllOrders(@RequestParam("type") String type){
        Map<String,Object> result = new HashMap<>();
        List<Map<String,Object>> orders = new ArrayList<>();
        Map<String,Object> message = new HashMap<>();
        List<Order> orderList = orderService.list(); // 查询到的原始订单
        for (Order order : orderList) {
            Map<String,Object> extractedOrder = new HashMap<>();
            extractedOrder.put("orderId",order.getOrderId());
            extractedOrder.put("userId",order.getUserId());
            extractedOrder.put("address",order.getAddress());
            extractedOrder.put("createTime",order.getCreateTime());
            extractedOrder.put("updateTime",order.getUpdateTime());
            extractedOrder.put("orderDetail",order.getOrderDetail());
            extractedOrder.put("totalCount",order.getTotalCount());
            extractedOrder.put("totalPrice",order.getTotalPrice());
            extractedOrder.put("orderDeleted",order.getOrderDeleted());
            LambdaQueryWrapper<GoodsDetail> lqw = new LambdaQueryWrapper<>();
            lqw.eq(GoodsDetail::getGoodsId,order.getGoodsId());
            lqw.eq(GoodsDetail::getGoodsDeleted,0);
            GoodsDetail goodsDetail = goodsDetailService.getOne(lqw);
            extractedOrder.put("goods",goodsDetail);
            orders.add(extractedOrder);
        }
        message.put("count",orders.size());
        message.put("orders",orders);
        result.put("message",message);
        result.put("meta",new ApiResult.Meta("获取订单列表成功",200));
        return result;


    }


    @PostMapping("/create")
    public ApiResult<Object> addOrder(@RequestBody(required = true) Order order){
        //
        order.setOrderId(OrderNumberGenerator.generateOrderNumber());
        //order.setUserId(); // 根据token识别用户
        //order.setGoodsId();
        order.setStatus("待配送");
        order.setOrderDeleted(0);
        boolean save = orderService.save(order);
        if(save){
            return new ApiResult<>(null,new ApiResult.Meta("创建成功",200));
        }else {
            return new ApiResult<>(null,new ApiResult.Meta("创建失败",500));
        }
    }
}
