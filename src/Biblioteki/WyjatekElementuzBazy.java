package Biblioteki;

public class WyjatekElementuzBazy extends Exception{
      public  WyjatekElementuzBazy(String s){
            super(s);
        }


    @Override
    public void printStackTrace() {

        super.printStackTrace();

        System.out.println("\nWYJATEK ELEMENTU BAZY\n");

    }
}
