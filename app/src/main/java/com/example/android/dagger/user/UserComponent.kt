package com.example.android.dagger.user

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

// Scope annotation that the UserComponent uses
// Classes annotated with @LoggedUserScope will have a unique instance in this Component
@LoggedInUserScope
@Subcomponent
interface UserComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}