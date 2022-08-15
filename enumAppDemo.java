import javax.swing.JOptionPane;

public class WeekDays {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void telDayMood() {
        int index = JOptionPane.showOptionDialog(
                null,
                "Enter the day of the week.",
                "Moody",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                Day.values(),
                Day.MONDAY);

        Day day = Day.values()[index];
        switch (day) {
            case MONDAY:
                JOptionPane.showMessageDialog(null, "Mondays are bad.");
                break;
            case FRIDAY:
                JOptionPane.showMessageDialog(null, "Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                JOptionPane.showMessageDialog(null, "Weekends are best");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Midweek days are so-so.");
                break;
        }
        System.exit(0);
    }
}