/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package krupet

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test fun `test app has agreeting`() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
