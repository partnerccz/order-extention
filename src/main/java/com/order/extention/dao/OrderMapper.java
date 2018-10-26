package com.order.extention.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 订单
 *
 * @author partner
 * @create 2018-10-06 13:46
 */
@Repository
@Mapper
public interface OrderMapper {

    /**
     * 获取未归还的订单
     * @return
     */
    @Select("SELECT\n" +
            "\toi.ID as oId,\n" +
            "\toi.POWER_BI as powerBI,\n" +
            "\toi.`CODE` as orderCode,\n" +
            "\toi.MEMBER as member,\n" +
            "\tUNIX_TIMESTAMP(oi.ORDERTIME) as orderTime\n" +
            "FROM\n" +
            "\torderinfo oi\n" +
            "\tWHERE 1=1\n" +
            "\tAND oi.ORDER_STATUS = 1 ")
    List<Map> getOrderList();

    /**
     * 根据订单编号获取订单信息
     * @param orderCode
     * @return
     */
    @Select("SELECT\n" +
            "\toi.ID AS oId,\n" +
            "\toi.POWER_BI as powerBI,\n" +
            "\toi.`CODE` as orderCode,\n" +
            "\toi.MEMBER as member,\n" +
            "\tUNIX_TIMESTAMP(oi.ORDERTIME) as orderTime\n" +
            "FROM\n" +
            "\torderinfo oi\n" +
            "WHERE 1=1\n" +
            "\tAND oi.`CODE` = #{orderCode}\n")
    Map getOrderInfoByCode(String orderCode);

    @Select("SELECT\n" + "count(oi.id )" +
            "FROM\n" +
            "\torderinfo oi\n" +
            "\tWHERE 1=1\n" +
            "\tAND oi.ORDER_STATUS = 1 ")
    Integer getOrderCount();

}
