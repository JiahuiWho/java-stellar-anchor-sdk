package org.stellar.anchor.platform

import org.junit.jupiter.api.*

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class AnchorPlatformCustodyEnd2EndActionsTest :
  AbstractIntegrationTest(TestConfig(profileName = "sep24-custody-actions")) {

  companion object {
    private val singleton = AnchorPlatformCustodyEnd2EndActionsTest()

    @BeforeAll
    @JvmStatic
    fun construct() {
      singleton.setUp(mapOf())
    }

    @AfterAll
    @JvmStatic
    fun destroy() {
      singleton.tearDown()
    }
  }

  @Test
  @Order(1)
  fun runSep24Test() {
    singleton.sep24CustodyE2eTests.testAll()
  }
}
