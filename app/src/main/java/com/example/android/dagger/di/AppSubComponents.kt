package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import dagger.Module

// This module tells AppComponent which are its subComponents
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class])
class AppSubComponents {
}