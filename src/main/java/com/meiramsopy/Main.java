package com.meiramsopy;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        //System.out.println("Hello world!");

        Server server = ServerBuilder.forPort(8081).addService(new GreetingServiceImpl()).build();

        server.start();

        System.out.println("Server started!");

        server.awaitTermination();
    }
}