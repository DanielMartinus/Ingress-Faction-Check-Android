package com.danielmartinus.intelchecker_example.activity;

import com.danielmartinus.intelchecker.IntelManager;
import com.danielmartinus.intelchecker_example.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentLogin extends Fragment {
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_login, container, false);
        Button btnLogin = (Button)view.findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				getWebViewActivity().getWebViewFragment().LoadIntel();
			}
		});
        
        Button btnLogout = (Button)view.findViewById(R.id.btnlogout);
        btnLogout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				getWebViewActivity().getWebViewFragment().logout();
			}
		});
        return view;
    }
	
	private WebViewActivity getWebViewActivity() {
		return (WebViewActivity)getActivity();
	}
}
