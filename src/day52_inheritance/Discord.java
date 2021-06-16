package day52_inheritance;

public class Discord extends MobileApp {

    public void chat(String someone) {
        System.out.println("Chatting with " + someone + "on discord");
    }

    @Override
    public boolean download() {
        System.out.println("Download Discord 0.0.23 from App store");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Mariam");
    }

    public void printInfo(){
        System.out.println("App Name + " + getName());
        System.out.println("App version " + getVersion());
    }
}
