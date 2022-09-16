public class Main {
    public static void main(String[] args) {

        for(int i=1; i < 10; i++) {
            new JThread("JThread " + i).start();
        }
        System.out.println("главный поток");
    }
}
class JThread extends Thread {

    JThread(String name){
        super(name);
    }

    public void run(){

        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s \n", Thread.currentThread().getName());
    }
}