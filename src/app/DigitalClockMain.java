package app;

public class DigitalClockMain {

	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		DigitalClock clock = new DigitalClock(timer);
	}

}
