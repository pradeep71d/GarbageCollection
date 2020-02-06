package com.example.demoapp12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestGarbage1 test1 = new TestGarbage1();//Garbage collection is process to destroy unreferenced objects.
        TestGarbage1 test2 = new TestGarbage1();
        test1 = null;// here we are nulling the references variables to achieve garbage collection.
        test2 = null;
        System.gc();//gc() method is used to invoke the garbage collector.
    }
}
