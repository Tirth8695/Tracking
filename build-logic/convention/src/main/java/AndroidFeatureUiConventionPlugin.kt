import com.android.build.api.dsl.LibraryExtension
import com.tirth.convention.ExtensionType
import com.tirth.convention.addUiLayerDependencies
import com.tirth.convention.configureAndroidCompose
import com.tirth.convention.configureBuildTypes
import com.tirth.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin
class AndroidFeatureUiConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("tracking.android.library.compose")
            }
            dependencies {
               addUiLayerDependencies(target)
            }
        }
    }
}