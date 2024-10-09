//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InputDevice inputDevice = new InputDevice();
        Application application = new Application(inputDevice);
        OutputDevice outputDevice = new OutputDevice();
        application.run();

    }}
