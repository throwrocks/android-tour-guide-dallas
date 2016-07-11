package rocks.athrow.android_tour_guide;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

/**
 * DataProvider
 * Created by thr0w on 7/10/16.
 */
public class DataProvider {
    private Context mContext;

    public DataProvider(Context context){
        this.mContext = context;
    }

    public ArrayList<Attraction> getAttraction(String category){

        Resources resources = mContext.getResources();

        ArrayList<Attraction> attractions = new ArrayList<>();
        Attraction downtown1 = new Attraction(category);
        Attraction downtown2 = new Attraction(category);
        Attraction downtown3 = new Attraction(category);
        Attraction downtown4 = new Attraction(category);
        Attraction downtown5 = new Attraction(category);
        //
        String downtown1Name = resources.getString(R.string.downtown1_name);
        String downtown1Address = resources.getString(R.string.downtown1_address);
        String downtown1Description = resources.getString(R.string.downtown1_description);
        String downtown1FileName = resources.getString(R.string.downtown1_filename);

        String downtown2Name = resources.getString(R.string.downtown2_name);
        String downtown2Address = resources.getString(R.string.downtown2_address);
        String downtown2Description = resources.getString(R.string.downtown2_description);
        String downtown2FileName = resources.getString(R.string.downtown2_filename);

        String downtown3Name = resources.getString(R.string.downtown3_name);
        String downtown3Address = resources.getString(R.string.downtown3_address);
        String downtown3Description = resources.getString(R.string.downtown3_description);
        String downtown3FileName = resources.getString(R.string.downtown3_filename);


        String downtown4Name = resources.getString(R.string.downtown4_name);
        String downtown4Address = resources.getString(R.string.downtown4_address);
        String downtown4Description = resources.getString(R.string.downtown4_description);
        String downtown4FileName = resources.getString(R.string.downtown4_filename);

        String downtown5Name = resources.getString(R.string.downtown5_name);
        String downtown5Address = resources.getString(R.string.downtown5_address);
        String downtown5Description = resources.getString(R.string.downtown5_description);
        String downtown5FileName = resources.getString(R.string.downtown5_filename);
        //
        downtown1.setName(downtown1Name);
        downtown1.setFilename(downtown1FileName);
        downtown1.setAddress(downtown1Address);
        downtown1.setDescription(downtown1Description);

        downtown2.setName(downtown2Name);
        downtown2.setFilename(downtown2FileName);
        downtown2.setAddress(downtown2Address);
        downtown2.setDescription(downtown2Description);

        downtown3.setName(downtown3Name);
        downtown3.setAddress(downtown3Address);
        downtown3.setDescription(downtown3Description);
        downtown3.setFilename(downtown3FileName);


        downtown4.setName(downtown4Name);
        downtown4.setAddress(downtown4Address);
        downtown4.setDescription(downtown4Description);
        downtown4.setFilename(downtown4FileName);


        downtown5.setName(downtown5Name);
        downtown5.setAddress(downtown5Address);
        downtown5.setDescription(downtown5Description);
        downtown5.setFilename(downtown5FileName);
        //
        attractions.add(downtown1);
        attractions.add(downtown2);
        attractions.add(downtown3);
        attractions.add(downtown4);
        attractions.add(downtown5);
        return attractions;
    }
}
