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

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 
 */
public class Page extends Fragment {
    @SuppressWarnings("unused")
    private static final String TAG = "Page";

    private static final String PARAM_PAGE_NUMBER = "page_number";
    private static final String PARAM_TITLE = "title";

    private int mPageNumber;
    private String mTitle;

    /**
     * インスタンス生成
     * 
     * @return
     */
    public static Page newInstance(int pageNumber, String title) {
        Page page = new Page();
        Bundle arguments = new Bundle();
        arguments.putInt(PARAM_PAGE_NUMBER, pageNumber);
        arguments.putString(PARAM_TITLE, title);
        page.setArguments(arguments);
        return page;
    }

    /*
     * (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreate(android.os.Bundle)
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.mPageNumber = arguments.getInt(PARAM_PAGE_NUMBER);
            this.mTitle = arguments.getString(PARAM_TITLE);
        }
    }

    /*
     * (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater,
     * android.view.ViewGroup, android.os.Bundle)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        return view;
    }

    /*
     * (non-Javadoc)
     * @see android.support.v4.app.Fragment#onActivityCreated(android.os.Bundle)
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View root = this.getView();

        TextView pageNumberTextView = (TextView) root.findViewById(R.id.page_number);
        TextView titleTextView = (TextView) root.findViewById(R.id.title);
        pageNumberTextView.setText(String.valueOf(this.mPageNumber));
        titleTextView.setText(this.mTitle);
    }

}
