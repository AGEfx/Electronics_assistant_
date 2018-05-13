package com.example.shaba.cards;

import android.content.Intent;
import android.os.Bundle;
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
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Theory extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    TextView textView;
    ImageView imageView;
    ListView listView;

    String[] list = {"Электрический заряд", "Что такое электричество?","Сила тока, напряжение, сопротивление","Закон Ома","Мощность тока", "Последовательное соединение", "Параллельное соединение"};
    int [] img = {R.drawable.mownost,R.drawable.posled,R.drawable.tok,R.drawable.zakonoma,R.drawable.zaryad,R.drawable.parallel,R.drawable.dftok};
    int [] ids = {0,1,2,3,4,5,6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_theory);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView)findViewById(R.id.list);

        Adapter adapter = new Adapter();
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;

               int listId = ids[position];
               switch (listId){
                   case 0:
                       intent = new Intent(view.getContext(),Web.class);
                       startActivity(intent);
                       break;
                   case 1:
                       intent = new Intent(view.getContext(),Theory_1.class);
                       startActivity(intent);
                       break;
                   case 2:
                       intent = new Intent(view.getContext(),Theory3.class);
                       startActivity(intent);
                       break;
                   case 3:
                       intent = new Intent(view.getContext(),Theory2.class);
                       startActivity(intent);
                       break;
                   case 4:
                       intent = new Intent(view.getContext(),Theory4.class);
                       startActivity(intent);
                       break;
                   case 5:
                       intent = new Intent(view.getContext(),Theory5.class);
                       startActivity(intent);
                       break;
                   case 6:
                       intent = new Intent(view.getContext(),Theory6.class);
                       startActivity(intent);
                       break;
               }
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.news) {
            Intent intent = new Intent(this,News.class);
            startActivity(intent);}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    class Adapter extends BaseAdapter {

        @Override
        public int getCount() {
            return img.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.list,null);
            imageView = (ImageView)convertView.findViewById(R.id.imageView);
            textView = (TextView)convertView.findViewById(R.id.textView);

            imageView.setImageResource(img[i]);
            textView.setText(list[i]);
            return convertView;
        }
    }
}
