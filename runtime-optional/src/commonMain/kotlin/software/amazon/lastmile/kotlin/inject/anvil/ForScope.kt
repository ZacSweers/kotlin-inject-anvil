package software.amazon.lastmile.kotlin.inject.anvil

import me.tatarka.inject.annotations.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.FUNCTION
import kotlin.reflect.KClass

/**
 * Commonly shared qualifier to tie types provided in multiple scopes to a particular [scope], e.g.
 * ```
 * @Inject
 * @ContributesBinding(AppScope::class)
 * @ForScope(AppScope::class)
 * class UnauthenticatedHttpClient : HttpClient
 *
 * @Inject
 * @ContributesBinding(LoggedInScope::class)
 * @ForScope(LoggedInScope::class)
 * class AuthenticatedHttpClient : HttpClient
 * ```
 *
 * For Android and JVM targets this annotation is also marked with JSR-330 annotations and
 * therefore the same annotation can be used for Dagger 2 and Anvil.
 */
@Qualifier
@Retention(RUNTIME)
@Target(CLASS, FUNCTION)
public expect annotation class ForScope(
    /**
     * The marker that identifies this scope.
     */
    val scope: KClass<*>,
)
