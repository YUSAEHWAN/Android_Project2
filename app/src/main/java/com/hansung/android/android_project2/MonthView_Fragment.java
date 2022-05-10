package com.hansung.android.android_project2;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Calendar;

public class MonthView_Fragment extends Fragment{

    ViewPager2 vpPager;

    // 프래그먼트 초기화 매개 변수 지정
    private static final String ARG_PARAM1 = "YEAR";
    private int mYear;

    private static final String ARG_PARAM2 = "MONTH";
    private int mMonth;

    private static final String ARG_PARAM3 = "DATE";
    private int mDate;

    public MonthView_Fragment() { }

    // 프래그먼트로 인자들을 전달하기 위해 newInstance() 메소드 사용
    public static MonthView_Fragment newInstance(int param1, int param2, int param3) {
        MonthView_Fragment fragment = new MonthView_Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, param3);
        fragment.setArguments(args); // setArguments() 메소드를 통해 프래그먼트 객체로 인자 전달
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mYear = getArguments().getInt(ARG_PARAM1); // 얻어온 인자를 mYear에 저장
            mMonth = getArguments().getInt(ARG_PARAM2); // 얻어온 인자를 mMonth에 저장
            mDate = getArguments().getInt(ARG_PARAM3); // 얻어온 인자를 mDate에 저장
        }
    }
}
