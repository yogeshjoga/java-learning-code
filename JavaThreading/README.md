# Java multi-Threading
   1) Introduction
   2) The ways to define a Thread
            1) By extending Thread class
            2) By extending Runnable(j) method
   3) Getting & Setting name or Thread
it is very importent
   4) Thread Priorities
   5) The methods to Prevent Thread excecution
            1) yield()
            2) join()
            3) sleep()
   6) Synchronization
   7) Inter Thread Communication
   8) Deadlock
   9) Deamon Threads
   10) multiThreading Enhancement


# Introduction
    Multitasking are two types 

    process based multitasking
      example: 
               for example yogi ur doing coding at night time 
                 u can coding also and listen music
                 downloading videos 
                 these 3 tasking is called process based multitasking



    thread based multitasking
        example:
              For example u wrote a coding 10k lines 
                its compile takes to time 10hrs 
                 it is very huge time to take complation
                 so we can reduce the time to take complation
                 thats y we can excuting the part to part compilation
                 in the code.
                 each independent part is called Thread 
                 it is best suitable the programming level to multitasking
        
        one real world example is :
                in any action we can perform the one task
                  like playing cricket one man only bloweing 
                  no one is batting. after complete blowling 
                  go to the batsman to pitch he will play without
                  blower. it is called single tasking

                  if multitasking is happen in cricket 
                  at a time we can play blowing and batting feilding
                  also, so can perfer to user multitaksing only it is
                  used to simplfy and time reducing, increasing performance.

         The most important applications in area to used in multithreading
                To develop multimeda app's
                To develop animations
                To develop Video Games
                To develop Web Servers and Application Servers
        
        we can perform independent operations at a time we need to take help 
        from multithreading. 
         Assume if im search the one file in my desktop 
         it will search like first take C drive at First folder First file
         and search it......
         onec start the searching the files from C drive it take the 10 hrs
         to check the files is there are not.. after completed C drive next 
         it will jump into the D drive again same cinima is happen into the D
         Drive searching.. after E drive and F drive  
          complete my hard disc to scan and search the files it will take 2 to 4 days

         If we will go multithreading at a time we can scan all C D E and F drives at a 
         scan and search the files from the hard disc it will imporove effiencey and 
         performance to easy to find the files from hard disc.....
                 
         In java mutlitherading we used 90% of work by using API's only.
         if developer is develop the multithreading only 10% of code will be develop
         we can develop threading (Thread, Runnable ThreadGroup.. )     
         where thread is the class and Runnable is the Intraface.

# How many way to develop the Thread

    Define a Thread
     we can define a Thread two types
        1 By extending a Thread class
        2 By Implementing a Runnable interface
   

   what is thread?
    flow of excution is called Thread.
   
   what is multi-Thread 
    more then one flow of excution at a time is called mutlithreading

1 Extending a Thread Class
```java
        class MyThread extends Thread{ //Define a Thread
            public static void run{
                for(int i=0; i<=100; i++){ // this is the JOB OF a Thread
                    System.out.println("child Thread");
                    // this for loop is excuted by child thread
                }
            }
        }
/*
* the first code is child code to extends thread class
* the second code is having main method and main thread 
* we can use excuted by using main thread and flow with the child thread.
* 
*/
        //start the define thread
        class ThreadDemo{
             public static void main(String[] args){ // main thread starts
                 MyThread t = new MyThread();// thread instation
                 t.start(); // 2 threads are main and child Thread
                for(int i=0; i<=100; i++){ // this is the JOB OF a Thread
                    System.out.println("Main Thread");
                    // this for loop is excuted by main thread only
                }    
            }
        }

        Today my hear??? was broken???????????? so sad day to me fu*cing 
          but i can't leave you my dear darling java.. i am with you 
          your are also with me 
           with out you (java)  im useless
```
# How to develop the threads in java 
  the following are various possible outputs 
  main thread 10 times
  child thread 10 times

  // child thread 

   child thread 10 times
   main thread 10 times

   case-2 
      
       Differnt b/w the t.start() & t.run()
       In the case a new thread will be created which is responceable to for the excution of run method
        but in the case t.run() a new thread wont be created
        and the run() will be excuted just like a normal method called by main thread.
        Hence 
            In the above programm if we replace t.start() with t.run() than the output is child thread child thread 10 times followed by main thread main thread 10 times
            this total output producted by only main thread.

    
```java

   syntex of the start() with run()
    start(){
        register this thread with thread scheduler
        perform all orther mandotry activities
        Invoke run() method
    }

   // in thread class having overloading methods 
      // to invoke to main thread it will print only no arg method only prints
      // we can call expilcitly in argument methods
      for example is:
        class MyThread extends Thread{
            public void run(){
                System.out.println("no arg method");
            }
            public void run(int a){
                System.out.println("arg method");
            }
        }

    class ThreadMY{
        p s v m(s[]a{
            MyThread t = new MyThread();
        })
    }


if we are not override then thread class run method will be excuted which as empty implementation.

NOTE:
It is highly recommended to override the run method ortherwise don't don't go for the multithreading concepts.
    if i am not.

overriding start() method then our start method will be excuted 
just like a normal method call and new thread won't be created.


 class MyThread extends Thread{
     public void start(){
         sopln("start method");
     }
     public void run(){
         sopln("Run Method")
     }
 }

class test{
    psvm(s[]a){
        MyThread t = new MyThread();
        t.start();
        sopln("main method")
    }
}
o/p start method main method produced by only main thread
```




# Base life cycle of the java multithreading
  MyThread t = new MyThread(); // new/ born stat
     |
     | t.start();
     |
  Ready/Runnable
     |
     | if Thread Shedular allow process
     |
     |
 Running
     |
     | if run()
     | method completed
     |
  Dead state


run time exception if we start the thread once after we will try to restart the thread it will goes to the run time exception.

 IllegalThreadException.
 

 # Defining a Thread by implementing Runnabale intraface()
  
   Runnable
      |     |
      |     |
      |     MyRunnable
      |     2nd approch
    Thread
      |
      |
      |
    myThread

1st approach


```java
        class MyRunnable implements Runnable{
            public void run(){
                for(int i=0; i<=100;i++){
                    sopln("child Thread");
                }
            }
        }

 class ThreadDemo{
             public static void main(String[] args){ // main thread starts
             MyRunnable r = new MyRunnable(); // it is the implemented from the Runnable intraface
                 Thread t = new Thread(r);// thread instation
                 t.start(); // 2 threads are main and child Thread
                for(int i=0; i<=100; i++){ // this is the JOB OF a Thread
                    System.out.println("Main Thread");
                    // this for loop is excuted by main thread only
                }    
            }
        }
        
```

# Thread class constructors
   
    

 Thread t = new Thread()  

 Thread t = new Thread(Runnable r)  

 Thread t = new Thread(String name )  

 Thread t = new Thread(Runnable r, String name)  

 Thread t = new Thread(ThreadGroup 9, String name)  

 Thread t = new Thread(ThradGroup 9 , Runnable r)  



Thread.currentThread()
getName();



# Thread Priorities
   


   