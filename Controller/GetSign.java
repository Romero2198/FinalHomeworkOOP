package Controller;

import java.util.Scanner;

public class GetSign implements Sign{
    private Scanner in;
    @Override
    public String getSign(String message) {
        String result = "";
        boolean end = false;
        in = new Scanner(System.in);
        while (!end) {
            System.out.println(message);
            result = in.next();
            if(result.equals("+") || result.equals("-") || result.equals("*")
            || result.equals("/") || result.equals("Y") || result.equals("N")){
                end = true;
            }
        }
        return result;
    }
}
