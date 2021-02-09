package com.atguigu.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.gulimallproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zechao
 * @email zechao158@gmail.com
 * @date 2021-02-09 23:51:46
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

