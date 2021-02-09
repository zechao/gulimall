package com.atguigu.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.gulimallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zechao
 * @email zechao158@gmail.com
 * @date 2021-02-09 23:51:46
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

