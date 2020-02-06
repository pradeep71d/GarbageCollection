package com.example.demoapp12;

public class TestGarbage1 {
    public void finalize(){// finalize() is used for cleanup process
      System.out.println("object is garbage collected");
    }
}
