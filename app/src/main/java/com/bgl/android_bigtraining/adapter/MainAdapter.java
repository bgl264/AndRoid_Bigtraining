package com.bgl.android_bigtraining.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bgl.android_bigtraining.R;
import com.bgl.data.GrenDaoUtils;
import com.bgl.databean.DatasBean;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 包国梁 on 2020/5/28  17:05
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    Context context;
    List<DatasBean> list = new ArrayList<>();
    List<Boolean> isChek = new ArrayList<>();

    public MainAdapter(Context context) {
        this.context = context;
    }

    public void addList(List<DatasBean> list) {
        this.list.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            isChek.add(false);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final DatasBean datasBean = list.get(position);
        //圆形头像
        RequestOptions requestOptions = new RequestOptions().circleCrop();
        Glide.with(context).load(datasBean.getAvatar()).apply(requestOptions).into(holder.img);
        //设置数据
        holder.title.setText(datasBean.getTitle());
        holder.desc.setText(datasBean.getAuthor());

        if (isChek.get(position)) {
            holder.btn.setText("取消");
        } else {
            holder.btn.setText("关注");
        }

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isChek.get(position)) {
                    holder.btn.setText("关注");//初始关注
                    isChek.set(position, false);//点击变成取消
                    //  DatasBean quearAll = GrenDaoUtils.quearAll(datasBean);
                    // if (quearAll != null) {
                    GrenDaoUtils.delete(datasBean);

                    Toast.makeText(context, "数据删除成功", Toast.LENGTH_SHORT).show();
                    //}
                } else {
                    holder.btn.setText("取消");//初始取消
                    isChek.set(position, true);//点击变成关注
                   /* DatasBean quearAll = GrenDaoUtils.quearAll(datasBean);
                    // if (quearAll == null) {
                    GrenDaoUtils.insert(quearAll);*/

                    GrenDaoUtils.insert(datasBean);
                    Toast.makeText(context, "数据插入成功", Toast.LENGTH_SHORT).show();
                    // } else {
                    //   Toast.makeText(context, "数据库中已有数据", Toast.LENGTH_SHORT).show();
                    //  }


                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title, desc;
        Button btn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
            btn = itemView.findViewById(R.id.btn);
        }
    }
}
