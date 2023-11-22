package com.example.orderbackv1;

import com.example.orderbackv1.common.ApiResult;
import com.example.orderbackv1.common.SwiperData;
import com.example.orderbackv1.controller.HomeController;
import com.example.orderbackv1.domain.Category;
import com.example.orderbackv1.domain.GoodsDetail;
import com.example.orderbackv1.domain.User;
import com.example.orderbackv1.mapper.CategoryMapper;
import com.example.orderbackv1.mapper.UserMapper;
import com.example.orderbackv1.service.CategoryService;
import com.example.orderbackv1.service.UserService;
import com.example.orderbackv1.service.impl.CategoryServiceImpl;
import com.example.orderbackv1.service.impl.GoodsDetailServiceImpl;
import com.example.orderbackv1.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class OrderBackV1ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private HomeController homeController;

	@Autowired
	private CategoryServiceImpl categoryService;

	@Autowired
	private CategoryMapper categoryMapper;

	@Autowired
	private GoodsDetailServiceImpl goodsDetailService;

	@Test
	void contextLoads() {
	}

	@Test
	void testConnection(){
		List<User> list = userMapper.selectList(null);
//		List<User> list = userService.list();
		System.out.println(list);
	}

	@Test
	void testSwiperData(){
		ApiResult<SwiperData> swiperData = homeController.getSwiperData();
		System.out.println(swiperData);
	}

	@Test
	void testCategory(){
//		Category category = new Category();
//		category.setCatName("咖啡");
//		category.setCatDeleted(0);
//		category.setCatIcon("https://api-demo.example.com/static/swiperdata1.jpg");
//		int insert = categoryMapper.insert(category);
//		boolean save = categoryService.save(category);
//		System.out.println(save);

		List<Category> list = categoryService.list();
		System.out.println(list);
	}


	@Test
	void testGoodsDetail(){
//		GoodsDetail goodsDetail = new GoodsDetail();
//		goodsDetail.setGoodsCat("1,2");
//		goodsDetail.setGoodsDeleted(0);
//		goodsDetail.setGoodsIntroduce("无");
//		goodsDetail.setGoodsNumber(100);
//		goodsDetail.setGoodsName("意式浓缩");
//		goodsDetail.setGoodsPrice(BigDecimal.valueOf(0.01));
//		goodsDetail.setGoodsState(1);
//		goodsDetail.setGoodsWeight(500);
//		goodsDetail.setPicUrl("xxxxx");
//		boolean save = goodsDetailService.save(goodsDetail);
//		System.out.println(save);
		System.out.println(goodsDetailService.list());
	}
}
