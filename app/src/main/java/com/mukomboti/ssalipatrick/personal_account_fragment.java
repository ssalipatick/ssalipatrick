package com.mukomboti.ssalipatrick;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class personal_account_fragment extends Fragment {
    //mandetory constructor for instatiating the fragment
    public personal_account_fragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View accountView = inflater.inflate(R.layout.phone_number_fragment, container, false);
        return accountView;
    }

}
