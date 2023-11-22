package com.example.orderbackv1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.orderbackv1.domain.User;
import com.example.orderbackv1.service.UserService;
import com.example.orderbackv1.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 李西军
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-11-22 10:25:28
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




