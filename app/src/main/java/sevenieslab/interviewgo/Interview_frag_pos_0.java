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
public class Interview_frag_pos_0 extends Fragment {

    public Interview_frag_pos_0 () {
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
        View rootView = inflater.inflate(R.layout.interview_frag_pos_zero, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view2);
        rv.setHasFixedSize(true);
        Adapter4 adapter = new Adapter4(new String[]{"SQL", "Digital marketing", "Database", "Web Develpoment", "Programming", "Big Data", "Microsoft Technology","Mobile Develpment","Script","SAP","MISC"}, new int[]{R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        adapter.setOnItemClickListener(new Adapter4.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                switch (position) {
                    case 0: {
                        Fragment frag = new Interview_java_subList();

                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();

                        transaction.replace(R.id.cont, frag);
                        transaction.addToBackStack(null);
                        transaction.commit();
                          break;

                    }
                    case 1: {
                        Fragment frag = new Interview_java_subList();

                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();

                        transaction.replace(R.id.cont, frag);
                        transaction.addToBackStack(null);
                        transaction.commit();
                         break;

                    }

                    case 2: {
                        Fragment frag = new Interview_java_subList();

                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();

                        transaction.replace(R.id.cont, frag);
                        transaction.addToBackStack(null);
                        transaction.commit();
                           break;

                    }

                    case 3: {
                        Fragment frag = new Interview_java_subList();

                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();

                        transaction.replace(R.id.cont, frag);
                        transaction.addToBackStack(null);
                        transaction.commit();
                           break;

                    }



                }
            }
        } );


        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((Interview)getActivity()).getSupportActionBar().setTitle("Technology");
    }

}


