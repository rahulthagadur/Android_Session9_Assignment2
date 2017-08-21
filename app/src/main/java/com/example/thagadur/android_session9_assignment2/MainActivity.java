package com.example.thagadur.android_session9_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //adding menu without creating men.xml by calling men.add function
        menu.add(Menu.NONE,1,Menu.NONE,"Item 1");
        menu.add(Menu.NONE,2,Menu.NONE,"Item 2");
        menu.add(Menu.NONE,3,Menu.NONE,"Item 3");
        return true;

    }
//Checking for On each iten selected in the option List
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                //printing Toast Message on Item clicked
                Toast.makeText(this, "Item1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                //printing Toast Message on Item clicked
                Toast.makeText(this, "Item 2 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                //printing Toast Message on Item clicked
                Toast.makeText(this, "Item 3 Clicked", Toast.LENGTH_SHORT).show();
                break;
            default:return false;

        }
        return true;
    }
}
