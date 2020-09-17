package com.github.codehaocode.firstnotificationmanagerapp.di.modules;

import com.github.codehaocode.firstnotificationmanagerapp.MainActivity;
import com.github.codehaocode.firstnotificationmanagerapp.services.NotificationProcessor;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ComponentsModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector
    abstract NotificationProcessor contributeForegroundService();

    @ContributesAndroidInjector
    abstract AppForegroundService contributeAppForegroundService();

    @ContributesAndroidInjector
    abstract NotificationJobScheduler contributeNotificationJobScheduler();
}