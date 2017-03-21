package com.mykytapavlenko;

import com.mykytapavlenko.TimeOut;
import com.mykytapavlenko.TimeoutConverter;
import org.aeonbits.owner.Config;

import java.net.URL;
import java.util.List;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:db.properties", "classpath:config/server.properties"})
public interface AppConfig extends Config {

    @DefaultValue("10")
    int maxThreads();

    @Key("db.url")
    String databaseConnectionUrl();

    @ConverterClass(TimeoutConverter.class)
    TimeOut dbTimeout();

    @Separator(",")
    @Key("server.usernames")
    List<String> serverUsernames();

    @Key("server.blog.url")
    URL serverBlogUrl();

}