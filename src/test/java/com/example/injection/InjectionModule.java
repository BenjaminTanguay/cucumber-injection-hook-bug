package com.example.injection;

import com.example.hook.Hook;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class InjectionModule extends AbstractModule {


    @Override
    protected void configure() {
        System.out.println("Before static injection is requested");
        requestStaticInjection(Hook.class);
    }

    @Singleton
    @Provides
    public String providesSomeString() {
        return "Hello world";
    }
}
