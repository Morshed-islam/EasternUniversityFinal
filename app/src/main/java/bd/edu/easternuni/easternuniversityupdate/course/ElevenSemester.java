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
public class ElevenSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eleventh_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ElevenSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr11 = new SearchResults();
        sr11.setSub_code("CSE 423");
        sr11.setSub_name("Software Engineering");
        results.add(sr11);

        sr11 = new SearchResults();
        sr11.setSub_code("CSE 424");
        sr11.setSub_name("Software Engineering Laboratory");
        results.add(sr11);

        sr11 = new SearchResults();
        sr11.setSub_code("CSE 431");
        sr11.setSub_name("Artificial Intelligence");
        results.add(sr11);

        sr11 = new SearchResults();
        sr11.setSub_code("CSE 432");
        sr11.setSub_name("Artificial Intelligence Lab");
        results.add(sr11);

        sr11 = new SearchResults();
        sr11.setSub_code("CSE ***");
        sr11.setSub_name("Elective I");
        results.add(sr11);

        sr11 = new SearchResults();
        sr11.setSub_code("CSE 477");
        sr11.setSub_name("Thesis/ Project ");
        results.add(sr11);


        return results;
    }
}



