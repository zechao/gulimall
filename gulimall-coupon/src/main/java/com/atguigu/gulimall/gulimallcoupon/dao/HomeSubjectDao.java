package com.atguigu.gulimall.gulimallcoupon.dao;

import com.atguigu.gulimall.gulimallcoupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author zechao
 * @email zechao158@gmail.com
 * @date 2021-02-10 00:27:27
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
