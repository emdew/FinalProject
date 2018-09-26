package com.example.myandroiodlibrary;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.javajokelib.JavaJokeClass;

public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String resultOfAsync = getActivity().getIntent().getExtras().getString("result");

        View rootView = inflater.inflate(R.layout.joke_fragment, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.text_view);
        textView.setText(resultOfAsync);

        return rootView;
    }
}
