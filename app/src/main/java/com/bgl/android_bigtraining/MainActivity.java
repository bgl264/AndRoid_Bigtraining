package com.bgl.android_bigtraining;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bgl.android_bigtraining.adapter.MainAdapter;
import com.bgl.data.ICommonPresenter;
import com.bgl.data.ICommonView;
import com.bgl.databean.DatasBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ICommonView {

    private RecyclerView mRecycler;
    private ICommonPresenter iCommonPresenter;
    private ArrayList<DatasBean> list;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initPre();
    }

    private void initPre() {
        iCommonPresenter = new ICommonPresenter(this);
        iCommonPresenter.getData();
    }

    private void initView() {
        mRecycler = (RecyclerView) findViewById(R.id.recycler);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));

       // list = new ArrayList<>();
        adapter = new MainAdapter(this);
        mRecycler.setAdapter(adapter);

    }

    @Override
    public void ShowToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setData(List<DatasBean> data) {
        adapter.addList(data);
        adapter.notifyDataSetChanged();
    }
}
