package com.example.orderbackv1.mapper;

import com.example.orderbackv1.domain.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 李西军
* @description 针对表【order】的数据库操作Mapper
* @createDate 2023-11-22 10:26:10
* @Entity com/example/orderbackv1.domain.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}




