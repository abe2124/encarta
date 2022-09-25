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

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.encarta.newethioencarta.hertages.Heritage;
import com.example.encarta.newethioencarta.history.Historys;
import com.example.encarta.newethioencarta.humans.Humans;
import com.example.encarta.newethioencarta.sance.Scince_and_Nature;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    //this is demo update to java file

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("search Information");

        title = new String[]{"lucy",
                "lalibela",
                "axsum",
                "ቅድመ ታሪክ/Prehistory",
                "የጥንት የኢትዮጵያ ታሪክ/antiquity ethiopia history",
                "የኢትዮጵያ ታሪክ መካከለኛ ዕድሜ/ethiopian history middle ages",
                "ዘመናዊ የኢትዮጵያ ታሪክ/modern history of Ethiopian",
                "የኢትዮጵያን ቀልዶች/Ethiopia Jokes",
                "የኢትዮጵያ የሙዚቃ ታሪክ/Ethiopian  music history",
                "የሙዚቃ መሳሪያ/musical_instrument"
                , "ስፖርት/sports",
                "ተፈጥሯዊ ቅርሶች/Natural Heritages",
                "ሃይማኖታዊ ቅርሶችን/Religions Heritage",
                "ዩኔስኮ የተመዘገበ ቅርስ/Heritage registered in UNISCO",
                "በ 13 ዓመቷ ሙዚቀኛ ለመሆን ቆርጣ ተነሳችና አዲስ አበባ ውስጥ በሚገኝ ሃገር ፋቲር ቲያትር ውስጥ ሥራዋን ጀመረች.\n" +
                        "በአሥራዎቹ ዕድሜ መገባደጃ ላይ ከጀመረች በኋላ በዋና ከተማዋ ክለቦች እና ሆቴሎች ውስጥ እንደ ሬስቶን ባንድ ከመሆኑ በፊት እንደ ካቲን ባንድ, ሆቴል አፍሪካ ባንድ, ሸቤል ባንድ እና አይቤክስ ባንድ ባሉ ዘፈኖች ያከናውን ነበር.\n" +
                        "አስቴር የተለያዩ ዘይቤዎች ተካተዋል.እንዲሁም ሌሎች እንደ ኢትዮጵያዊ ዘፋኞች ተፅእኖ አሳድሯል.\n" +
                        "የሙዚቃ ሥራን መጀመር, አምስት ታት እና ሁለት የሙዚቃ ዜማዎችን ገንዘብ ለግስለት እና ለፖስታ ያደረገችውን የሙዚቃ አሠልጣኝ አሊ ታንጎን ተበረታታች. በ 1981 እ.ኤ.አ. አስቴር ኢትዮጵያን ግራ መጋባት የጣለችው የአጼ ኃይለስላሴ ሞት ከተገደለ በኋላ ወደ ዩናይትድ ስቴትስ ተዛውሮ ነበር. በካሊፎርኒያ የባህር ወሽመጥ አካባቢ በጊዜያዊነት ለመቋቋም በ 2 ዓመት ጊዜ ውስጥ ከፍተኛ ትምህርት ለመከታተል ዕቅድ በማውጣቷ በሀገሪቱ ካሉት ትላልቅ የኢትዮጵያውያን ማህበራት መካከል ዋነኛው ነው. እዚያም በኢትዮጵያውያን ማህበረሰብ ውስጥ በሆቴሎችና በክለቦች ውስጥ እየሰራች ትታወቃለች.\n" +
                        "አስቴር በኢትዮጵያ ውስጥም ታዋቂ ሆኗል. እ.ኤ.አ. በ 1997 ዓ.ም ከ 50 ሺህ ለሚበልጡ ሰዎች በአዲስ አበባ ውስጥ አከናወነች. እ.ኤ.አ. በ 2003 አስቴር በኢትዮጵያ ለሚኖሩ የእርዳታ እና የትምህርት ተቋማት ገንዘብ ለማሰባሰብ ሁለት ተከታታይ ኮንሰርት ተከታታይ ሠርቷል. የመጀመሪያው የሙዚቃ ዝግጅት በአዲስ አበባ ስታዲየም ውስጥ በኢድ አል-ፊጥር ቀን 40,000 ተሰብሳቢዎች ተገኝተዋል. ሁለተኛው ትርዒት በሸራተን ሆቴል የአንድ ጋቢ እራት ነበር. [2] በቅርብ ጊዜ ግንቦት 9 ቀን 2009 Aster በ A ርት ህብረት በ A ንድነት ዩኒቲ በሚኒየም መድረክ ከሌሎች የ I ትዮጵያ የሥነ-ጥበብ አርቲስቶች ጋር በተካሄደው የ A ርት ህብረት በ 10,000 ተመልካቾች ፊት ነበር.\n" +
                        "By the age of 13, Aster was determined to become a musician, and began her career at Hager Fikir Theatre in Addis Ababa.Starting in her late teens, she was performing in clubs and hotels in the capital with bands such as the Continental Band, Hotel D Afrique Band, Shebele Band and Ibex Band, before they became the internationally known as Roha Band.Aster is distinct style has been influenced by other Ethiopian singers, such as Bizunesh Bekele\n" +
                        "Launching a solo career, she was encouraged by musical entrepreneur Ali Tango, who financed and released five cassettes and two singles of her music. By 1981, Aster had become disillusioned by Ethiopia is oppressive political climate following the death of Haile Selassie, and relocated to the United States. Temporarily settling in the Bay Area of California, with plans to pursue higher education within a period of two years, she settled in Washington, D.C., where one of the largest Ethiopian expat communities in the country existed. There, she became increasingly popular within the Ethiopian community, performing in restaurants and clubs\n" +
                        "Aster also remains popular in Ethiopia. In 1997, she performed in Addis Ababa for a crowd of over 50,000 people. In 2003, Aster also performed a two-part\" \n" +
                        "concert series to raise funds for relief and school initiatives in Ethiopia. The first concert was held in November on Eid Al-Fitr day at the Addis Ababa\" \n" +
                        "Stadium, with an audience of 40,000 in attendance. The second performance was a gala-dinner at the Sheraton Hotel More recently, on May 9, 2009, Aster \n" +
                        "\"performed in front of a crowd of 10,000 spectators during the Peace Through Unity, Unity Through Music concert held in the capital's Millennium Hall, \n" +
                        "\"alongside other Ethiopian music artists\n",
                "Emperor Tewodros (or Theodore) II was born Lij Kassa in Qwara, in 1818. His father was a small local chief, and his relative (possibly uncle) Dejazmach Kinfu was governor of the provinces of Dembiya, Qwara and Chelga between Lake Tana and the northwestern frontier. Kassa lost his inheritance upon the death of Kinfu while he was still a young boy. After receiving a traditional education in a local monastery, he went off to lead a band of bandits that roved the country in a Robin Hood-like existence. His exploits became widely known, and his band of followers grew steadily until he led a formidable army. He came to the notice of the ruling Regent, Ras Ali, and his mother Empress Menen Liben Amede (wife of the Emperor Yohannes III). In order to bind him to them, the Empress arranged for Kassa to marry Alis daughter. He turned his attention to conquering the remaining chief divisions of the country, Gojjam, Tigray and Shewa, which still remained unsubdued. His relations with his father-in-law and grandmother-in-law deteriorated however, and he soon took up arms against them and their vassals, and was successful.\n" +
                        "On February 11, 1855, Kassa deposed the last of the Gondarine puppet Emperors, and was crowned negusa nagast of Ethiopia under the name of Tewodros II. He soon after advanced against Shewa with a large army. Chief of the notables opposing him was its king Haile Melekot, a descendant of Meridazmach Asfa Wossen. Dissensions broke out among the Shewans, and after a desperate and futile attack on Tewodros at Dabra Berhan, Haile Melekot died of illness, nominating with his last breath his eleven-year-old son as successor (November 1855) under the name Negus Sahle Maryam (the future emperor Menelek II). Darge, Haile Melekots brother, and Ato Bezabih, a Shewan noble, took charge of the young prince, but after a hard fight with Angeda, the Shewans were obliged to capitulate. Sahle Maryam was handed over to the Emperor Tewodoros and taken to Gondar. He was trained there in Tewodros's service, and then placed in comfortable detention at the fortress of Magdala. Tewodoros afterwards devoted himself to modernizing and centralizing the legal and administrative structure of his kingdom, against the resistance of his governors. Sahle Maryam of Shewa was married to Tewodros II's daughter Alitash.\n" +
                        "In 1865, Sahle Maryam escaped from Magdala, abandoning his wife, and arrived in Shewa, and was there acclaimed as Negus. Tewodros forged an alliance between Britain and Ethiopia, but as explained in the next section, he committed suicide after a military defeat by the British. On the death of Tewodros, many Shewans, including Ras Darge, were released, and the young Negus of Shewa began to feel himself strong enough, after a few preliminary minor campaigns, to undertake offensive operations against the northern princes. However, these projects were of little avail, for Ras Kassai of Tigray had by this time (1872) risen to supreme power in the north. Proclaiming himself negusa nagast under the name of Yohannes IV (or John IV), he forced Sahle Maryam to acknowledge his overlordship. ንጉሠ ነገሥት ቴዎድሮስ (ወይም ቴዎዶር) II የተወለደው በ 1818 ኩዊራ ውስጥ ሊጃ ካሳ ነበር. አባቱ ትንሽ የአካባቢው አለቃ ነበር, እና ዘመድ (ምናልባትም አጎቱ) ደጃዝማች ኪኖ የአዲምቢያ, የቁዋራ እና የኬላ ግዛቶች ገዥ ነበር. ሰሜን ምዕራብ ድንበር. ካሣ በወጣ ትንሹ ልጅ እያለ ኪንፉ በሞተበት ጊዜ የነበረውን ውርሻ አጣ. በአካባቢው ገዳም ውስጥ ባህላዊ ትምህርት ከተከታተለ በኋላ በሮቢን ሁድ-መሰል ሕንፃ ውስጥ ሀገርን ለመንሸራሸር የሽኝት ቡድን ለመምራት ቀጠለ. ክርክሮቹ በሰፊው የታወቁ ሲሆን ተከታይ ቡድኖቹ አንድ ትልቅ ሠራዊት እስከተሳለፉበት ጊዜ ድረስ በቋሚነት እያደገ ሄደ. ለገዢው ንጉስ ሬያስ ዒሊስ እና ለወንድም እቴጌ መነን ሊቤን አማዴ (የአ Em ዮሐንስ ዮሀስ ሚስቶች ሚስት) ማስጠንቀቂያ ደረሰ. ንግስቲቱ እሳቸውም እንዲሰሩ ካሣ, የአሊስ ሴት ልጅ እንዲያገባ ለማድረግ ቀጠለች. ቀሪዎቹን የአገሪቱን ዋና ጎሳዎች, ጎጃም, የትግራይ እና ሸዋ ድል ለመንሳት ወደ ኋላ ዞረ. ይሁን እንጂ ከአማቱና ከአያቱ ጋር የነበረው ግንኙነት እያሽቆለቆለ ሄደ; ብዙም ሳይቆይ ግን በእነሱና በቫሳልያው በእነሱ ላይ መሣሪያ ያነሳ ሲሆን ስኬታማ ነበር.\n" +
                        "የካቲት 11, 1855 ካሳ የጅንዳኔን አሻንጉሊት ንጉሶች አቁሞ አራተኛውን የኢትዮጵያ አጼ ቴዎድሮስ (አጼ ቴዎድሮስ) አስቆጥረውታል. እሱ ብዙም ሳይቆይ በሸሸን ታላቅ ሰራዊት ጋር ለመግጠም ተገደደ. የተቃውሞው ዋና አለቃ የነበረው የንጉሥ ሀለለም ሜለካት, ከሜሪዝዛክ አሲፋ አሶስ ተወላጅ ነበር. በሼዋኖች መካከል ውህደቶች ተከፈቱ, እና ኃይለስ መሌክ በቴውዎሮስ ላይ በደረሰው ድብደባ እና ድካም ላይ ከወደመ በኋላ በ 11 አመት እድሜው ህይወቱን ሞተ. (ኖቬምበር 1855) በአጎስ ሳህል ማርያም (የወደፊቱ ንጉሠ ነገሥት ሜንዴክ II). ዳጌ, ሃይሌ ሜለክስስ ወንዴም, እና የቦሸን ወ / ሮ ባሴቢህ የሽዋን መሪ የነበሩትን ወጣት አለቃን ተቆጣጠሩ. ነገር ግን ከኤውዳአዎች ጋር ጠንካራ ግጭት ከተፈጠረ በኋላ ሸዋኖች የመምታት ግዴታ ነበረባቸው. ሳህል ማርያም ወደ ንጉሱ ቴዎድሮስ ተወስዶ ወደ ጎንደር ተወሰደ. በቴውዞሮስ አገልግሎት ተሠለጠነ እና ከዚያም በመጋዴል ምሽት በእስር ቤት ውስጥ ታስሮ ቆይቷል. ከዚህ በኋላ ቴዎድሮስ መንግስታዊውን ህጋዊ እና አስተዳደራዊ አወቃቀሩ, የገዥዎቿን ተቃውሞ ለመግታትና ለማብሰር ቆርጦ ነበር. ሳህል ማጃማም ሸዋ የአጼ ቴዎድሮስ 2 ኛ ልጅ የአቲትሽ ልጅ አገባች.\n" +
                        "በ 1865 ሳህል ሜሪም ሚስቱን በመተው ከስዊድን ሸሽቶ ወደ ሸዋ ደረሰች. ቴዎድሮስ በብሪቲሽ እና በኢትዮጵያ መካከል ጥምረት ፈጠረ. በሚቀጥለው ክፍል እንደተገለፀው የእንግሊዛዊያን ወታደራዊ ድል ከተቀዳጀ በኋላ እራሳቸውን ለማጥፋት ጀመሩ. ቴውድሮስ ሲሞት የራስ ዳደንን ጨምሮ ብዙ ሳዋንሶች ከእስር ተለቀዋል. ሸዋ የተባለው ወጣት ጎሳ ደግሞ ከጥቂት የመጀመሪያ ዘመቻዎች በኋላ በሰሜናዊ ልዑካን ላይ አስፈሪ ተግባር እንዲፈጽም ተደረገ. ይሁን እንጂ እነዚህ ፕሮጀክቶች ብዙም አልነበሩም, ምክንያቱም በዚህ ወቅት (1872) ራጋ ካሸይ በሰሜን በኩል ወደ ከፍተኛ ሥልጣን ተጨመረ. ሰላም ማሰማት\n" +
                        " \n" +
                        "\n" +
                        "\n"};
        description = new String[]{"Battery detail...",
                "Cpu detail...",
                "Display detail...",
                "Memory detail...",
                "Sensor detail...",
                "Sensor detail...",
                "Sensor detail...",
                "Battery detail...",
                "Cpu detail...",
                "Display detail...",
                "Memory detail...",
                "Sensor detail...",
                "Sensor detail...",
                "Sensor detail...",
                "Sensor detail...",
                "Sensor detail..."};
        icon = new int[]{R.drawable.lucy,
                R.drawable.lalibela,
                R.drawable.axsum,
                R.drawable.pre,
                R.drawable.war,
                R.drawable.war,
                R.drawable.war,
                R.drawable.lucy,
                R.drawable.lalibela,
                R.drawable.axsum,
                R.drawable.pre,
                R.drawable.war,
                R.drawable.war,
                R.drawable.war,
                R.drawable.aster_aweke,
                R.drawable.aster_aweke};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){
            //do your functionality here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")

   public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Search) {
            Intent Search=new Intent(MainActivity.this, com.example.encarta.newethioencarta.MainActivity.class);
            startActivities(new Intent[]{Search});

            if (id == R.id.home) {
                Intent Home = new Intent( MainActivity.this, com.example.encarta.newethioencarta.Home.class );
                startActivities( new Intent[]{Home} );
            }
        } else if (id == R.id.history) {
            Intent History=new Intent(MainActivity.this,Historys.class);
            startActivities(new Intent[]{History});

        } else if (id == R.id.human) {

            Intent Human=new Intent(MainActivity.this,Humans.class);
            startActivities(new Intent[]{Human});

        } else if (id == R.id.music) {

            Intent Human=new Intent(MainActivity.this,Musicandc.class);
            startActivities(new Intent[]{Human});

        } else if (id == R.id.netur) {

            Intent Human=new Intent(MainActivity.this,Scince_and_Nature.class);
            startActivities(new Intent[]{Human});

        } else if (id == R.id.hritage) {
            Intent Human=new Intent(MainActivity.this,Heritage.class);
            startActivities(new Intent[]{Human});

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer( GravityCompat.START);
        return true;
    }
}
/*design row of listview
* adding menu to add searchview in actionbar
* add model class
* add adapter class
* add some images in drawable folder
* Run project and test the listview and searchview
* ok, thats working well now handle item click to move to new activity with actionbar title and som
* data.
* Change Actionbar title of both activitis
* add back button in actionbar of NewActivity
* hanlde item clicks*/