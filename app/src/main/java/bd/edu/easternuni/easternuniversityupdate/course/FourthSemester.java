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
public class FourthSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv4 = (ListView) findViewById(R.id.list);
        lv4.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FourthSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr4 = new SearchResults();
        sr4.setSub_code("EEE 231");
        sr4.setSub_name("Electronics I");
        results.add(sr4);

        sr4 = new SearchResults();
        sr4.setSub_code("EEE 232");
        sr4.setSub_name("Electronics I Laboratory");
        results.add(sr4);

        sr4 = new SearchResults();
        sr4.setSub_code("MAT 201");
        sr4.setSub_name("Differential Equations");
        results.add(sr4);

        sr4 = new SearchResults();
        sr4.setSub_code("CSE 211");
        sr4.setSub_name("Discrete Mathematics");
        results.add(sr4);

        sr4 = new SearchResults();
        sr4.setSub_code("CHM 201");
        sr4.setSub_name("Chemistry");
        results.add(sr4);




        return results;
    }
}



