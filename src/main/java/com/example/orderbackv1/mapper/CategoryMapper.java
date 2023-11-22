package com.example.orderbackv1.mapper;

import com.example.orderbackv1.domain.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 李西军
* @description 针对表【category】的数据库操作Mapper
* @createDate 2023-11-22 10:25:48
* @Entity com/example/orderbackv1.domain.Category
*/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




