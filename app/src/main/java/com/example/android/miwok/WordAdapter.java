package com.example.android.miwok;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Mostafa on 3/31/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
private int colorID;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects,int colorID) {
        super(context,0,objects);
        this.colorID=colorID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view=convertView;
        if (view==null) {
          LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           // view = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
            view=inflater.inflate(R.layout.list,parent,false);
        }
        Word word=getItem(position);
       TextView english_word= (TextView) view.findViewById(R.id.english_word);
       TextView miwak_word= (TextView) view.findViewById(R.id.miwak_word);

        miwak_word.setText(word.getMiwakWord());
        english_word.setText(word.getEnglishWord());
        ImageView word_image= (ImageView) view.findViewById(R.id.word_image);
        if(word.has_image()) {
            word_image.setImageResource(word.getImage());
            word_image.setVisibility(View.VISIBLE);
        }
        else word_image.setVisibility(View.GONE);
        View text_container=view.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),colorID);
        text_container.setBackgroundColor(color);

        return view;
    }
}
