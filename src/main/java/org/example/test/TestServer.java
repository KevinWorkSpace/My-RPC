package org.example.test;

import org.example.registry.DefaultServiceRegistry;
import org.example.registry.ServiceRegistry;
import org.example.service.HelloService;
import org.example.service.HelloServiceImpl;
import org.example.server.RpcServer;

public class TestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }
}

