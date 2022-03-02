package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("input: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String text = br.readLine();
            System.out.println(text);
            if(text.toLowerCase().equals(text)) {
                throw new LowerCaseException();
            } else if(text.toUpperCase().equals(text)) {
                throw new UpperCaseException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static class LowerCaseException extends Exception {
        public LowerCaseException() {
            super("lower case exception");
        }
    }

    public static class UpperCaseException extends Exception {
        public UpperCaseException() {
            super("upper case exception");
        }
    }
}
