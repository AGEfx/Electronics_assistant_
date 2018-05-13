package com.example.shaba.cards;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.example.shaba.cards.Theory;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        ImageButton imageButton5 = (ImageButton)findViewById(R.id.imageButton5);
        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.main) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.theory) {
            Intent intent = new Intent(this,Theory.class);
            startActivity(intent);
        } else if (id == R.id.comp) {
            Intent intent = new Intent(this,Components.class);
            startActivity(intent);
        } else if (id == R.id.equip) {
            Intent intent = new Intent(this,Equipment.class);
            startActivity(intent);
        } else if (id == R.id.calc) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.about) {
            Intent intent = new Intent(this,Abouts.class);
            startActivity(intent);
        }
        else if (id == R.id.news) {
            Intent intent = new Intent(this,News.class);
            startActivity(intent);}


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.imageButton1:
                intent = new Intent(this,Theory.class);
                startActivity(intent);
                break;
            case R.id.imageButton2:
                 intent = new Intent(this,Components.class);
                startActivity(intent);
                break;
            case R.id.imageButton3:
                intent = new Intent(this,Equipment.class);
                startActivity(intent);
                break;
            case R.id.imageButton4:
                intent = new Intent(this,News.class);
                startActivity(intent);
                break;
        }
    }
}
