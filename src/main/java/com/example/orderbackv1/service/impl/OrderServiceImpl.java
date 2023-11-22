package com.example.orderbackv1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.orderbackv1.domain.Order;
import com.example.orderbackv1.service.OrderService;
import com.example.orderbackv1.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 李西军
* @description 针对表【order】的数据库操作Service实现
* @createDate 2023-11-22 10:26:10
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




