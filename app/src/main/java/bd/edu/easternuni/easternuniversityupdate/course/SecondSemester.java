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
public class SecondSemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView secondlist = (ListView) findViewById(R.id.list);
        secondlist.setAdapter(new MyCustomBaseAdapter(this, searchResults));


        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondSemester.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });


    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr2 = new SearchResults();
        sr2.setSub_code("ENG 107");
        sr2.setSub_name("Reading and Grammar");
        results.add(sr2);

        sr2 = new SearchResults();
        sr2.setSub_code("CSE 103");
        sr2.setSub_name("Structured Programming ");
        results.add(sr2);

        sr2 = new SearchResults();
        sr2.setSub_code("CSE 104");
        sr2.setSub_name("Structured Programming Laboratory");
        results.add(sr2);

        sr2 = new SearchResults();
        sr2.setSub_code("MAT 103");
        sr2.setSub_name("Calculus II");
        results.add(sr2);

        sr2 = new SearchResults();
        sr2.setSub_code("PHY 103");
        sr2.setSub_name("Physics II");
        results.add(sr2);



        return results;
    }
}
