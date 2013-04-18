/*
 * Copyright 2013 peko<golden.slumbers.99@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.sample3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.SparseArray;

/**
 * 
 */
public class PageAdapter extends FragmentStatePagerAdapter {
    @SuppressWarnings("unused")
    private static final String TAG = "PageAdapter";

    private SparseArray<String> mTitleList;

    public PageAdapter(FragmentManager manager) {
        super(manager);
        this.prepareTitleList();
    }

    /*
     * (non-Javadoc)
     * @see android.support.v4.app.FragmentStatePagerAdapter#getItem(int)
     */
    @Override
    public Fragment getItem(int arg0) {
        String title = this.mTitleList.get(arg0);
        Fragment fragment = Page.newInstance(arg0, title);
        return fragment;
    }

    /*
     * (non-Javadoc)
     * @see android.support.v4.view.PagerAdapter#getCount()
     */
    @Override
    public int getCount() {

        return this.mTitleList.size();
    }

    /**
     * タイトルリスト作成
     */
    private void prepareTitleList() {
        this.mTitleList = new SparseArray<String>();
        this.mTitleList.append(0, "Seventeen");
        this.mTitleList.append(1, "Needing/Getting");
        this.mTitleList.append(2, "Not Enough");
        this.mTitleList.append(3, "Scambag");
        this.mTitleList.append(4, "さよならリグレット");
    }
}
