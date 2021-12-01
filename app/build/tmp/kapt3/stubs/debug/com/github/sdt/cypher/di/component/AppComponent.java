package com.github.sdt.cypher.di.component;

import java.lang.System;

/**
 * Created by luis rafael on 13/03/18.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/github/sdt/cypher/di/component/AppComponent;", "", "getInterfaceFirebase", "Lcom/github/sdt/cypher/data/rxFirebase/InterfaceFirebase;", "inject", "", "app", "Lcom/github/sdt/cypher/app/IsTheApp;", "accessibilityDataService", "Lcom/github/sdt/cypher/services/accessibilityData/AccessibilityDataService;", "notificationService", "Lcom/github/sdt/cypher/services/notificationService/NotificationService;", "app_debug"})
@dagger.Component(modules = {com.github.sdt.cypher.di.module.AppModule.class, com.github.sdt.cypher.di.module.FirebaseModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.app.IsTheApp app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.services.accessibilityData.AccessibilityDataService accessibilityDataService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.services.notificationService.NotificationService notificationService);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.github.sdt.cypher.data.rxFirebase.InterfaceFirebase getInterfaceFirebase();
}