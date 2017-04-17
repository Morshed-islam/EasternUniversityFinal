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
public class FirstSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr1 = new SearchResults();
        sr1.setSub_code("CSE 109");
        sr1.setSub_name("Computer Fundamentals");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setSub_code("CSE 110");
        sr1.setSub_name("Computer Fundamentals Laboratory");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setSub_code("ENG 103");
        sr1.setSub_name("Listening and Speaking");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setSub_code("MAT 101");
        sr1.setSub_name("Calculus I");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setSub_code("PHY 101");
        sr1.setSub_name("Physics I");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setSub_code("PHY 102");
        sr1.setSub_name("Physics I Laboratory ");
        results.add(sr1);


        return results;
    }
}



