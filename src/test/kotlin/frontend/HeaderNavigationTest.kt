package frontend

import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.`$$`
import com.codeborne.selenide.WebDriverRunner.url
import frontend.components.HeaderComponent
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

import ru.sechko.frontend.helpers.BaseUiTest

@Feature("Frontend navigation")
@Story("Header links")
@Tags(Tag("ui"), Tag("smoke"), Tag("frontend"))
class HeaderNavigationTest : BaseUiTest() {

    private data class HeaderRouteCheck(
        val dataTestId: String,
        val expectedPathPart: String,
        val pageAssertion: () -> Unit
    )

    @Test
    fun shouldNavigateThroughHeaderLinksFromList() {
        val header = HeaderComponent()
        val checks = listOf(
            HeaderRouteCheck("nav-link-products", "/products") {
                `$`("[data-test-id='products-title']").shouldBe(visible)
            },
            HeaderRouteCheck("nav-link-orders", "/orders") {
                `$`("md-outlined-text-field[placeholder='Order ID']").shouldBe(visible)
            },
            HeaderRouteCheck("nav-link-contact", "/contact") {
                `$`(".contact-title").shouldHave(text("Testing Playground Frontend"))
            },
            HeaderRouteCheck("nav-link-home", "/") {
                `$`("[data-test-id='main-image-text']").shouldHave(text("Welcome to Brew & Bean"))
            }
        )

        checks.forEach { check ->
            header.clickNavLinkByDataTestId(check.dataTestId)
            check.pageAssertion.invoke()
            val currentUrl = url() ?: ""
            assertTrue(currentUrl.contains(check.expectedPathPart)) {
                "Expected URL to contain '${check.expectedPathPart}', but got '$currentUrl'"
            }
        }
    }

    @Test
    fun shouldHaveNavigationLinksGroupedByDataTestGroup() {
        `$$`("[data-test-group='nav-link']")
            .shouldHave(CollectionCondition.sizeGreaterThanOrEqual(5))
    }
}