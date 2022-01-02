package hw2.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MovingElement {

    @Test
    public void movingAtoB() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        //doesn’t work
        // actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
        $("#column-a").find(byText("B")).shouldBe(visible);
        $("#column-b").find(byText("A")).shouldBe(visible);
    }
}
