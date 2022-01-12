package com.company;

public class Test{
        private int id;
        static int counter;

        static{
            counter = 105;
            System.out.println("Static initializer");
        }
        Test(){
            id=counter++;
            System.out.println("Constructor");
        }
        public void displayId(){
            System.out.printf("Id: %d \n", id);
        }


}
