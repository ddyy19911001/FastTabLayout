package com.jujing.testactivity;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.nshmura.recyclertablayout.RecyclerTabLayout;

import java.util.ArrayList;
import java.util.List;

import yin.deng.superbase.fragment.BasePagerAdapter;
import yin.deng.superbase.fragment.ViewPagerSuperBaseFragment;

public class TabTestFragment extends ViewPagerSuperBaseFragment {
    private RecyclerTabLayout hmTabLayout;
    private ViewPager viewpager;
    private List<Fragment> fgs=new ArrayList<>();
    private BasePagerAdapter fragmentAdapter;


    @Override
    protected int setContentView() {
        return R.layout.default_tab_base;
    }

    @Override
    public void bindViewWithId(View view) {
        hmTabLayout = (RecyclerTabLayout) view.findViewById(R.id.recycler_tab_layout);
        viewpager = (ViewPager) view.findViewById(R.id.viewpager);
        viewpager.setOffscreenPageLimit(5);
        initPageItem();
    }

    /**
     * 初始化各个tab页面
     */
    private void initPageItem() {
        HdPageItemFragment fragment1=new HdPageItemFragment();
        HdPageItemFragment fragment2=new HdPageItemFragment();
        HdPageItemFragment fragment3=new HdPageItemFragment();
        HdPageItemFragment fragment4=new HdPageItemFragment();
        HdPageItemFragment fragment5=new HdPageItemFragment();
        fgs.add(fragment1);
        fgs.add(fragment2);
        fgs.add(fragment3);
        fgs.add(fragment4);
        fgs.add(fragment5);
        ArrayList<String> titles = new ArrayList<String>();
        titles.add("推荐");
        titles.add("最新");
        titles.add("排行");
        titles.add("独家");
        titles.add("中文");
        fragmentAdapter=new BasePagerAdapter(getChildFragmentManager(), fgs,titles);
        viewpager.setOffscreenPageLimit(5);
        viewpager.setAdapter(fragmentAdapter);
        hmTabLayout.setUpWithViewPager(viewpager);
    }

    @Override
    protected void init() {


    }
}
