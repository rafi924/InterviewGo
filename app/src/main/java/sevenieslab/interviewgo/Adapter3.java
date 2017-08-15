package sevenieslab.interviewgo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter3 extends RecyclerView.Adapter<Adapter3.MyViewHolder> {
    private String  []mDataset;
    private String  []mDataset1;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public  static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public CardView mCardView;
        public TextView mTextView,image;
        //public ImageView image;
        public MyViewHolder(View v) {
            super(v);
            mCardView = (CardView) v.findViewById(R.id.card_view2);
            mTextView = (TextView) v.findViewById(R.id.tv_text);
         image   =(TextView)v.findViewById(R.id.tv_text1);
        }


        @Override
        public void onClick(View v) {

        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public Adapter3(String []myDataset,String[]myDataset1 ) {
        mDataset = myDataset;
        mDataset1=myDataset1;


        ;
         }

    // Create new views (invoked by the layout manager)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item2, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.mTextView.setText(Html.fromHtml( (mDataset[position])) );
holder.image.setText(Html.fromHtml( (mDataset1[position])));
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}