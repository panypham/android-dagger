package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

// Definition of a Dagger component that adds info from the storageModule to the graph\
@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {

    // Factory to create instance of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: RegistrationActivity)
    fun inject(activity: MainActivity)
}