package com.lumen.testcases;

import java.util.Arrays;
import java.util.List;

public class User {
    public String greet(String username) {
        return "Hello"+username;

    }
    public int[]check(){
        return new int[] {10,20};
    }

    public List<String> showFruits() {
        return Arrays.asList("Mango","apple");
    }

}

 