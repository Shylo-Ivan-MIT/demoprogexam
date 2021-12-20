package com.example.demo;

import java.io.PrintWriter;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
import java.util.*;

@SpringBootApplication

public class DemoApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] list = {16,26,30,31,11,9,12};
        int min = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i]<min)
                min = list[i];
        }
        out.print("Minimal value in list is " + min);
        
        long a = in.nextLong();
        long d = in.nextLong();
        long n = in.nextLong();
        long N;
        N = a + d*(n-1);
        out.print("   The value of n-element " + N);
        out.flush();
    }
}