package com.example.encarta.newethioencarta;

/* Credits:
 *    Atif Pervaiz
 * Websites:
 *    https://devofandroid.blogspot.com/
 *    https://atifsoftwares.blogspot.com/
 * Youtube:
 *    https://www.youtube.com/watch?v=_EIYM-wwObI&t=632s
 * Playstore:
 *    https://play.google.com/store/apps/dev?id=6868537621115215530*/

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.encarta.newethioencarta.culturalgemsandmusic.Ethiopianjoks;
import com.example.encarta.newethioencarta.culturalgemsandmusic.Musicalhistory;
import com.example.encarta.newethioencarta.culturalgemsandmusic.Musicalinstrument;
import com.example.encarta.newethioencarta.culturalgemsandmusic.Sport;
import com.example.encarta.newethioencarta.hertages.Ethiuniscohirt;
import com.example.encarta.newethioencarta.hertages.Naturalhrtagedescrpt;
import com.example.encarta.newethioencarta.hertages.Religoushrti;
import com.example.encarta.newethioencarta.history.Ethiomiddle;
import com.example.encarta.newethioencarta.history.Ethiopiaanisint;
import com.example.encarta.newethioencarta.history.Gondarperiod;
import com.example.encarta.newethioencarta.history.Modernethiopia;
import com.example.encarta.newethioencarta.history.Perehisory;
import com.example.encarta.newethioencarta.humans.Govtandlaws;
import com.example.encarta.newethioencarta.humans.cultures.Holidays;
import com.example.encarta.newethioencarta.humans.famous.Hailegrma;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());
        holder.mDescTv.setText(modellist.get(postition).getDesc());
        //set the result in imageview
        holder.mIconIv.setImageResource(modellist.get(postition).getIcon());

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("lucy")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Ethiuniscohirt.class);
                    intent.putExtra("actionBarTitle", "Battery");
                    intent.putExtra("contentTv", "This is Battery detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("lalibela")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Govtandlaws.class);
                    intent.putExtra("actionBarTitle", "Cpu");
                    intent.putExtra("contentTv", "This is Cpu detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("axsum")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Gondarperiod.class);
                    intent.putExtra("actionBarTitle", "Display");
                    intent.putExtra("contentTv", "This is Display detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ቅድመ ታሪክ/Prehistory")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Perehisory.class);
                    intent.putExtra("actionBarTitle", "Memory");
                    intent.putExtra("contentTv", "This is Memory detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("የጥንት የኢትዮጵያ ታሪክ/antiquity ethiopia histor")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Ethiopiaanisint.class);
                    intent.putExtra("actionBarTitle", "Sensor");
                    intent.putExtra("contentTv", "This is Sensor detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("የኢትዮጵያ ታሪክ መካከለኛ ዕድሜ/ethiopian history middle ages")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Ethiomiddle.class);
                    intent.putExtra("actionBarTitle", "Sensor");
                    intent.putExtra("contentTv", "This is Sensor detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ዘመናዊ የኢትዮጵያ ታሪክ/modern history of Ethiopian")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Modernethiopia.class);
                    intent.putExtra("actionBarTitle", "Sensor");
                    intent.putExtra("contentTv", "This is Sensor detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("የኢትዮጵያን ቀልዶች/Ethiopia Jokes")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Ethiopianjoks.class);
                    intent.putExtra("actionBarTitle", "Battery");
                    intent.putExtra("contentTv", "This is Battery detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("የኢትዮጵያ የሙዚቃ ታሪክ/Ethiopian  music history")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Musicalhistory.class);
                    intent.putExtra("actionBarTitle", "Cpu");
                    intent.putExtra("contentTv", "This is Cpu detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("የሙዚቃ መሳሪያ/musical_instrument")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Musicalinstrument.class);
                    intent.putExtra("actionBarTitle", "Display");
                    intent.putExtra("contentTv", "This is Display detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ስፖርት/sports")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Sport.class);
                    intent.putExtra("actionBarTitle", "Memory");
                    intent.putExtra("contentTv", "This is Memory detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ተፈጥሯዊ ቅርሶች/Natural Heritagesr")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Naturalhrtagedescrpt.class);
                    intent.putExtra("actionBarTitle", "Sensor");
                    intent.putExtra("contentTv", "This is Sensor detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ሃይማኖታዊ ቅርሶችን/Religions Heritage")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Religoushrti.class);
                    intent.putExtra("actionBarTitle", "Sensor");
                    intent.putExtra("contentTv", "This is Sensor detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("ዩኔስኮ የተመዘገበ ቅርስ/Heritage registered in UNISCO")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Ethiuniscohirt.class);
                    intent.putExtra("actionBarTitle", "Sensor");
                    intent.putExtra("contentTv", "This is Sensor detail...");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("በ 13 ዓመቷ ሙዚቀኛ ለመሆን ቆርጣ ተነሳችና አዲስ አበባ ውስጥ በሚገኝ ሃገር ፋቲር ቲያትር ውስጥ ሥራዋን ጀመረች.\n" +
                        "\n" +
                        "በአሥራዎቹ ዕድሜ መገባደጃ ላይ ከጀመረች በኋላ በዋና ከተማዋ ክለቦች እና ሆቴሎች ውስጥ እንደ ሬስቶን ባንድ ከመሆኑ በፊት እንደ ካቲን ባንድ, ሆቴል አፍሪካ ባንድ, ሸቤል ባንድ እና አይቤክስ ባንድ ባሉ ዘፈኖች ያከናውን ነበር.\n" +
                        "\n" +
                        "አስቴር የተለያዩ ዘይቤዎች ተካተዋል.እንዲሁም ሌሎች እንደ ኢትዮጵያዊ ዘፋኞች ተፅእኖ አሳድሯል.\n" +
                        "\n" +
                        "የሙዚቃ ሥራን መጀመር, አምስት ታት እና ሁለት የሙዚቃ ዜማዎችን ገንዘብ ለግስለት እና ለፖስታ ያደረገችውን \u200B\u200Bየሙዚቃ አሠልጣኝ አሊ ታንጎን ተበረታታች. በ 1981 እ.ኤ.አ. አስቴር ኢትዮጵያን ግራ መጋባት የጣለችው የአጼ ኃይለስላሴ ሞት ከተገደለ በኋላ ወደ ዩናይትድ ስቴትስ ተዛውሮ ነበር. በካሊፎርኒያ የባህር ወሽመጥ አካባቢ በጊዜያዊነት ለመቋቋም በ 2 ዓመት ጊዜ ውስጥ ከፍተኛ ትምህርት ለመከታተል ዕቅድ በማውጣቷ በሀገሪቱ ካሉት ትላልቅ የኢትዮጵያውያን ማህበራት መካከል ዋነኛው ነው. እዚያም በኢትዮጵያውያን ማህበረሰብ ውስጥ በሆቴሎችና በክለቦች ውስጥ እየሰራች ትታወቃለች.\n" +
                        "\n" +
                        "አስቴር በኢትዮጵያ ውስጥም ታዋቂ ሆኗል. እ.ኤ.አ. በ 1997 ዓ.ም ከ 50 ሺህ ለሚበልጡ ሰዎች በአዲስ አበባ ውስጥ አከናወነች. እ.ኤ.አ. በ 2003 አስቴር በኢትዮጵያ ለሚኖሩ የእርዳታ እና የትምህርት ተቋማት ገንዘብ ለማሰባሰብ ሁለት ተከታታይ ኮንሰርት ተከታታይ ሠርቷል. የመጀመሪያው የሙዚቃ ዝግጅት በአዲስ አበባ ስታዲየም ውስጥ በኢድ አል-ፊጥር ቀን 40,000 ተሰብሳቢዎች ተገኝተዋል. ሁለተኛው ትርዒት \u200B\u200Bበሸራተን ሆቴል የአንድ ጋቢ እራት ነበር. [2] በቅርብ ጊዜ ግንቦት 9 ቀን 2009 Aster በ A ርት ህብረት በ A ንድነት ዩኒቲ በሚኒየም መድረክ ከሌሎች የ I ትዮጵያ የሥነ-ጥበብ አርቲስቶች ጋር በተካሄደው የ A ርት ህብረት በ 10,000 ተመልካቾች ፊት ነበር.\n" +
                        " By the age of 13, Aster was determined to become a musician, and began her career at Hager Fikir Theatre in Addis Ababa.\n" +
                        "\n" +
                        "Starting in her late teens, she was performing in clubs and hotels in the capital with bands such as the Continental Band, Hotel D Afrique Band, Shebele Band and Ibex Band, before they became the internationally known as Roha Band.\n" +
                        "\n" +
                        "Aster is distinct style has been influenced by other Ethiopian singers, such as Bizunesh Bekele.\n" +
                        "\n" +
                        "Launching a solo career, she was encouraged by musical entrepreneur Ali Tango, who financed and released five cassettes and two singles of her music. By 1981, Aster had become disillusioned by Ethiopia is oppressive political climate following the death of Haile Selassie, and relocated to the United States. Temporarily settling in the Bay Area of California, with plans to pursue higher education within a period of two years, she settled in Washington, D.C., where one of the largest Ethiopian expat communities in the country existed. There, she became increasingly popular within the Ethiopian community, performing in restaurants and clubs.\n" +
                        "\n" +
                        "Aster also remains popular in Ethiopia. In 1997, she performed in Addis Ababa for a crowd of over 50,000 people. In 2003, Aster also performed a two-part" +
                        " concert series to raise funds for relief and school initiatives in Ethiopia. The first concert was held in November on Eid Al-Fitr day at the Addis Ababa" +
                        " Stadium, with an audience of 40,000 in attendance. The second performance was a gala-dinner at the Sheraton Hotel.[2] More recently, on May 9, 2009, Aster " +
                        "performed in front of a crowd of 10,000 spectators during the Peace Through Unity, Unity Through Music concert held in the capital's Millennium Hall, " +
                        "alongside other Ethiopian music artists\n")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Ethiuniscohirt.class);
                    intent.putExtra("actionBarTitle", "Sensor");
                    intent.putExtra("contentTv", "This is Sensor detail...");
                    mContext.startActivity(intent);
                }
            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                    .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}
