package com.example.orderbackv1.mapper;

import com.example.orderbackv1.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 李西军
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-11-22 10:25:28
* @Entity com/example/orderbackv1.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




