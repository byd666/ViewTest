package byd.com.byd.viewtest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";


    public BlankFragment() {
        // Required empty public constructor
    }


    public static BlankFragment newInstance(String param1) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println("BlankFragment------>onAttach");

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("BlankFragment------>onCreate");

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        System.out.println("BlankFragment------>onCreateView");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("BlankFragment------>onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("BlankFragment------>onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("BlankFragment------>onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("BlankFragment------>onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("BlankFragment------>onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("BlankFragment------>onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("BlankFragment------>onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("BlankFragment------>onDetach");
    }


}
