package com.swiperecycler;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.swiperecycler.activity.CommonActivity;
import com.swiperecycler.activity.CommonAttachToActivity;
import com.swiperecycler.activity.HorizontalScrollViewActivity;
import com.swiperecycler.activity.ListViewActivity;
import com.swiperecycler.activity.NestedScrollViewActivity;
import com.swiperecycler.activity.RecyclerViewActivity;
import com.swiperecycler.activity.ScrollViewActivity;
import com.swiperecycler.activity.SwipeRefreshLayoutActivity;
import com.swiperecycler.activity.ViewPagerActivity;
import com.swiperecycler.activity.WebViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCommon;
    private Button btnAttachToCommon;
    private Button btnScrollView;
    private Button btnHorizontalScrollView;
    private Button btnNestedScrollView;
    private Button btnRecyclerView;
    private Button btnListView;
    private Button btnViewPager;
    private Button btnWebView;
    private Button btnSwipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCommon = initButton(R.id.btnCommon);
        btnAttachToCommon = initButton(R.id.btnAttachToCommon);
        btnScrollView = initButton(R.id.btnScrollView);
        btnHorizontalScrollView = initButton(R.id.btnHorizontalScrollView);
        btnNestedScrollView = initButton(R.id.btnNestedScrollView);
        btnListView = initButton(R.id.btnListView);
        btnRecyclerView = initButton(R.id.btnRecyclerView);
        btnWebView = initButton(R.id.btnWebView);
        btnViewPager = initButton(R.id.btnViewPager);
        btnSwipeRefreshLayout = initButton(R.id.btnSwipeRefreshLayout);
    }
    private Button initButton(@IdRes int id) {
        Button btn = (Button) findViewById(id);
        btn.setOnClickListener(this);
        return btn;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnCommon:
                startActivity(CommonActivity.class);
                break;

            case R.id.btnAttachToCommon:
                startActivity(CommonAttachToActivity.class);
                break;
            case R.id.btnScrollView:
                startActivity(ScrollViewActivity.class);
                break;
            case R.id.btnHorizontalScrollView:
                startActivity(HorizontalScrollViewActivity.class);
                break;
            case R.id.btnNestedScrollView:
                startActivity(NestedScrollViewActivity.class);
                break;
            case R.id.btnListView:
                startActivity(ListViewActivity.class);
                break;
            case R.id.btnRecyclerView:
                startActivity(RecyclerViewActivity.class);
                break;
            case R.id.btnViewPager:
                startActivity(ViewPagerActivity.class);
                break;
            case R.id.btnWebView:
                startActivity(WebViewActivity.class);
                break;
            case R.id.btnSwipeRefreshLayout:
                startActivity(SwipeRefreshLayoutActivity.class);
                break;
        }
    }

    public void startActivity(Class<?> clazz) {
        startActivity(new Intent(MainActivity.this, clazz));
    }
}
