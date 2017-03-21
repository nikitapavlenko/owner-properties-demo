package com.mykytapavlenko;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;


public class ConfigDemo {

    private static void print(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        AppConfig configApp = ConfigFactory.create(AppConfig.class);
        print("Max threads:" + configApp.maxThreads());
        print("DB URL: " + configApp.databaseConnectionUrl());
        print("Timeout " + configApp.dbTimeout().getAmount() + " " + configApp.dbTimeout().getTimeUnit());
        print("Usernames: " + configApp.serverUsernames());
        print("URL: " + configApp.serverBlogUrl());
    }

}




