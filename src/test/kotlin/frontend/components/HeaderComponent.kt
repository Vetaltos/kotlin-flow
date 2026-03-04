package frontend.components

import com.codeborne.selenide.Selenide.`$$`
import frontend.extensions.findByDataTestIdOrFail


class HeaderComponent {

    private val navLinks = `$$`("[data-test-group='nav-link']")

    fun clickNavLinkByDataTestId(dataTestId: String) {
        navLinks.findByDataTestIdOrFail(dataTestId).click()
    }
}
