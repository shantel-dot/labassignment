package com.tts.threads;

public class BadThreads {

    static String message;



    private static class CorrectorThread extends Thread {

        public void run() {

            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }
            System.out.println("Mares do eat oats.");
        }

    }



    public static void main(String[] args)  throws InterruptedException {
        Thread thread = new Thread (new CorrectorThread());
        thread.start();

        Thread.sleep(2000);
        System.out.println("Mares do not eat oats!");


    }

}



//      2. The application should print out "Mares do eat oats."
//
//- Is it guaranteed to always do this?
//  -I think that is only guaranteed if you use the catch method and the thread start I think?
//
//- If not, why not?
//
//
//
//3. Would it help to change the parameters of the two invocations of Sleep?
//  -I don't think it matters cause the output will be the same
//
//
//
//4. How would you guarantee that all changes to message will be visible in the main thread?
//
//   -Changes will be implemented if you use the sout(System.out.print) method
//
//
//Please type your answers and submit.
//
//
//com.tts
