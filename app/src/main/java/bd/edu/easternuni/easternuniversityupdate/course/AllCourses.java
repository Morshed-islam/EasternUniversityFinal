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
public class AllCourses extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_semester);


        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView allsemster = (ListView) findViewById(R.id.list);
        allsemster.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AllCourses.this, CoursesActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

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

        SearchResults sr7 = new SearchResults();
        sr7.setSub_code("STS 301");
        sr7.setSub_name("Fundamentals of  Statistics");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 327");
        sr7.setSub_name("Design and Analysis of Algorithm");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 328");
        sr7.setSub_name("Design and Analysis of Algorithm Laboratory");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 313");
        sr7.setSub_name("Microprocessor, Microcontrollers and Assembly Language Programming ");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 314");
        sr7.setSub_name("Microprocessor, Microcontrollers and Assembly Language Programming Laboratory");
        results.add(sr7);

        sr7 = new SearchResults();
        sr7.setSub_code("CSE 315 ");
        sr7.setSub_name("Theory of Computation");
        results.add(sr7);

        SearchResults sr8 = new SearchResults();
        sr8.setSub_code("CSE 321");
        sr8.setSub_name("Computer Arch. and Organization");
        results.add(sr8);

        sr8 = new SearchResults();
        sr8.setSub_code("CSE 325");
        sr8.setSub_name("Computer Peripherals and Interfacing");
        results.add(sr8);

        sr8 = new SearchResults();
        sr8.setSub_code("CSE 326");
        sr8.setSub_name("Computer Peripherals and Interfacing Laboratory");
        results.add(sr8);

        sr8 = new SearchResults();
        sr8.setSub_code("CSE 311");
        sr8.setSub_name("Operating System");
        results.add(sr8);

        sr8 = new SearchResults();
        sr8.setSub_code("CSE 312");
        sr8.setSub_name("Operating System Laboratory");
        results.add(sr8);

        SearchResults sr9= new SearchResults();
        sr9.setSub_code("CSE 331");
        sr9.setSub_name("Data Communication");
        results.add(sr9);

        sr9 = new SearchResults();
        sr9.setSub_code("CSE 333");
        sr9.setSub_name("Database Management Systems");
        results.add(sr9);

        sr9 = new SearchResults();
        sr9.setSub_code("CSE 334");
        sr9.setSub_name("Database Management Lab");
        results.add(sr9);

        sr9 = new SearchResults();
        sr9.setSub_code("CSE 335");
        sr9.setSub_name("Mathematical Analysis for Computer Science");
        results.add(sr9);

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



