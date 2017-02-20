package com.example.administrator.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/2/20 0020.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private List<Dog> mList;

    public MyAdapter(List<Dog> mList) {
        this.mList=mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.iv.setImageResource(mList.get(position).imageId);
            holder.tv.setText(mList.get(position).name);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static  class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv;
        TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            iv=(ImageView) itemView.findViewById(R.id.iv);
            tv=(TextView)itemView.findViewById(R.id.tv);
        }
    }


}
