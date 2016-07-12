package rocks.athrow.android_tour_guide;

import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        // Set up the TabLayout with the PageViewer
        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        private DataProvider mDataProvider;
        private RecyclerViewAdapter mAdapter;
        private ArrayList<Attraction> mAttractions;
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            Bundle bundle = getArguments();
            int sectionNumber = bundle.getInt(ARG_SECTION_NUMBER);
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            RecyclerView list = (RecyclerView) rootView.findViewById(R.id.list);
            Resources resources = getResources();
            String category ="";
            switch (sectionNumber) {
                case 1:
                    category = resources.getString(R.string.downtown_category);
                    break;
                case 2:
                    category = resources.getString(R.string.museum_category);
                    break;
                case 3:
                    category = resources.getString(R.string.trail_category);
                    break;
                case 4:
                    category = resources.getString(R.string.food_category);
                    break;
            }
            mDataProvider = new DataProvider(this.getContext());
            mAttractions = mDataProvider.getAttraction(category);
            mAdapter = new RecyclerViewAdapter(getContext(), mAttractions);
            list.setAdapter(mAdapter);
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }
        @Override
        public int getCount() {
            return 4;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            String[] attractionCategories = getResources().getStringArray(R.array.attraction_categories);
            return attractionCategories[position];
        }
    }
}
