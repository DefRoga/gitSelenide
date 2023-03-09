
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class GitSolutions {
    @Test
      void Searching (){
        open ("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $$(".HeaderMenu-dropdown").findBy(visible).$("a").shouldHave(text("Enterprise")).click();
        $(".enterprise-hero h1").shouldHave(text("Build like the best"));
        sleep(4000);







    }




}
