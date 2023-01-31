package com.example.whereto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class NorthIndiaScreen extends AppCompatActivity {

    RecyclerView recycler;
    List<Model> modelList;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_india_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        modelList = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList.add(new Model(R.drawable.jummukashmir,"Jammu And Kashmir","Known as Heaven on the Earth, Jammu & Kashmir is where Mother Nature has bestowed all her love. Enclosed by the Himalayas and Karakoram ranges; and festooned with verdant meadows, lush valleys, dense forests, splendid temples, this new union territory of India is a holiday destination to instantly fall in love with Being an ideal tourist destination for family tours, honeymoon tours and the perfect place for adventure enthusiasts, Jammu & Kashmir offers abundance tour options for travellers of all kind.\n" +
                "\nThe majestic valleys of Kashmir offer adventure opportunities like trekking and skiing. The serene destination is also famous for experiential travels in the form of either a stay at a houseboat or Shikara ride on Dal and Nigeen Lake. Nothing can beat the beauty of Jammu & Kashmir, and to believe it, one has to see it!"));
        modelList.add(new Model(R.drawable.srinagar,"Srinagar","Srinagar, the summer capital of Jammu and Kashmir is located in the heart of the Kashmir valley at an altitude of 1,730 m above sea level. Spread on both sides of the river Jhelum the city is famous for its natural beauty, gardens, waterfronts and houseboats. Srinagar is called the city of lakes and the Venice of the East, fascinating tourists from centuries with its beautiful picturesque Himalayan backdrop, glittering lakes that are surrounded by houseboats and Shikaras and the majesty of Mughal architecture. The very absence of order in the location of the houses and their tumbled down appearance add a peculiar charm to the scenery. It has its own quaint lifestyle, telling a panoramic fairytale tour through the snow-capped mountains and Chinar trees, while enjoying the adventurous pleasures of hiking, mountain biking, and rafting. The city is also famous for traditional Kashmiri handicrafts and dried fruits.Srinigar is a modern waterworld, dominated by Dal Lake and its twisting waterways, tree-lined Nagin Lake, and the Jhelum River. Engulf yourself in local culture by embracing your sea legs and renting one of the wooden boats called shikaras for a daytime or twilight cruise. On land, stroll through the terraced hillsides of the 400-year-old Mughal Gardens, created by Emperor Jehangir for his wife, and shop for indigenous crafts like hand-woven silks and embroidered shawls."));
        modelList.add(new Model(R.drawable.agra,"Agra","Agra is a city offering a discovery of the beautiful era. Agra has a rich history, reflected in its numerous monuments dotted in and around the city. The earliest citation for Agra comes from the mythological era, where the epic Mahabharata refer Agra as ‘Agravana’ meaning paradise in Sanskrit. ‘Ptolemy’, the famous second century A.D. geographer, was the first person who referred Agra with its modern name. The Modern Agra was founded by Sikandar Lodi, ruler of Lodi dynasty in 16th century. It was when Shah Jahan descended the Mughal throne that Agra reached the zenith of architectural beauty.\n" +
                "\n" +
                "The city lies in the Western part of Uttar Pradesh on the bank of River Yamuna. Though the wonderful allure of the Taj Mahal attracts people from around the world over to Agra, it is not a standalone attraction. The city offers a trail of fascinating tombs and mausoleums to explore. Acclaimed for its lavish crafts like Pietra Dura (marble inlay) work, rugs and leather goods, and the luscious Petha, Agra equally caters well to shopaholics and foodies.\n" +
                "\n"));
        modelList.add(new Model(R.drawable.amritsar,"Amritsar","Amritsar, literally a Pool of Nectar, derives its name from Amrit Sarovar, the holy tank that surrounds the splendid Golden Temple. Guru Ramdas, the fourth Guru of the Sikh faith, founded Amritsar in 1579. He constructed a pool on land gifted by the Mughal Emperor Akbar and called it Amritsar. One of the most pristine cities with Guru-vaani humming from the Gurudwaras, Amritsar is renowned world over for the Golden Temple, also known as Harmandir Sahib Gurudwara - the holiest Gurdwara. It’s at the end of a causeway, surrounded by the sacred Amrit Sarovar tank (lake), where pilgrims bathe. This place is also famous for its Jallianwala Bagh massacre and its proximity to Wagah Border. The Amritsari cuisine is also very famous. The satiating food and generous dollops of legendary Punjabi hospitality further connive to cast a spell upon the visitor. One of the most agriculturally productive cities of India, Amritsar is well connected with most of the important cities of India." +
                "Amritsar is a major commercial and cultural centre in the heart of Punjab. The city is the spiritual and cultural centre of the Sikh religion and is home to the Harmandir Sahib, also known as the Golden Temple. Respectfully marvel at the Indian and Pakistani soldiers who march-off nightly at the Wagha Border, and at the Jallian Wala Bagh the site of the 1919 Amritsar Massacre in 1919."));
        modelList.add(new Model(R.drawable.delhi,"Delhi","Delhi, India’s capital territory, is a massive metropolitan area in the country’s north.A symbol of the country’s rich past and thriving present, Delhi is a city where ancient and modern blend seamlessly together. It is a place that not only touches your pulse but even fastens it to a frenetic speed. Home to millions of dreams, the city takes on unprecedented responsibilities of realizing dreams bringing people closer and inspiring their thoughts.\n" +
                "Just a century ago, the British moved the seat of their empire from Kolkata to Delhi. And it has been the Capital of India ever since. Now a thriving, cosmopolitan metro, the city has much to celebrate as it has already reached the milestone of completing 100 years as a Capital. With a history that goes back many centuries, Delhi showcases an ancient culture and a rapidly modernising country. Dotted with monuments there is much to discover here. The seat of many powerful empires in the past, its long history can be traced in its many carefully-preserved monuments, ancient forts and tombs.\n" +
                "\n" +
                "All this is combined with the best features of a modern city such as a metro system, bustling markets and fabulous eating places. The past and the present meld seamlessly together, making centuries-old monuments a part of the city’s daily life. Delhi is very much a history’s child. The story of the city is as old as the epic Mahabharata, when the town was known as Indraprastha, where Pandavas used to live. Over the centuries, eight more cities came alive adjacent to Indraprastha: Lal Kot, Siri, Dinpanah, Quila Rai Pithora, Ferozabad, Jahanpanah, Tughlakabad and Shahjahanabad. Many empires rose to the heights of their power and were destroyed here. Among the prominent dynasties which made Delhi their capital were the Tughlaqs, the Khiljis and the Mughals.\n" +
                "\n" +
                " But the modern Delhi has a lot more to offer. Delhi has a modern, well-planned and extensive Metro network that connects all corners of Delhi; this network is still growing. New roadways and flyovershave improved connectivity, the latest of which is the Signature Bridge, an ambitious project of Delhi Tourism, which is under construction at Wazirabad – it promises to be a landmark. "));
        modelList.add(new Model(R.drawable.lucknow,"Lucknow","The capital of Uttar Pradesh, Lucknow has long been a seat of administration and culture. Second only to Delhi in importance in the region, and the seventh largest city in India, Lucknow is easily accessible from all major cities in the country. Its literacy rate is much higher than what it is in the rest of the state too. All this has ensured its prominence as a centre of business and industry, education and research as well as tourism.An historic city such as Lucknow can be expected to be littered with monuments and buildings. While many important building were destroyed and many more are past their best days, many remains reflect the city’s glory. Lucknow’s social and cultural milieu is such that history, art and culture are part of its everyday fabric and visitors can find many things that interest them.  Places of interest around Lucknow include Allahabad, Kanpur, Benaras, Faizabad, Ayodhya, Sravasti, Nawabganj and Dudhwa National Park."));
        modelList.add(new Model(R.drawable.dehradun,"Dehradun","Dehradun City is one of the oldest cities of India, bejeweled-like a glittering jewel in the lower Himalayan mountain ranges. The city is perched at an elevation of 435 meters and is currently enjoying its stature as the capital of Uttarakhand. \n" +
                "\n" +
                "Dehradun is the gateway to the famous hill station of Mussoorie and the pilgrimage spots of Haridwar and Rishikesh.  This city is famous for its weather, Dehradun climate remains salubrious throughout the yearDehradun City is one of the oldest cities of India, bejeweled-like a glittering jewel in the lower Himalayan mountain ranges. The city is perched at an elevation of 435 meters and is currently enjoying its stature as the capital of Uttarakhand. \n" +
                "\n" +
                "Dehradun is the gateway to the famous hill station of Mussoorie and the pilgrimage spots of Haridwar and Rishikesh.  This city is famous for its weather, Dehradun climate remains salubrious throughout the year"));

        //init the adapter with model list and context
        adapter = new CustomAdapter(modelList,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);

    }
}