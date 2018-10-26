package com.order.extention.dao;

import com.github.pagehelper.Page;
import com.order.extention.model.AgentRelation;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface AgentRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AgentRelation record);

    int insertSelective(AgentRelation record);

    AgentRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgentRelation record);

    int updateByPrimaryKey(AgentRelation record);

    Page<AgentRelation> getAgentRelationByPage();
}