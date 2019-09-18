import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
  const val appcompat: String = "1.1.0-rc01"

  const val espresso_core: String = "3.2.0"

  const val androidx_test_runner: String = "1.2.0"

  const val ch_tutteli_atrium: String = "0.8.0"

  const val aapt2: String = "3.5.0-5435860"

  const val com_android_tools_build_gradle: String = "3.5.0"

  const val lint_gradle: String = "26.5.0"

  const val de_fayard_buildsrcversions_gradle_plugin: String = "0.4.2"

  const val io_mockk: String = "1.9.3"

  const val junit: String = "4.12"

  const val dokka_gradle_plugin: String = "0.9.17" // available: "0.9.18"

  const val org_jetbrains_kotlin: String = "1.3.50"

  const val org_spekframework_spek2: String = "2.1.0-alpha.0.11+d97ef33"
       // available: "2.1.0-alpha.0.24+0fdeb6e"

  const val constraint_layout = "1.1.2"

  const val reyclerview = "28.0.0"


  /**
   *
   * See issue 19: How to update Gradle itself?
   * https://github.com/jmfayard/buildSrcVersions/issues/19
   */
  const val gradleLatestVersion: String = "5.6.1"

  const val gradleCurrentVersion: String = "5.6.1"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
  inline get() =
      id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
