package lesson15;

// Exception
public class App1 {
    public static void main(String[] args) {

       int a = 5;
       int b = 0;

        System.out.println("Before try catch");

       // при b=2 в выражении c=a/b в запуске (итерации) показывает "Process finished with exit code 0" - это значит что все прошло хорошо и никаких ошибок в программе и коде нет
       // но если мы ставим b=0 в выражении c=a/b, то при запуске показывает "Process finished with exit code 1" - показывает что в коде есть ошибка и указывает где она (на 0 делить нельзыя)

       // если есть возможно опастный участок кода мы должны его обработать (Handler) или в Java называется поставить try-catch

       try{
           System.out.println("Before Exception");
           int c=a/b;
           System.out.println("After potential problem in the try block");
       } catch (ArithmeticException err){                                  // попадаем в этот блок только если появилась ошибка (Exception)
           System.out.println("Exception happens - let handle it");
       } catch (ArrayIndexOutOfBoundsException err){    // другая возможная ошибка
            System.out.println("Second catch block");
        } catch (Exception err){                        // выводит при любой найденой ошибке
           System.out.println("Catch all exception");
       } finally {                                      // выводится в любом случае
           System.out.println("I wiil run in ANY case");
       }
        // при запуске выдает "Process finished with exit code 0", но если выражение неверное то выдает указанную надпись

        System.out.println("After try/catch");


    }
}
