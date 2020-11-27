package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {

    ListView simpleList;
    String countryList[] = {"iphone1", "iphone2", "iphone3", "iphone4", "iphone5", "iphone6"};
    int flags[] = {R.drawable.iphone1, R.drawable.iphone2, R.drawable.iphone3, R.drawable.iphone4, R.drawable.iphone5, R.drawable.iphone6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);

         // listview onclick listener

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, OtherScreen.class);
                startActivity(intent);
            }
        });

    }
}
