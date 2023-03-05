import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class JUnitPlatform {

    @Test
    void codeSampleCheckTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $(".wiki-rightbar").shouldHave(text("JUnitPlatform"));
        $(".wiki-rightbar").$(byText("JUnitPlatform")).click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));

    }
}



