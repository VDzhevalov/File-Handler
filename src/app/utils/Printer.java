package app.utils;

public class Printer {

    public static void printResult(String result) {
        getOutput("RESULT: " + result);
    }

    public static void printContent(String content) {
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
