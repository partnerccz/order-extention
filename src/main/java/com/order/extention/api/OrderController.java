package com.order.extention.api;

import com.alibaba.fastjson.JSON;
import com.order.extention.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 描述:
 * 订单接口
 *
 * @author partner
 * @create 2018-10-06 13:51
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    public static final String POWER_BI_SUF = "-Borrow";
    @Autowired
    private OrderService orderService;

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/setOrderRedisByOrderCode")
    public String getOrderList(String orderCode) {
        Map map = orderService.getOrderInfoByCode(orderCode);
        Long oId = Long.parseLong(map.get("oId") + "");
        String powerBI = map.get("powerBI") + "";
        Long memberId = Long.parseLong(map.get("member") + "");
        Integer orderTime = Integer.parseInt(map.get("orderTime") + "");
        if (map != null && powerBI != null) {
            if (!redisTemplate.hasKey(powerBI + POWER_BI_SUF) || redisTemplate.opsForValue().get(powerBI + POWER_BI_SUF) == null) {
                redisTemplate.opsForValue().set(powerBI + POWER_BI_SUF, orderTime);
                log.warn("【单个】ORDER-INFO={}", JSON.toJSON(map));
                return "修改成功！";
            }
            return "该订单已设置！";
        }else{
            return "订单不存在，请核对后再试！";
        }
    }


    @GetMapping("/getOrderList")
    public List<Map> getOrderList() {
        List<Map> orderList = orderService.getOrderList();
        for (int i = 0; i < orderList.size(); i++) {
            Map map = orderList.get(i);
            Long oId = Long.parseLong(map.get("oId") + "");
            String powerBI = map.get("powerBI") + "";
            String orderCode = map.get("orderCode") + "";
            Long memberId = Long.parseLong(map.get("member") + "");
            Integer orderTime = Integer.parseInt(map.get("orderTime") + "");
            if (!redisTemplate.hasKey(powerBI + POWER_BI_SUF) || redisTemplate.opsForValue().get(powerBI + POWER_BI_SUF) == null) {
                redisTemplate.opsForValue().set(powerBI + POWER_BI_SUF, orderTime);
                log.warn("【批量】ORDER-INFO={}", JSON.toJSON(map));
            }
//            redisTemplate.delete(powerBI + POWER_BI_SUF);
        }
        return orderList;
    }


    @GetMapping("/getOrderCount")
    public Integer getOrderCount() {
        Integer count = orderService.getOrderCount();
        return count;
    }



}
