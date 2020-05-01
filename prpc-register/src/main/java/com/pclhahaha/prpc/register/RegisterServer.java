package com.pclhahaha.prpc.register;

import com.alipay.sofa.jraft.JRaftUtils;
import com.alipay.sofa.jraft.conf.Configuration;
import com.alipay.sofa.jraft.entity.PeerId;
import com.alipay.sofa.jraft.util.Endpoint;

/**
 * @description:
 * @author: panchenlei
 * @create: 2020-04-30 13:27
 **/
public class RegisterServer {

    public static void main(String[] args) {

    }

    private void start() {
        Endpoint addr = JRaftUtils.getEndPoint("localhost:8080");
        PeerId peer = JRaftUtils.getPeerId("localhost:8080");
        // 三个节点组成的 raft group 配置，注意节点之间用逗号隔开
        Configuration conf = JRaftUtils.getConfiguration("localhost:8081,localhost:8082,localhost:8083");
    }
}
