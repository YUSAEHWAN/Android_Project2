package com.hansung.android.android_project2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Calendar;

public class Month_Calendar_Fragment extends Fragment {
    GridView monthView;
    MonthAdapter adt;

    // 프래그먼트 초기화 매개 변수 지정
    private static final String ARG_PARAM1 = "YEAR";
    private int toast_year;

    private static final String ARG_PARAM2 = "MONTH";
    private int toast_month;

    private static final String ARG_PARAM3 = "DATE";
    private int mDate;

    public Month_Calendar_Fragment() {}

    // 프래그먼트로 인자들을 전달하기 위해 newInstance() 메소드 사용
    public static Month_Calendar_Fragment newInstance(int year, int month, int date) {

        Month_Calendar_Fragment fragment = new Month_Calendar_Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, year);
        args.putInt(ARG_PARAM2, month);
        args.putInt(ARG_PARAM3, date);
        fragment.setArguments(args); // setArguments() 메소드를 통해 프래그먼트 객체로 인자 전달
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            toast_year = getArguments().getInt(ARG_PARAM1); // 얻어온 인자를 toast_year에 저장
            toast_month = getArguments().getInt(ARG_PARAM2); // 얻어온 인자를 toast_month에 저장
            mDate = getArguments().getInt(ARG_PARAM3); // 얻어온 인자를 mDate에 저장
        }
    }

}
