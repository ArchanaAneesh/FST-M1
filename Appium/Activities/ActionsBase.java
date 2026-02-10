package examples;

import java.awt.Point;
import java.util.Arrays;

import javax.sound.midi.Sequence;

import org.openqa.selenium.interactions.PointerInput;

import io.appium.java_client.AppiumDriver;

public class ActionsBase {
    private final static PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) 
    {
        Sequence swipe = new Sequence(finger, 1)
            .addAction(finger.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
            .addAction(finger.createPointerDown(LEFT.asArg()))
            .addAction(finger.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
            .addAction(finger.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }
}
