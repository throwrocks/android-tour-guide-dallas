package rocks.athrow.android_tour_guide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * RecyclerViewAdapter
 * Created by thr0w on 7/10/16.
 */
@SuppressWarnings("deprecation")
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final Context mContext;
    private final ArrayList<Attraction> mAttractions;
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
        public final ImageView viewAttractionImage;
        public final TextView viewAttractionName;
        public final LinearLayout viewAttractionLocation;
        public final TextView viewAttractionAddress;
        public final TextView viewAttractionDescription;
        public ViewHolder(View view) {
            super(view);
            mView = view.findViewById(R.id.attraction_item);
            viewAttractionImage = (ImageView) view.findViewById(R.id.attraction_image);
            viewAttractionName = (TextView) view.findViewById(R.id.attraction_name);
            viewAttractionLocation = (LinearLayout) view.findViewById(R.id.attraction_location);
            viewAttractionAddress = (TextView) view.findViewById(R.id.attraction_address);
            viewAttractionDescription = (TextView) view.findViewById(R.id.attraction_description);
        }

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attraction_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Resources resources = mContext.getResources();
        Attraction attraction = mAttractions.get(position);
        String attractionName = attraction.getName();
        String attractionAddress = attraction.getAddress();
        String attractionDescription = attraction.getDescription();
        String attractionFilename = attraction.getFilename();
        int attractionDrawableId = resources.
                getIdentifier(attractionFilename, "drawable", mContext.getPackageName());
        //noinspection deprecation
        @SuppressWarnings("deprecation")
        Drawable attractionImage = mContext.getResources().getDrawable(attractionDrawableId);
        holder.viewAttractionImage.setImageDrawable(attractionImage);
        holder.viewAttractionName.setText(attractionName);
        if ( attractionAddress == null || attractionAddress.equals("null") ) {
            holder.viewAttractionLocation.setVisibility(View.GONE);

        }else{
            holder.viewAttractionLocation.setVisibility(View.VISIBLE);
            holder.viewAttractionAddress.setText(attractionAddress);
        }
        if ( attractionDescription == null || attractionDescription.equals("null")){
            holder.viewAttractionDescription.setVisibility(View.GONE);
        }else{
            holder.viewAttractionDescription.setVisibility(View.VISIBLE);
            holder.viewAttractionDescription.setText(attractionDescription);
        }

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
        if (mAttractions != null) {
            return mAttractions.size();
        } else {
            return 0;
        }
    }
}