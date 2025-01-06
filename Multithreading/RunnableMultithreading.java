class MyRunnable implements Runnable{
public void run(){
for(int i=0; i<5; i++){
System.out.println("Runnable: "+i);
}
try{
Thread.sleep(500);
}
catch(InterruptedException e){
System.out.println(e);
}
}
}

public class RunnableMultithreading{
public static void main(String args[]){
MyRunnable task = new MyRunnable();
Thread t1 = new Thread(task);
Thread t2 = new Thread(task);
t1.start();
t2.start();
}
}