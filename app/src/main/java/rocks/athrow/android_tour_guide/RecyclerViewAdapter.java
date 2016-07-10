package rocks.athrow.android_tour_guide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by thr0w on 7/10/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    // Set local variables
    private final String LOG_TAG = RecyclerViewAdapter.class.getSimpleName();;
    private Context mContext;
    private ArrayList<Attraction> mAttractions;

    //The Adapter Constructor
    public RecyclerViewAdapter(Context context, ArrayList<Attraction> attractions) {
        mContext = context;
        mAttractions = attractions;
    }

    /**
     * ViewHolder
     * Defines the view to be recycled
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView viewAttractionName;

        public ViewHolder(View view) {
            super(view);
            mView = view.findViewById(R.id.attraction_item);
            viewAttractionName = (TextView) view.findViewById(R.id.attraction_name);
        }

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Attraction attraction = mAttractions.get(position);
        String attractionName = attraction.getName();
        holder.viewAttractionName.setText(attractionName);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "Toast";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(mContext, text, duration);
                toast.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if ( mAttractions != null ) {
            return mAttractions.size();
        }else{
            return 0;
        }
    }
}