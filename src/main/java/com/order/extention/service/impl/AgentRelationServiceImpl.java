package com.order.extention.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.order.extention.dao.AgentRelationMapper;
import com.order.extention.model.AgentRelation;
import com.order.extention.service.AgentRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 代理商关系表实现类
 *
 * @author partner
 * @create 2018-10-23 20:13
 */
@Service
@Slf4j
public class AgentRelationServiceImpl implements AgentRelationService {

    @Autowired
    private AgentRelationMapper agentRelationMapper;

    @Override
    public String updateAgentRelationPwd(Integer pageNum,Integer pageSize) {
        updateAgentRelation(pageNum, pageSize, "");
        return "SUCCESS";
    }
    private static Integer count= 0;
    private void updateAgentRelation(Integer pageNum,Integer pageSize,String pwd) {
        if (pageNum == null || pageNum == 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize== 0) {
            pageSize = 100;
        }
        PageHelper.startPage(pageNum, pageSize);
        Page<AgentRelation> agentRelationByPage = agentRelationMapper.getAgentRelationByPage();
        PageInfo<AgentRelation> pageInfo = new PageInfo<>(agentRelationByPage);
        List<AgentRelation> list = pageInfo.getList();
        for (int i = 0; i < list.size(); i++) {
            count++;
            AgentRelation agentRelation = list.get(i);
            log.info("count={},agentRelation={}",count, JSON.toJSON(agentRelation));
        }
        if (pageInfo.getTotal() > pageNum * pageSize + pageSize) {
            updateAgentRelation(pageNum, pageSize, pwd);
        }
    }
}
