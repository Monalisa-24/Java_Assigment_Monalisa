class Thread1{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : "+t);
        t.setName("My Thread 1");

        System.out.println("After changing the name, Current Thread : "+t);

        try{
            for(int i =5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main Thread Interrupted.");
        }
    }
}