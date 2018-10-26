package com.order.extention.service.impl;

import com.order.extention.dao.OrderMapper;
import com.order.extention.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 订单
 *
 * @author partner
 * @create 2018-10-06 13:49
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Integer getOrderCount() {
        return orderMapper.getOrderCount();
    }

    @Override
    public List<Map> getOrderList() {
        return orderMapper.getOrderList();

    }

    @Override
    public Map getOrderInfoByCode(String orderCode) {
        return orderMapper.getOrderInfoByCode(orderCode);
    }
}
