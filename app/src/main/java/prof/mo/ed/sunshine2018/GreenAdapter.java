package prof.mo.ed.sunshine2018;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Prof-Mohamed Atef on 5/21/2018.
 */

public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.NumberViewHolder> {

    private static final String TAG = GreenAdapter.class.getSimpleName();
    private int mNumberItems;

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
