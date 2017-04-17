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
public class NineSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nineth_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NineSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr = new SearchResults();
        sr.setSub_code("CSE 331");
        sr.setSub_name("Data Communication");
        results.add(sr);

        sr = new SearchResults();
        sr.setSub_code("CSE 333");
        sr.setSub_name("Database Management Systems");
        results.add(sr);

        sr = new SearchResults();
        sr.setSub_code("CSE 334");
        sr.setSub_name("Database Management Lab");
        results.add(sr);

        sr = new SearchResults();
        sr.setSub_code("CSE 335");
        sr.setSub_name("Mathematical Analysis for Computer Science");
        results.add(sr);



        return results;
    }
}



