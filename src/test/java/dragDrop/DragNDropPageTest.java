package dragDrop;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class DragNDropPageTest {
    @Test
    void checkAtoBDragDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").shouldHave(exactText("A"));

//        Trying to perform drag and drop with actions(), but it doesn't work
//        actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().build().perform();

        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(exactText("B"));
    }
}
