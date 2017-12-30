package com.example.mahmoud.bs_sidebar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmoud on 30/12/17.
 */

public class Frag_Categories extends Fragment {

    private List<String> listValues;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return inflater.inflate(R.layout.frag_home, null);
        View view = inflater.inflate(R.layout.frag_categories, container, false);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        listValues = new ArrayList<String>();

        ListView listView = (ListView)getActivity().findViewById(R.id.categoriesList);

        listValues.add("Fiction");
        listValues.add("Nonfiction");
        listValues.add("Arts & Photography");
        listValues.add("Romance");
        listValues.add("Biographies");
        listValues.add("Cookbooks");
        listValues.add("Poetry");
        listValues.add("History");
        listValues.add("Religion");
        listValues.add("Travel");
        listValues.add("Guide");
        listValues.add("Health");
        listValues.add("Mystery");
        listValues.add("Romance");
        listValues.add("Drama");

        listView.setAdapter(new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, listValues));

        //    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        // simple_list_item_1, android.R.id.text1, listValues);

       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),simple_list_item_1, getView().findViewById(text1), listValues);
        //listView.setAdapter(adapter);


    }
}
