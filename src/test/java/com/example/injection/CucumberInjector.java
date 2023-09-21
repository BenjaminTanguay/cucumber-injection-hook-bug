package com.example.injection;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;

public class CucumberInjector implements InjectorSource {


    @Override
    public Injector getInjector() {
        System.out.println("Injection is called");
        return Guice.createInjector(
                Stage.PRODUCTION, CucumberModules.createScenarioModule(), new InjectionModule());
    }
}
