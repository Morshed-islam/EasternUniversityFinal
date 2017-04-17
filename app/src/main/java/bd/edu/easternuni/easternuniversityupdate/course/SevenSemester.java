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
public class SevenSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventh_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv7 = (ListView) findViewById(R.id.list);
        lv7.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SevenSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr7 = new SearchResults();
        sr7.setSub_code("STS 301");
        sr7.setSub_name("Fundamentals of  Statistics");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 327");
        sr7.setSub_name("Design and Analysis of Algorithm");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 328");
        sr7.setSub_name("Design and Analysis of Algorithm Laboratory");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 313");
        sr7.setSub_name("Microprocessor, Microcontrollers and Assembly Language Programming ");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 314");
        sr7.setSub_name("Microprocessor, Microcontrollers and Assembly Language Programming Laboratory");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 315 ");
        sr7.setSub_name("Theory of Computation");
        results.add(sr7);


        return results;
    }
}



