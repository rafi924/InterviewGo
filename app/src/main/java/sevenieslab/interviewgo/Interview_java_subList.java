package sevenieslab.interviewgo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by hodan on 5/22/2017.
 */

public class Interview_java_subList extends Fragment {



    public Interview_java_subList() {
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
        rv.setHasFixedSize(true);
        AdapterJava adapter = new AdapterJava(new String[]{"Eclipse","SQL","Hibernate","Java","Jason","Spring"}, new int[]{R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo,R.drawable.logo});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        adapter.setOnItemClickListener(new AdapterJava.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                switch (position) {
                    case 1: {
                        String s[]=getResources().getStringArray(R.array.SQL);
                        Bundle bun=new Bundle();
                        bun.putStringArray("key",s);
                        Fragment frag=new Question_Eclipsce();
                        frag.setArguments(bun);
                        FragmentManager manager=getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        transaction.replace(R.id.cont,frag);
                    transaction.addToBackStack(null);
                        transaction.commit();
                        break;



                    }

                    case 2: {
                        String s[]=getResources().getStringArray(R.array.SQL);
                        Bundle bun=new Bundle();
                        bun.putStringArray("key",s);
                        Fragment frag=new Question_Eclipsce();
                        frag.setArguments(bun);
                        FragmentManager manager=getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        transaction.replace(R.id.cont,frag);
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
        ((Interview)getActivity()).getSupportActionBar().setTitle("Java");
    }

    public static class AdapterJava extends RecyclerView.Adapter<AdapterJava.MyViewHolder> {
        private String[] mDataset;
        private int [] images;
        private static ClickListener listener;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public   class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            public CardView mCardView;
            public TextView mTextView;
            public ImageView image;
            public MyViewHolder(View v) {
                super(v);
                v.setOnClickListener(this);

                mCardView = (CardView) v.findViewById(R.id.card_view);
                mTextView = (TextView) v.findViewById(R.id.tv_text);
                image=(ImageView)v.findViewById(R.id.iv_image);
            }

            @Override
            public void onClick(View view) {

                listener.onItemClick(getAdapterPosition(),view);
            }

        }

        public void setOnItemClickListener(ClickListener clickListener) {
            AdapterJava .listener = clickListener;
        }

        public interface ClickListener {
            void onItemClick(int position, View v);
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public AdapterJava(String[] myDataset,int [] imag2) {
            mDataset = myDataset;
            images=imag2;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_item, parent, false);
            // set the view's size, margins, paddings and layout parameters
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.mTextView.setText(mDataset[position]);
            holder.image.setImageResource(images[position]);
        }

        @Override
        public int getItemCount() {
            return mDataset.length;
        }
    }
}
