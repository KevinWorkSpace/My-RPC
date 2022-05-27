package org.example.test;

import org.example.service.HelloService;
import org.example.service.HelloServiceImpl;
import org.example.server.RpcServer;

public class TestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService, 9000);
    }
}
