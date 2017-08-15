package sevenieslab.interviewgo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admi on 21-04-2017.
 */
public class Frag2 extends Fragment {
    RecyclerView rv;
    public Frag2() {
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
        View rootView = inflater.inflate(R.layout.frag2, container, false);

        rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view1);
       rv.setNestedScrollingEnabled(false);
        rv.setHasFixedSize(true);
        Adapter adapter = new Adapter(new String[]{"one", "two", "three", "four", "test five", "test six", "test seven"}, new int[]{R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        //adapter.setOnItemClickListener(new MyAdapter.ClickListener()
        adapter.setOnItemClickListener(new Adapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                switch (position) {
                    case 2: {
                        Fragment frag=new Interview_frag_pos_0();
                        Bundle args = new Bundle();
                        args.putInt("YourKey", position);
                        frag.setArguments(args);
                        FragmentManager manager=getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();

                        transaction.replace(R.id.cont,frag);
                        transaction.addToBackStack(null);

                        transaction.commit();
                        // Fragment fa=new Frag4();

                       // Toast.makeText(getActivity(),"2ns tab",Toast.LENGTH_SHORT).show();
                        //Fragment fa=new Frag4();
                    }


                }


            }
        });


        return rootView;

    }


}