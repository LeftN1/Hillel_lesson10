
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestLamp {
    Lamp lamp1 = new Lamp(0);
    Lamp lamp2 = new Lamp(1);
    Lamp lamp3 = new Lamp(2);
    Lamp lamp4 = new Lamp(3);

    @Test
    public void testCantLigthIfNoBattery(){
        assertThat(lamp1.getState(),equalTo(State.OFF));
        assertThat(lamp1.whiteLight(),equalTo(false));
        assertThat(lamp1.redLight(),equalTo(false));
        assertThat(lamp1.blink(),equalTo(false));
    }
    @Test
    public void testWhiteLight(){
        assertThat(lamp2.whiteLight(),equalTo(true));
        assertThat(lamp2.getState(),equalTo(State.WHITE));
    }
    @Test
    public void testRedLight(){
        assertThat(lamp3.redLight(),equalTo(true));
        assertThat(lamp3.getState(),equalTo(State.RED));
    }
    @Test
    public void testBlinkLight(){
        assertThat(lamp4.blink(),equalTo(true));
        assertThat(lamp4.getState(),equalTo(State.BLINK));
    }
    @Test
    public void addingBattery(){
        lamp1.setBattery(0);
        lamp1.addBattery(1);
        assertThat(lamp1.getBattery(),equalTo(1));
    }
    @Test
    public void cantAddMoreThanFiveBattery(){
        lamp1.setBattery(0);
        lamp1.addBattery(6);
        assertThat(lamp1.getBattery(), lessThanOrEqualTo(5));
    }
    @Test
    public void removingBattery(){
        lamp1.setBattery(4);
        lamp1.removeBattery(1);
        assertThat(lamp1.getBattery(),equalTo(3));
    }
    @Test
    public void cantBeLessThanZeroBattery(){
        lamp1.setBattery(1);
        lamp1.removeBattery(2);
        assertThat(lamp1.getBattery(),equalTo(0));
    }
    @Test
    public void cantSetMoreThanFiveBattery(){
        lamp1.setBattery(6);
        assertThat(lamp1.getBattery(),equalTo(5));
    }
    @Test
    public void cantSetLessThanZeroBattery(){
        lamp1.setBattery(-1);
        assertThat(lamp1.getBattery(),equalTo(0));
    }
}
