package ua.edu.ucu.apps.task1;

public class Tray {
    private int denomination;
    private Tray nextTray;

    public Tray(int denomination) {
        this.denomination = denomination;

    }

    public void setNext(Tray tray) {
        this.nextTray = tray;
    }

    public void process(int amount) {
        if (nextTray != null) {
            nextTray.process(amount % denomination);
        } else if (amount % denomination > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("You should take " + amount / denomination + " of denomination " + denomination);

    }
}
