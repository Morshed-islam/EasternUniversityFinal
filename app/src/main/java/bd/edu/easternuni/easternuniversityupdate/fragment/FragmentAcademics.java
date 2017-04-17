package bd.edu.easternuni.easternuniversityupdate.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import bd.edu.easternuni.easternuniversityupdate.Academics.Academic;
import bd.edu.easternuni.easternuniversityupdate.Academics.Fragment.Graduate;
import bd.edu.easternuni.easternuniversityupdate.Academics.Fragment.Undergraduate;
import bd.edu.easternuni.easternuniversity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAcademics extends Fragment {

    private Context context;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.graduate,
            R.drawable.undergaduate,

    };

    public FragmentAcademics() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       /* Intent intent = new Intent(getContext(), Academic.class);
        startActivity(intent);*/

       View view = inflater.inflate(R.layout.fragment_academic, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();




        return view;
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);

    }

    private void setupViewPager(ViewPager viewPager) {
        FragmentAcademics.ViewPagerAdapter adapter = new FragmentAcademics.ViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFrag(new Undergraduate(), "Undergraduate");
        adapter.addFrag(new Graduate(), "Graduate");
        viewPager.setAdapter(adapter);
    }



   public class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
