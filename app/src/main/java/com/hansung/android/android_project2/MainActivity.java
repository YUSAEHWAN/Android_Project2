package com.hansung.android.android_project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 액티비티를 생성하는 OnCreate 함수
        setContentView(R.layout.activity_main); // activity_main.xml 파일을 가상 디바이스에 표시

        // 동적으로 프래그먼트를 추가
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, new MonthView_Fragment());
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { // 앱바 추가
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // 앱바에서 아이템 선택 시 이벤트 처리 메소드
        switch (item.getItemId()) {
            case R.id.actionbar_month: // 월을 누르면
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.fragment_container, new MonthView_Fragment());
                fragmentTransaction.commit();
                return true;
//            case R.id.actionbar_weekend: // 주를 누르면
//                fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.fragment_container, new WeekViewFragment());
//                fragmentTransaction.commit();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}