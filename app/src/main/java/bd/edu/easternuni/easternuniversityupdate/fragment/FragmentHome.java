package bd.edu.easternuni.easternuniversityupdate.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import bd.edu.easternuni.easternuniversity.R;
import bd.edu.easternuni.easternuniversityupdate.homeAdapter.HomeRecyclerViewAdapter;
import bd.edu.easternuni.easternuniversityupdate.homeModel.HomeItem;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {


    public FragmentHome() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container,
                false);

        //using for title and backward button
      ((AppCompatActivity)getActivity()).setTitle("Eastern University");

        GridLayoutManager layoutManager;
        //its all about recyclerView
        List<HomeItem> rowListItem = getAllItemList();
        layoutManager = new GridLayoutManager(getContext(), 2);
        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(layoutManager);
        rView.setAdapter(new HomeRecyclerViewAdapter(getContext(), rowListItem));
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    private List<HomeItem> getAllItemList() {
        List<HomeItem> allItems = new ArrayList();
        allItems.add(new HomeItem("Academic", R.drawable.homeone));
        allItems.add(new HomeItem("Faculties", R.drawable.hometwo));
        allItems.add(new HomeItem("Student Login", R.drawable.homethree));
        allItems.add(new HomeItem("CGPA Calculator", R.drawable.homefour));
        allItems.add(new HomeItem("Academic Cal", R.drawable.homefive));
        allItems.add(new HomeItem("Notice", R.drawable.homesix));
        return allItems;
    }
}
