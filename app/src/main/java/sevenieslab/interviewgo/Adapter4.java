package sevenieslab.interviewgo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter4 extends RecyclerView.Adapter<Adapter4.MyViewHolder> {
    private String[] mDataset;
    private int [] images;
    private static ClickListener listener;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public  static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
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
        Adapter4 .listener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(int position, View v);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public Adapter4(String[] myDataset,int [] imag2) {
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