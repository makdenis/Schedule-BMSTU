package com.example.denis_.rasp4;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TextView mHelloTextView3;
    private TextView mHelloTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        int day= Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        int week= Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
        int time= Calendar.getInstance().get(Calendar.HOUR_OF_DAY)*60+Calendar.getInstance().get(Calendar.MINUTE);
        mHelloTextView2 = (TextView)findViewById(R.id.textView5);
        mHelloTextView3 = (TextView)findViewById(R.id.textView3);
        //mHelloTextView3.setText(String.valueOf(time));
        if(time<605&&time>510) mHelloTextView3.setText(String.valueOf(605-time)+" минут");
        if(time<710&&time>615) mHelloTextView3.setText(String.valueOf(710-time)+" минут");

        if(time<815&&time>720) mHelloTextView3.setText(String.valueOf(815-time)+" минут");
        if(time<925&&time>830) mHelloTextView3.setText(String.valueOf(925-time)+" минут");
        if(time<1035&&time>940) mHelloTextView3.setText(String.valueOf(1035-time)+" минут");
        if(time<1140&&time>1045) mHelloTextView3.setText(String.valueOf(1140-time)+" минут");
        if(time<1245&&time>1150) mHelloTextView3.setText(String.valueOf(1245-time)+" минут");

        if((week)%2==0)//Den
        {
            if(day==1)
                mHelloTextView2.setText("Выходной :)");
            if(day==2)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a1);}
            if(day==3)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a2);}
            if(day==4)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a3);}
            if(day==5)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a4);}
            if(day==6)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a5);}
            if(day==7)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a6);}
        }
        if((week)%2!=0) ///Den
        {
            if(day==1)
                mHelloTextView2.setText("Выходной :)");
            if(day==2)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a12);}
            if(day==3)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a22);}
            if(day==4)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a32);}
            if(day==5)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a42);}
            if(day==6)
            {ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.a52);}
            if(day==7)
            {mHelloTextView2.setText("Выходной :)");}
        }
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action


               Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
