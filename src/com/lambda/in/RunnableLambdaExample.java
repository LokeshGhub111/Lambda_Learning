package com.lambda.in;

public class RunnableLambdaExample
{
    public static void main(String[] args)
    {

        /*
        By using java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }

        };

        new Thread(runnable).start();


        /*
        Now by using lambda syntax is () -> {};
         */

        Runnable runnableLambda0 =() -> {
        System.out.println("Inside runnable 2");
        };

        new Thread(runnableLambda0).start();

    // id have only single statement no need of curly braces below shown example

        Runnable runnableLambda1 =() -> System.out.println("Inside runnable 3");
        new Thread(runnableLambda1).start();


    // without creating runnable variable directly we can execute

        new Thread(()->System.out.println("Inside runnable 4")).start();





    }

}
