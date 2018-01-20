package phr.muzima.org.tablayoutlabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPage);
        tabLayout = findViewById(R.id.tab_layout);

        TabLayoutAdapater tabLayoutAdapater = new TabLayoutAdapater(getSupportFragmentManager());

        viewPager.setAdapter(tabLayoutAdapater);
        tabLayout.setupWithViewPager(viewPager);

    }
}
