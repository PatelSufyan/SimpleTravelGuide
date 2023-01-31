package com.example.whereto;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whereto.HelperClasses.HomeAdapter.CategoriesAdapter;
import com.example.whereto.HelperClasses.HomeAdapter.CategoriesHelperClass;
import com.example.whereto.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.example.whereto.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.example.whereto.HelperClasses.HomeAdapter.MostViewedAdapter;
import com.example.whereto.HelperClasses.HomeAdapter.MostViewedHelperClass;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    ImageView userProfile, Hotel, Weather, LiveCovid, CovidGuideline;
    TextView viewAll;
    CardView northIndia,southIndia,eastIndia,westIndia;

    static final float END_SCALE = 0.7f;

    LinearLayout contentView;

    RecyclerView featuredRecycler, mostViewedRecycler, categoriesRecycler;
    RecyclerView.Adapter adapter;

   /* //Drawer Menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler);
        mostViewedRecycler = findViewById(R.id.mostViewedRecycler);
        contentView = findViewById(R.id.contents);

        //Recycler View Function Calls
        featuredRecycler();
        mostViewedRecycler();
     //   categoriesRecycler();

        //Menu Hooks
       /* drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

*/

       // menuIcon = findViewById(R.id.menuicon);
        userProfile = findViewById(R.id.userProfile);
        Hotel = findViewById(R.id.Hotel);
/*        Flight = findViewById(R.id.Flight);
        Train = findViewById(R.id.Train);*/
        Weather = findViewById(R.id.Weather);
        LiveCovid = findViewById(R.id.LiveCovid);
        CovidGuideline = findViewById(R.id.covidGuide);
        viewAll = findViewById(R.id.viewAll);
        northIndia = findViewById(R.id.northIndia);
        southIndia = findViewById(R.id.southIndia);
        eastIndia = findViewById(R.id.eastIndia);
        westIndia = findViewById(R.id.westIndia);

        //Navigation Drawer
        //navigationDrawer();

        userProfile();

        Hotel();

        LiveCovid();

        Weather();

        CovidGuideline();

        viewAll();

        northIndia();

        southIndia();

        eastIndia();

        westIndia();

    }

    private void CovidGuideline() {
        CovidGuideline.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,CovidGuidelineScreen.class));
            }
        });
    }

    private void westIndia() {
        westIndia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,WestIndiaScreen.class));
            }
        });
    }

    private void eastIndia() {
        eastIndia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,EastIndiaScreen.class));
            }
        });
    }

    private void southIndia() {
        southIndia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,SouthIndiaScreen.class));
            }
        });
    }

    private void northIndia() {
        northIndia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,NorthIndiaScreen.class));
            }
        });
    }

    private void viewAll() {
        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,MostViewedScreen.class));
            }
        });
    }



    private void Weather() {
        Weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,WeatherScreen.class));
            }
        });
    }


    private void LiveCovid() {
        LiveCovid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,CovidTrackerScreen.class));
            }
        });
    }

    private void Hotel() {
        Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,HotelScreen.class));
            }
        });
    }


    // Recycler View Functions
    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.goa, "Goa ", "Goa is a state in western India with coastlines stretching along the Arabian Sea."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.mumbai, "Mumbai", "Mumbai formerly called Bombay is a densely populated city on India’s west coast."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.bangalore, "Bengaluru", "Bengaluru also called Bangalore is the capital of Southern Karnataka state."));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);

        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});

    }


    private void mostViewedRecycler() {

        mostViewedRecycler.setHasFixedSize(true);
        mostViewedRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<MostViewedHelperClass> mostViewedLocations = new ArrayList<>();

        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.bangalore, "Bengaluru", "Bengaluru (also called Bangalore) is the capital of India's southern Karnataka state."));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.goa, "Goa ", "Goa is a state in western India with coastlines stretching along the Arabian Sea."));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.mumbai, "Mumbai", "Mumbai (formerly called Bombay) is a densely populated city on India’s west coast."));

        adapter = new MostViewedAdapter(mostViewedLocations);
        mostViewedRecycler.setAdapter(adapter);

    }


/*
    private void categoriesRecycler() {

        categoriesRecycler.setHasFixedSize(true);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<CategoriesHelperClass> categoriesLocation = new ArrayList<>();

        categoriesLocation.add(new CategoriesHelperClass(R.drawable.northindia,"North India"));
        categoriesLocation.add(new CategoriesHelperClass(R.drawable.southindia,"South India"));
        categoriesLocation.add(new CategoriesHelperClass(R.drawable.eastindia,"East India"));
        categoriesLocation.add(new CategoriesHelperClass(R.drawable.westindia,"West India"));

        adapter = new CategoriesAdapter(categoriesLocation);
        categoriesRecycler.setAdapter(adapter);

    }
*//*



    // Navigation Drawer
*/
/*    private void navigationDrawer() {

        // Navigation Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.home);*//*



        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else
                    drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        animateNavigationDrawer();

    }

    private void animateNavigationDrawer() {

        //drawerLayout.setScrimColor(getResources().getColor(R.color.purple_200));
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

                //Scale the view based on current slide offset
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                // Translate the View, accounting for the scaled width
                final float xOffSet = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffSet - xOffsetDiff;
                contentView.setTranslationX(xTranslation);

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
*/


    private void userProfile() {
        userProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this,UserProfileScreen.class));
            }
        });
    }

}