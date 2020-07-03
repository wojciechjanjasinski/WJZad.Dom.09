package AirConditioning;

public class TestRoomConditions {
    private static final int testRoomNumber = 1;
    private static final double TEMPERATURE_ONE = 32; // 32° stopni celsiusza
    private static final double DESIRED_TEMPERATURE_ONE = 25; // 35° stopni celsiusza to pożądana temperatura jaką chcemy osiagnąć z pomocą klimatyzacji
    private static final double ROOM_ONE_METRIC_LENGTH = 12; // 35° stopni celsiusza to pożądana temperatura jaką chcemy osiagnąć z pomocą klimatyzacji

    public TestRoomConditions() {
    }

    public static int getTestRoomNumber() {
        return testRoomNumber;
    }

    public static double getTemperatureOne() {
        return TEMPERATURE_ONE;
    }

    public static double getDesiredTemperatureOne() {
        return DESIRED_TEMPERATURE_ONE;
    }

    public static double getRoomOneMetricLength() {
        return ROOM_ONE_METRIC_LENGTH;
    }

}
