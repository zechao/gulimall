package com.atguigu.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.gulimallproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zechao
 * @email zechao158@gmail.com
 * @date 2021-02-09 23:51:46
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

