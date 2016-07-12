package rocks.athrow.android_tour_guide;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

/**
 * DataProvider
 * Created by thr0w on 7/10/16.
 */
public class DataProvider {
    private final Context mContext;

    public DataProvider(Context context) {
        this.mContext = context;
    }

    public ArrayList<Attraction> getAttraction(String category) {
        Resources resources = mContext.getResources();
        ArrayList<Attraction> attractions = new ArrayList<>();

        switch (category) {
            case "downtown":
                Attraction downtown1 = new Attraction(category);
                Attraction downtown2 = new Attraction(category);
                Attraction downtown3 = new Attraction(category);
                Attraction downtown4 = new Attraction(category);
                Attraction downtown5 = new Attraction(category);

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

                attractions.add(downtown1);
                attractions.add(downtown2);
                attractions.add(downtown3);
                attractions.add(downtown4);
                attractions.add(downtown5);
                break;
            case "museums":
                Attraction museum1 = new Attraction(category);
                Attraction museum2 = new Attraction(category);
                Attraction museum3 = new Attraction(category);
                Attraction museum4 = new Attraction(category);
                Attraction museum5 = new Attraction(category);

                String museum1Name = resources.getString(R.string.museum1_name);
                String museum1Address = resources.getString(R.string.museum1_address);
                String museum1Description = resources.getString(R.string.museum1_description);
                String museum1Filename = resources.getString(R.string.museum1_filename);

                museum1.setName(museum1Name);
                museum1.setAddress(museum1Address);
                museum1.setDescription(museum1Description);
                museum1.setFilename(museum1Filename);

                String museum2Name = resources.getString(R.string.museum2_name);
                String museum2Address = resources.getString(R.string.museum2_address);
                String museum2Description = resources.getString(R.string.museum2_description);
                String museum2Filename = resources.getString(R.string.museum2_filename);

                museum2.setName(museum2Name);
                museum2.setAddress(museum2Address);
                museum2.setDescription(museum2Description);
                museum2.setFilename(museum2Filename);

                String museum3Name = resources.getString(R.string.museum3_name);
                String museum3Address = resources.getString(R.string.museum3_address);
                String museum3Description = resources.getString(R.string.museum3_description);
                String museum3Filename = resources.getString(R.string.museum3_filename);

                museum3.setName(museum3Name);
                museum3.setAddress(museum3Address);
                museum3.setDescription(museum3Description);
                museum3.setFilename(museum3Filename);

                String museum4Name = resources.getString(R.string.museum4_name);
                String museum4Address = resources.getString(R.string.museum4_address);
                String museum4Description = resources.getString(R.string.museum4_description);
                String museum4Filename = resources.getString(R.string.museum4_filename);

                museum4.setName(museum4Name);
                museum4.setAddress(museum4Address);
                museum4.setDescription(museum4Description);
                museum4.setFilename(museum4Filename);

                String museum5Name = resources.getString(R.string.museum5_name);
                String museum5Address = resources.getString(R.string.museum5_address);
                String museum5Description = resources.getString(R.string.museum5_description);
                String museum5Filename = resources.getString(R.string.museum5_filename);

                museum5.setName(museum5Name);
                museum5.setAddress(museum5Address);
                museum5.setDescription(museum5Description);
                museum5.setFilename(museum5Filename);

                attractions.add(museum1);
                attractions.add(museum2);
                attractions.add(museum3);
                attractions.add(museum4);
                attractions.add(museum5);

                break;
            case "trails":
                Attraction trail1 = new Attraction(category);
                Attraction trail2 = new Attraction(category);
                Attraction trail3 = new Attraction(category);
                Attraction trail4 = new Attraction(category);
                Attraction trail5 = new Attraction(category);

                String trail1Name = resources.getString(R.string.trail1_name);
                String trail1Address = resources.getString(R.string.trail1_address);
                String trail1Description = resources.getString(R.string.trail1_description);
                String trail1Filename = resources.getString(R.string.trail1_filename);

                trail1.setName(trail1Name);
                trail1.setAddress(trail1Address);
                trail1.setDescription(trail1Description);
                trail1.setFilename(trail1Filename);

                String trail2Name = resources.getString(R.string.trail2_name);
                String trail2Address = resources.getString(R.string.trail2_address);
                String trail2Description = resources.getString(R.string.trail2_description);
                String trail2Filename = resources.getString(R.string.trail2_filename);

                trail2.setName(trail2Name);
                trail2.setAddress(trail2Address);
                trail2.setDescription(trail2Description);
                trail2.setFilename(trail2Filename);

                String trail3Name = resources.getString(R.string.trail3_name);
                String trail3Address = resources.getString(R.string.trail3_address);
                String trail3Description = resources.getString(R.string.trail3_description);
                String trail3Filename = resources.getString(R.string.trail3_filename);

                trail3.setName(trail3Name);
                trail3.setAddress(trail3Address);
                trail3.setDescription(trail3Description);
                trail3.setFilename(trail3Filename);

                String trail4Name = resources.getString(R.string.trail4_name);
                String trail4Address = resources.getString(R.string.trail4_address);
                String trail4Description = resources.getString(R.string.trail4_description);
                String trail4Filename = resources.getString(R.string.trail4_filename);

                trail4.setName(trail4Name);
                trail4.setAddress(trail4Address);
                trail4.setDescription(trail4Description);
                trail4.setFilename(trail4Filename);

                String trail5Name = resources.getString(R.string.trail5_name);
                String trail5Address = resources.getString(R.string.trail5_address);
                String trail5Description = resources.getString(R.string.trail5_description);
                String trail5Filename = resources.getString(R.string.trail5_filename);

                trail5.setName(trail5Name);
                trail5.setAddress(trail5Address);
                trail5.setDescription(trail5Description);
                trail5.setFilename(trail5Filename);

                attractions.add(trail1);
                attractions.add(trail2);
                attractions.add(trail3);
                attractions.add(trail4);
                attractions.add(trail5);
                break;
            case "food":
                Attraction food1 = new Attraction(category);
                Attraction food2 = new Attraction(category);
                Attraction food3 = new Attraction(category);
                Attraction food4 = new Attraction(category);
                Attraction food5 = new Attraction(category);

                String food1Name = resources.getString(R.string.food1_name);
                String food1Address = resources.getString(R.string.food1_address);
                String food1Description = resources.getString(R.string.food1_description);
                String food1Filename = resources.getString(R.string.food1_filename);

                food1.setName(food1Name);
                food1.setAddress(food1Address);
                food1.setDescription(food1Description);
                food1.setFilename(food1Filename);

                String food2Name = resources.getString(R.string.food2_name);
                String food2Address = resources.getString(R.string.food2_address);
                String food2Description = resources.getString(R.string.food2_description);
                String food2Filename = resources.getString(R.string.food2_filename);

                food2.setName(food2Name);
                food2.setAddress(food2Address);
                food2.setDescription(food2Description);
                food2.setFilename(food2Filename);

                String food3Name = resources.getString(R.string.food3_name);
                String food3Address = resources.getString(R.string.food3_address);
                String food3Description = resources.getString(R.string.food3_description);
                String food3Filename = resources.getString(R.string.food3_filename);

                food3.setName(food3Name);
                food3.setAddress(food3Address);
                food3.setDescription(food3Description);
                food3.setFilename(food3Filename);

                String food4Name = resources.getString(R.string.food4_name);
                String food4Address = resources.getString(R.string.food4_address);
                String food4Description = resources.getString(R.string.food4_description);
                String food4Filename = resources.getString(R.string.food4_filename);

                food4.setName(food4Name);
                food4.setAddress(food4Address);
                food4.setDescription(food4Description);
                food4.setFilename(food4Filename);

                String food5Name = resources.getString(R.string.food5_name);
                String food5Address = resources.getString(R.string.food5_address);
                String food5Description = resources.getString(R.string.food5_description);
                String food5Filename = resources.getString(R.string.food5_filename);

                food5.setName(food5Name);
                food5.setAddress(food5Address);
                food5.setDescription(food5Description);
                food5.setFilename(food5Filename);

                attractions.add(food1);
                attractions.add(food2);
                attractions.add(food3);
                attractions.add(food4);
                attractions.add(food5);
                break;
        }
        return attractions;
    }
}
