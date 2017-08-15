package sevenieslab.interviewgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admi on 21-04-2017.
 */
public class Frag1 extends Fragment {

    public Frag1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.frag1, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
       rv.setNestedScrollingEnabled(false);

        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"Science ", "TECHNOLOGY", "ENGINEERING","MEDICAL","MANAGMENGT","LAW","COMMERCE", "COMPANY-WISE"}, new int[]{R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo
        ,R.drawable.logo, R.drawable.logo});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        adapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                switch (position)
                {
                    case 1 : {
                       /* Fragment frag=new Frag4();
                        FragmentManager manager=getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        transaction.replace(R.id.container,frag);
                        transaction.commit();*/
                        // Fragment fa=new Frag4();

                        Intent i = new Intent(getContext(), Interview.class);
                        i.putExtra("value", position);
                        startActivity(i);
 }



            }



            }
        } );


        return rootView;
    }


}


