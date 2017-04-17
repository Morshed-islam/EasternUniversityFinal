package bd.edu.easternuni.easternuniversityupdate;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

/*import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;*/
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import bd.edu.easternuni.easternuniversity.R;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentAcademicCalender;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentCourse;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentDeveloper;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentEUCCClub;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentFaculties;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentHome;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentAcademics;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentNotice;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentStudentLogin;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentSupport;
import bd.edu.easternuni.easternuniversityupdate.fragment.FragmentTeacherLogin;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        if (savedInstanceState == null) {
            Fragment fragment = null;
            Class fragmentClass = null;
            fragmentClass = FragmentHome.class;
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_content, fragment).commit();
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        Class fragmentClass = null;

        if (id == R.id.home) {
            fragmentClass = FragmentHome.class;
        } else if (id == R.id.teacherLogin) {
            fragmentClass = FragmentTeacherLogin.class;

        } else if (id == R.id.studentLogin) {
            fragmentClass = FragmentStudentLogin.class;

        } else if (id == R.id.cgpaCalculator) {


        } else if (id == R.id.academic) {
            fragmentClass = FragmentAcademics.class;

        } else if (id == R.id.faculties) {
            fragmentClass = FragmentFaculties.class;

        } else if (id == R.id.academicCal) {
            fragmentClass = FragmentAcademicCalender.class;

        } else if (id == R.id.noticeMenu) {
            fragmentClass = FragmentNotice.class;

        } else if (id == R.id.course) {
            fragmentClass = FragmentCourse.class;

        } else if (id == R.id.club) {
            fragmentClass = FragmentEUCCClub.class;

        } else if (id == R.id.support) {
            fragmentClass = FragmentSupport.class;
        } else if (id == R.id.developer) {
            fragmentClass = FragmentDeveloper.class;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame_content, fragment).commit();


        //fragmentTransitionManager(currentFragment);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
