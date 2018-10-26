package com.order.extention.api;

import com.order.extention.model.AgentRelation;
import com.order.extention.service.AgentRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 代理商关系api
 *
 * @author partner
 * @create 2018-10-23 20:33
 */
@RestController
@RequestMapping("/agentRelation")
public class AgentRelationController {
    @Autowired
    private AgentRelationService agentRelationService;
    @PostMapping("/updateAgentRelation")
    public String updateAgentRelation(String password) {
        String s = agentRelationService.updateAgentRelationPwd(1, 100);
        return s;
    }
}
