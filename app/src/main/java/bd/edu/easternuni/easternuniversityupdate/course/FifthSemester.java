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
public class FifthSemester extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv5 = (ListView) findViewById(R.id.list);
        lv5.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FifthSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr5 = new SearchResults();
        sr5.setSub_code("MAT 205");
        sr5.setSub_name("Linear Algebra, Geometry and Complex Variables");
        results.add(sr5);

        sr5 = new SearchResults();
        sr5.setSub_code("EEE 233");
        sr5.setSub_name("Electronics II");
        results.add(sr5);

        sr5 = new SearchResults();
        sr5.setSub_code("EEE 234");
        sr5.setSub_name("Electronics II Laboratory");
        results.add(sr5);

        sr5 = new SearchResults();
        sr5.setSub_code("CSE 223");
        sr5.setSub_name("Object Oriented Programming");
        results.add(sr5);

        sr5 = new SearchResults();
        sr5.setSub_code("CSE 224");
        sr5.setSub_name("Object Oriented Programming Laboratory");
        results.add(sr5);

        sr5 = new SearchResults();
        sr5.setSub_code("CSE 227");
        sr5.setSub_name("Logic Design and Digital Systems");
        results.add(sr5);

        sr5 = new SearchResults();
        sr5.setSub_code("CSE 228");
        sr5.setSub_name("Logic Design and Digital Systems Laboratory");
        results.add(sr5);


        return results;
    }
}



