package com.order.extention.service;

import com.order.extention.model.OrderInfo;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 订单服务
 *
 * @author partner
 * @create 2018-10-24 20:32
 */
public interface OrderInfoService {
    /**
     * 根据订单状态获取订单集合
     * @param orderStatus
     * @return
     */
    List<OrderInfo> selectOrderInfoByOrderStatus(Integer orderStatus);

    List<Map> selectOrderInfoByOrderStatus2(Integer orderStatus);
}
