package software.amazon.lastmile.kotlin.inject.anvil.sample

import android.app.Application
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.MergeComponent
import software.amazon.lastmile.kotlin.inject.anvil.SingleIn

/**
 * Concrete application component for Android using the scope [SingleIn] [AppScope].
 * [AndroidAppComponentMerged] is a generated interface. Through this merged interface
 * [ApplicationIdProviderComponent], other contributed component interfaces and contributed
 * bindings such as from [AndroidApplicationIdProvider] are implemented.
 *
 * Note that this component lives in an Android source folder and therefore types such as
 * [Application] can be provided in the object graph.
 */
@Component
@MergeComponent(AppScope::class)
@SingleIn(AppScope::class)
abstract class AndroidAppComponent(
    /**
     * The Android application that is provided to this object graph.
     */
    @get:Provides val application: Application,
) : AndroidAppComponentMerged
