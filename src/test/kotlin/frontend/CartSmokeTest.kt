package frontend

import com.codeborne.selenide.Condition.exactText
import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.Selenide.`$$`
import frontend.components.HeaderComponent
import frontend.extensions.firstOrFail
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

import ru.sechko.frontend.helpers.BaseUiTest

@Feature("Cart")
@Story("Add product to cart")
@Tags(Tag("ui"), Tag("smoke"), Tag("frontend"))
class CartSmokeTest : BaseUiTest() {

    @Test
    fun shouldIncreaseCartCounterAfterAddingProduct() {
        val header = HeaderComponent()
        header.clickNavLinkByDataTestId("nav-link-products")

        `$$`("[data-test-group='product-card-increment']")
            .firstOrFail("product increment button")
            .click()

        header.clickNavLinkByDataTestId("nav-link-cart")

        `$$`("[data-test-id='nav-link-cart-count']")
            .firstOrFail("cart badge")
            .shouldBe(visible)
            .shouldHave(exactText("1"))
    }
}