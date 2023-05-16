import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentStationBetweenMinMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationBetweenMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationMoreThanMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeBetweenMinMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeLessThanTheMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeUpMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationBetweenMinMaxWithButtonNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationWithButtonNextToMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationWithButtonNextWhenMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationWithButtonPrevBetweenMinMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationWithButtonPrevToMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationWithButtonPrevWhenMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeBetweenMinMaxWithButtonVolumeUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);
        radio.volumeUp();

        int expected = 16;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeMoreThanMaxWithButtonVolumeUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeBetweenMinMaxWithButtonVolumeDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);
        radio.volumeDown();

        int expected = 14;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeLessThanMinWithButtonVolumeDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetCurrentStationAndVolumeWithButtonNextAndVolumeUpWhenMax() {
        Radio radio = new Radio(20,100);

        radio.setCurrentStation(19);
        radio.next();
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expectedStation = 0;
        int expectedVolume = 100;
        int actualStation = radio.getCurrentStation();
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedStation, actualStation);
        Assertions.assertEquals(expectedVolume, actualVolume);


    }

    @Test
    public void shouldSetCurrentStationAndVolumeWithButtonNextAndVolumeDownWhenMin() {
        Radio radio = new Radio(20, 100);

        radio.setCurrentStation(0);
        radio.prev();
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expectedStation = 19;
        int expectedVolume = 0;
        int actualStation = radio.getCurrentStation();
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedStation, actualStation);
        Assertions.assertEquals(expectedVolume, actualVolume);


    }


}
