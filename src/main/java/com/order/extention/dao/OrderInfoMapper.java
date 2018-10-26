package com.order.extention.dao;

import com.order.extention.model.OrderInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderInfoMapper {

    /**
     * 根据订单状态获取订单集合
     * @param orderStatus
     * @return
     */
    List<OrderInfo> selectOrderInfoByOrderStatus(Integer orderStatus);

    List<Map> selectOrderInfoByOrderStatus2(Integer orderStatus);
}