package EXERCISE3;


public class Overload {
    public static int mutliply (int firstnumber, int secondnumber, int thirdnumber) {
        return firstnumber * secondnumber * thirdnumber;
    }
    public static int mutliply (int firstnumber,int secondnumber) {
        return firstnumber * secondnumber;
    }
    public static int mutliply (int firstnumber) {
        return firstnumber *100;
    }
}
