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
public class ThirdSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView thirdlist = (ListView) findViewById(R.id.list);
        thirdlist.setAdapter(new MyCustomBaseAdapter(this, searchResults));


        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ThirdSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr3 = new SearchResults();
        sr3.setSub_code("SOC 101");
        sr3.setSub_name("Introduction to Sociology");
        results.add(sr3);

        sr3 = new SearchResults();
        sr3.setSub_code("BUS 105");
        sr3.setSub_name("Introduction to Business");
        results.add(sr3);

        sr3 = new SearchResults();
        sr3.setSub_code("ENG 111");
        sr3.setSub_name("Writing");
        results.add(sr3);

        sr3 = new SearchResults();
        sr3.setSub_code("EEE 111");
        sr3.setSub_name("Basic Electrical Circuits");
        results.add(sr3);

        sr3 = new SearchResults();
        sr3.setSub_code("EEE 112");
        sr3.setSub_name("Basic Electrical Circuits Laboratory");
        results.add(sr3);

        sr3 = new SearchResults();
        sr3.setSub_code("CSE 106");
        sr3.setSub_name("Advanced Programming Laboratory");
        results.add(sr3);


        return results;
    }

}
