package gitHubHover;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class GitHoverTest {
@Test
    void GitSolutionsHoverTest() {
    //open page
        open("https://github.com/");
    //go to Enterprise
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
    //check up
        $(".application-main h1").shouldHave(text("Build like the best"));
    }
}
