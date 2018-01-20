package phr.muzima.org.tablayoutlabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by HP on 1/15/2018.
 */

public class TabLayoutAdapater extends FragmentStatePagerAdapter {
    public TabLayoutAdapater(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0){
            fragment = new FragmentOne();
        } else if(position == 1){
            fragment = new FragmentTwo();
        }
        return fragment;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 2;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        String name = null;
        if (position == 0){
            name = "FRAGMENT A";
        }else if (position == 1){
            name = "FRAGMENT B";
        }
        return name;
    }
}
