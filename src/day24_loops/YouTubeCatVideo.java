package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting : world's smallest cat -BBC");
        int seconds = 0;
        while(seconds <=117){
            System.out.println("Watching YouTube video: second:" +seconds);
            seconds++;
            Thread.sleep(1000);

        }
        System.out.println("Finished watching cat video, lets start another one");




    }
}
