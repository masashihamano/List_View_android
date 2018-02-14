package edu.misao.list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

        ListView listView;
        String array[] = {"red","blue","japan","india","apple","orange","dog","cat","delhi","tokyo","tomato","rice","potato","yellow","bag","laptop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ArrayAdapter adapter = new ArrayAdapter<String>( this,R.layout.list_view_layout,array );

        listView = findViewById( R.id.listView );

        listView.setAdapter( adapter );

    }



}
