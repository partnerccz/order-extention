package com.order.extention.service;

import com.order.extention.model.OrderInfo;
import org.omg.CORBA.INTERNAL;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 订单服务
 *
 * @author partner
 * @create 2018-10-06 13:49
 */
public interface OrderService {
    List<Map> getOrderList();

    Map getOrderInfoByCode(String orderCode);

    Integer getOrderCount();


}
