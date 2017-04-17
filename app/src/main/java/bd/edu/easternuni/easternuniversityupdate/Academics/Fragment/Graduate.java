package bd.edu.easternuni.easternuniversityupdate.Academics.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bd.edu.easternuni.easternuniversity.R;


/**
 * Created by SWOPON on 6/11/2016.
 */
public class Graduate extends Fragment {


    public Graduate() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.graduate, container, false);
    }

}
