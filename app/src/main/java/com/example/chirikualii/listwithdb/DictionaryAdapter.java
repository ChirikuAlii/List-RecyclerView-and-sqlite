package com.example.chirikualii.listwithdb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chirikualii.listwithdb.Model.Dictionary;

import java.util.List;

/**
 * Created by chirikualii on 19/03/18.
 */

public class DictionaryAdapter extends RecyclerView.Adapter<DictionaryAdapter.ViewHolder> {


    private List<Dictionary> dictionaryList;


    public DictionaryAdapter(List<Dictionary> dictionaryList) {
        this.dictionaryList = dictionaryList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dictionary dictionary = dictionaryList.get(position);

        holder.txtTitle.setText(dictionary.getTitle());

    }

    @Override
    public int getItemCount() {
        return dictionaryList.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder {

        TextView txtTitle;
        public ViewHolder(View itemView) {
            super(itemView);
             txtTitle = itemView.findViewById(R.id.txtTittle);

        }
    }

}
