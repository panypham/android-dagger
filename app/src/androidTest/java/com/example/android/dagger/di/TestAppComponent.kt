package com.example.android.dagger.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestStorageModule::class, AppSubComponents::class])
interface TestAppComponent : AppComponent{
}