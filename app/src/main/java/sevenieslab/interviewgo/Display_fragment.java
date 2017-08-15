package sevenieslab.interviewgo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admi on 21-04-2017.
 */
public class Display_fragment extends Fragment {
int position=0;
    String s,k;
    String ques[],ans[];
    public Display_fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
k=getArguments().getString("ki");
        ((Interview) getActivity()).setActionBarTitle(k);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.display_fragment, container, false);
//        TextView v=(TextView)rootView.findViewById(R.id.tv_text);
        position = getArguments().getInt("YourKey");
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view3);

        rv.setHasFixedSize(true);
        ques= getArguments().getStringArray("sql");
        ans= getArguments().getStringArray("sqlans");

         Adapter3 adapter = new Adapter3((ques),(ans));
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(rv);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, true);
        rv.setLayoutManager(llm);
        rv.getLayoutManager().scrollToPosition(position);
        return rootView;
    }


}


