// Human Readable Time

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        final int HOUR = 60*60;
        final int MINUTE = 60;

        int hours = (int) seconds / HOUR;
        seconds = seconds%HOUR;
        
        int minutes = (int) seconds / MINUTE;
        seconds = seconds%MINUTE;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

/* shorter, yeah
 * public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
  }
}
 */