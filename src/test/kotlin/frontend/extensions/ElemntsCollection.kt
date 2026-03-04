package frontend.extensions

import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.Condition.attribute
import com.codeborne.selenide.Condition.exist
import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.SelenideElement
import java.time.Duration

fun ElementsCollection.findByDataTestIdOrFail(
    dataTestId: String,
    timeout: Duration = Duration.ofSeconds(10)
): SelenideElement {
    try {
        this.shouldHave(CollectionCondition.sizeGreaterThan(0), timeout)
        val element = this.findBy(attribute("data-test-id", dataTestId))
        element.shouldBe(exist, timeout)
        return element
    } catch (error: AssertionError) {
        throw AssertionError(
            "Element with data-test-id='$dataTestId' was not found in collection: $this. " +
                    "Expected at least one matching element within ${timeout.toSeconds()}s.",
            error
        )
    }
}

fun ElementsCollection.firstOrFail(
    elementDescription: String,
    timeout: Duration = Duration.ofSeconds(10)
): SelenideElement {
    try {
        this.shouldHave(CollectionCondition.sizeGreaterThan(0), timeout)
        return this.first()
    } catch (error: AssertionError) {
        throw AssertionError(
            "Collection for '$elementDescription' is empty: $this. " +
                    "Expected at least one element within ${timeout.toSeconds()}s.",
            error
        )
    }
}