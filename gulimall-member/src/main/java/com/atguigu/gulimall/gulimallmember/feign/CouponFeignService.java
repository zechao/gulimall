package com.atguigu.gulimall.gulimallmember.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@FeignClient(value = "gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("gulimallcoupon/coupon/member/list")
    R memberCoupons();

}
