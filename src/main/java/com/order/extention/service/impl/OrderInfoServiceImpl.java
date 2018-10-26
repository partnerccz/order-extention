package com.order.extention.service.impl;

import com.order.extention.dao.OrderInfoMapper;
import com.order.extention.model.OrderInfo;
import com.order.extention.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 订单实现类
 *
 * @author partner
 * @create 2018-10-24 20:33
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> selectOrderInfoByOrderStatus(Integer orderStatus) {
        return orderInfoMapper.selectOrderInfoByOrderStatus(orderStatus);
    }

    @Override
    public List<Map> selectOrderInfoByOrderStatus2(Integer orderStatus) {

        return orderInfoMapper.selectOrderInfoByOrderStatus2(orderStatus);
    }
}
