package com.order.extention.api;

import com.alibaba.fastjson.JSON;
import com.order.extention.model.OrderInfo;
import com.order.extention.service.OrderInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 订单API
 *
 * @author partner
 * @create 2018-10-24 20:34
 */
@RestController
@RequestMapping("/orderInfo")
@Slf4j
public class OrderInfoController {
    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping("/modifyOrderInfo")
    public String modifyOrderInfo(Integer orderStatus) {
        try {
            List<OrderInfo> orderInfos = orderInfoService.selectOrderInfoByOrderStatus(orderStatus);
            for (int i = 0; i < orderInfos.size(); i++) {
                System.out.println("订单信息：" + JSON.toJSON(orderInfos.get(i)));
                log.info("【订单信息】 需要修改的订单状态的信息={}", orderInfos.get(i));
            }
            return "SUCCESS";
        } catch (Exception e) {
            e.printStackTrace();
            log.error("【修改订单状态】 修改订单信息异常信息={}", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/modifyOrderInfo2")
    public String modifyOrderInfo2(Integer orderStatus) {
        try {
            List<Map> orderInfos = orderInfoService.selectOrderInfoByOrderStatus2(orderStatus);
            for (int i = 0; i < orderInfos.size(); i++) {
                System.out.println("订单信息：" + JSON.toJSON(orderInfos.get(i)));
                log.info("【订单信息】 需要修改的订单状态的信息={}", orderInfos.get(i));
            }
            return "SUCCESS";
        } catch (Exception e) {
            e.printStackTrace();
            log.error("【修改订单状态】 修改订单信息异常信息={}", e.getMessage());
            return "error";
        }
    }
}
