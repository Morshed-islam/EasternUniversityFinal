package bd.edu.easternuni.easternuniversityupdate.course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.eubd.easternuniversity.R;

import java.util.ArrayList;

/**
 * Created by SWOPON on 6/10/2016.
 */
public class EightSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eight_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv8 = (ListView) findViewById(R.id.list);
        lv8.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EightSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr8 = new SearchResults();
        sr8.setSub_code("CSE 321");
        sr8.setSub_name("Computer Arch. and Organization");
        results.add(sr8);

        sr8 = new SearchResults();
        sr8.setSub_code("CSE 325");
        sr8.setSub_name("Computer Peripherals and Interfacing");
        results.add(sr8);

        sr8 = new SearchResults();
        sr8.setSub_code("CSE 326");
        sr8.setSub_name("Computer Peripherals and Interfacing Laboratory");
        results.add(sr8);

        sr8 = new SearchResults();
        sr8.setSub_code("CSE 311");
        sr8.setSub_name("Operating System");
        results.add(sr8);

        sr8 = new SearchResults();
        sr8.setSub_code("CSE 312");
        sr8.setSub_name("Operating System Laboratory");
        results.add(sr8);



        return results;
    }
}



