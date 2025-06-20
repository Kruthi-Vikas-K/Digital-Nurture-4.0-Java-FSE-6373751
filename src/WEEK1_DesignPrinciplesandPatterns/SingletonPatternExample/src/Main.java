package WEEK1_DesignPrinciplesandPatterns.SingletonPatternExample.src;
public class Main {
    public static void main(String[] args) {
        WEEK1_DesignPrinciplesandPatterns.SingletonPatternExample.src.Logger logger1 = WEEK1_DesignPrinciplesandPatterns.SingletonPatternExample.src.Logger.getInstance();
        logger1.log("First message");
        WEEK1_DesignPrinciplesandPatterns.SingletonPatternExample.src.Logger logger2 = WEEK1_DesignPrinciplesandPatterns.SingletonPatternExample.src.Logger.getInstance();
        logger2.log("Second message");
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}


