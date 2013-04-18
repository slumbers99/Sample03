
package com.example.sample3;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) this.findViewById(R.id.view_pager);
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        Resources resources = this.getResources();
        int viewPagerPageMargin = resources.getDimensionPixelSize(R.dimen.view_pager_page_margin);
        viewPager.setPageMargin(viewPagerPageMargin);
        viewPager.setPageMarginDrawable(R.drawable.shape_view_pager_divider);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
