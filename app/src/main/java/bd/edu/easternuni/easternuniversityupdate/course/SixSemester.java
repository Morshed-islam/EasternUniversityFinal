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
public class SixSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv6 = (ListView) findViewById(R.id.list);
        lv6.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SixSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr6 = new SearchResults();
        sr6.setSub_code("ACT 201");
        sr6.setSub_name("Principles of Accounting");
        results.add(sr6);

        sr6 = new SearchResults();
        sr6.setSub_code("HUM 201");
        sr6.setSub_name("Values and Ethics");
        results.add(sr6);

        sr6 = new SearchResults();
        sr6.setSub_code("MAT 209");
        sr6.setSub_name("Numerical Methods");
        results.add(sr6);

        sr6 = new SearchResults();
        sr6.setSub_code("CSE 231");
        sr6.setSub_name("Data Structures");
        results.add(sr6);

        sr6 = new SearchResults();
        sr6.setSub_code("CSE 232");
        sr6.setSub_name("Data Structures Laboratory");
        results.add(sr6);




        return results;
    }
}



