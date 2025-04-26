class thread1 implements Runnable
{
   Thread t2;
   int Tno;
   thread1(int Tno)
   {
      this.Tno=Tno;
      t2=new Thread(this,"Runnable in");
      t2.start();
   }
   @Override
   public void run()
   {
      for(int i=0 ; i<10 ; i++)
      {
        System.out.println("Thread "+Tno+ " : " +i+" ");
        try 
        {
            Thread.sleep(500);
          
        } 
        catch (Exception e) 
        {
            System.out.println("Exception Generate");
        }
      }
   }
}
public class MyThread {
    public static void main(String[] args) {
        try {
            thread1 t1=new thread1(1);
            t1.t2.join();
            thread1 t2=new thread1(2);
            t2.t2.join();
            thread1 t3=new thread1(3);
            t3.t2.join();
        } catch (Exception e) {
            System.out.println("Exception found ");
        }
    }
}
