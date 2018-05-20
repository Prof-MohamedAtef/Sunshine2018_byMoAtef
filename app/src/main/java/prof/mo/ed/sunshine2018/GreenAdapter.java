package prof.mo.ed.sunshine2018;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Prof-Mohamed Atef on 5/21/2018.
 */

public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.NumberViewHolder> {

    private static final String TAG = GreenAdapter.class.getSimpleName();
    private int mNumberItems;

    public GreenAdapter(int NumberOfItems){
        mNumberItems=NumberOfItems;
    }
    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context=viewGroup.getContext();
        int LayoutInflaterListItem=R.layout.number_list_item;
        LayoutInflater inflater=LayoutInflater.from(context);
        boolean showAttachToParentimmediatelly=false;
        View view= inflater.inflate(LayoutInflaterListItem,viewGroup, showAttachToParentimmediatelly);
        NumberViewHolder viewHolder=new NumberViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder{
        public NumberViewHolder(View itemView) {
            super(itemView);
            listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
        }

        TextView listItemNumberView;

        void bind(int listIndex){
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
