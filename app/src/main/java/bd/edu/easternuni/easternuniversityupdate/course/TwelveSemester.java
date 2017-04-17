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
public class TwelveSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twelve_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TwelveSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr12 = new SearchResults();
        sr12.setSub_code("CSE 441");
        sr12.setSub_name("Information Security and Cyber Law");
        results.add(sr12);

        sr12 = new SearchResults();
        sr12.setSub_code("CSE ***");
        sr12.setSub_name("Elective II");
        results.add(sr12);

        sr12 = new SearchResults();
        sr12.setSub_code("CSE 434");
        sr12.setSub_name("Web Programming Lab");
        results.add(sr12);

        sr12 = new SearchResults();
        sr12.setSub_code("CSE 477");
        sr12.setSub_name("Thesis/Project");
        results.add(sr12);




        return results;
    }
}



