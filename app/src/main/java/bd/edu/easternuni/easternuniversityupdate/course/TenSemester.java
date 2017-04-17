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
public class TenSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ten_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TenSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr10 = new SearchResults();
        sr10.setSub_code("CSE 411");
        sr10.setSub_name("Computer Graphics");
        results.add(sr10);

        sr10 = new SearchResults();
        sr10.setSub_code("CSE 412");
        sr10.setSub_name("Computer Graphics Laboratory");
        results.add(sr10);

        sr10 = new SearchResults();
        sr10.setSub_code("CSE 413");
        sr10.setSub_name("Compiler Design");
        results.add(sr10);

        sr10 = new SearchResults();
        sr10.setSub_code("CSE 414");
        sr10.setSub_name("Compiler Design Lab");
        results.add(sr10);

        sr10 = new SearchResults();
        sr10.setSub_code("CSE 415");
        sr10.setSub_name("Computer Networks");
        results.add(sr10);

        sr10 = new SearchResults();
        sr10.setSub_code("CSE 416");
        sr10.setSub_name("Computer Networks Laboratory ");
        results.add(sr10);

        sr10 = new SearchResults();
        sr10.setSub_code("CSE 477");
        sr10.setSub_name("Thesis/Project ");
        results.add(sr10);



        return results;
    }
}



