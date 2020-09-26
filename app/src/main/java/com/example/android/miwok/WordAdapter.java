package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> words, int mColorResourceId){

        super(context, 0, words);
        this.mColorResourceId = mColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defultTextView = (TextView) listItemView.findViewById(R.id.defult_text_view);

        defultTextView.setText(currentWord.getDefultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());

        imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
