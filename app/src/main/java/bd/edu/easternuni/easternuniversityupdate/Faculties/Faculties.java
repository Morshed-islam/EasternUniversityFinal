package bd.edu.easternuni.easternuniversityupdate.Faculties;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import bd.edu.easternuni.easternuniversity.R;


/**
 * Created by SWOPON on 8/9/2016.
 */
public class Faculties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculties);

        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_24dp);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setTitle("Faculties");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        ListView lv;
        lv = (ListView) findViewById(R.id.ListView1);

        FacultiestAdapter adapter = new FacultiestAdapter(this);
        lv.setAdapter(adapter);



       /* final ImageView back = (ImageView) findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Faculties.this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(intent);

            }
        });*/
    }

}
