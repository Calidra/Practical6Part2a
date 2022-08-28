package my.tutorial.practical6part2a.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import my.tutorial.practical6part2a.MyFragment;
import my.tutorial.practical6part2a.MyFragment2;
import my.tutorial.practical6part2a.MyFragment3;
import my.tutorial.practical6part2a.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position)
        {
            case 0:
                MyFragment myFragment = new MyFragment();
                return myFragment;
            case 1:
                MyFragment2 myFragment2 = new MyFragment2();
                return myFragment2;
            case 2:
                MyFragment3 myFragment3 = new MyFragment3();
                return myFragment3;
            default:
                return PlaceholderFragment.newInstance(position + 1);
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}