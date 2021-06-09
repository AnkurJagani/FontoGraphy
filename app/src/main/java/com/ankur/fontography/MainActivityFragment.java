package com.ankur.fontography;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    TextView display4View;
    TextView headlineView;
    Typeface courgette;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        display4View = view.findViewById(R.id.display4);
        headlineView = view.findViewById(R.id.headline);
        display4View.setTypeface(courgette);
        headlineView.setTypeface(courgette);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        courgette = Typeface.createFromAsset(getActivity().getAssets(), "Courgette-Regular.ttf");
    }
}
