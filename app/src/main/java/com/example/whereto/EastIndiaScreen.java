package com.example.whereto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class EastIndiaScreen extends AppCompatActivity {

    RecyclerView recycler;
    List<Model> modelList;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_india_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        modelList = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList.add(new Model(R.drawable.kolkatta,"Kolkata","Kolkata, or Calcutta as it was formerly called, is the present capital of the eastern state of West Bengal and one of the most densely populated cities in India. Kolkata became a British trading post in the last part of the 17th Century. " +
                "The city that once served as the showpiece capital of the British power in India is noted for its colonial buildings including the grand Victoria Memorial. " +
                "Other important sights include the Howrah Bridge, an engineering marvel that links the city and Howrah Station, and the Indian Museum. Gateway to eastern India and home to prominent intellectuals, the city is known for its easy pace and intellectual prowess.\n" +
                "Victoria Memorial, Howrah Bridge, Botanical Garden, New Town Eco Park, Nicco Park, Mother Teressa House, Fort William, Tagore’s House (Joransanko Thakur Bari), Marble Palace, Dakshineswar Kali Temple, Alipore Zoological Gardens, Kalighat Kali Temple, and many more.\n" +
                "\n" +
                "Are you planning to visit Kolkata shortly and want to know about all the places to visit in Kolkata? This former British Capital boasts an exemplifying past, which is reflected in its structural marvels. From Victoria Memorial to Fort William, all these ancient structures reflect intricate artistry. Needless to say, the city actually boasts a number of ancient monuments like Victoria Memorial and Fort William thus being a must visit place for history buffs.\n" +
                "\n" +
                "Tourist attractions in Kolkata does not just limit itself to historical monuments only as this place also has amusement parks such as NIcco Park that are meant for families, and groups to enjoy. If you feel that the heat of the city is too much for you to take, consider visiting this amusement/water park to release the heat.\n" +
                "\n" +
                "For those looking for some inner peace, Kolkata has something for you too. Visit Belur Math, a place which looks like a Mosque, a temple and a church all at once. End your visit by having a mouth watering traditional Kolkatan meal in the lavish restaurants of Elliot Parks and don't forget to have some Sondesh and Rasgullas."));
        modelList.add(new Model(R.drawable.darjeeling,"Darjeeling","Darjeeling, nestled among rolling mountains, is a perfect destination for outdoor enthusiasts. Popular places to visit include Tiger Hill, Batasia Loop and the War Memorial, and the Himalayan Zoological Park and Snow Leopard Breeding Center. What should you bring home? Tea, tea, and more tea—and beautiful local handicrafts.\n" +
                "On a summer day, the fragrance of tea leaves lifts off the hills and hover over Darjeeling like a hat and the wonderful things breathes unsaid inside that, like the bent trees, the happy earthworms, the reluctant tea-colored puddles, flowering Rhododendrons and Magnolia plants and the wild garden flowers blooming in different colors of rainbow and a British bungalow growing a fragile façade of greenery for ages amidst a sprawling tea garden. The tourist places in Darjeeling will leave a traveler mesmerized and awed with the beauty that the place offers.\n" +
                "\n" +
                "And when the heavens’ open up to hammer the water down, the grass looks wet-green and pleased, loose earth shapes off its edges, the washed off dust-green trees smiles afresh and the green countryside glitters in the traces of sunshine.Covered with the dense evergreen forests of Sal and Oak, with ducks and teals creating waves in water, and with rare breeds of orchid spreading colors on a moist soil, Darjeeling, a previous summer capital of India under the British Raj holds the incredible panoramic views of Kanchenjunga snow peaks, beautiful colonial architecture including mansions and churches, an influence of diverse cultures in the majestic craft and cuisine, a beautiful women, the taker of the seeds with a yellow scarf on her head and tea-bag on her shoulders, and a vast expanse of Tea estates in its root.\n" +
                "\n" +
                "This “Mecca of Tea” with over 80 operational tea gardens spread across acres of land, writes on a foggy day sitting inside a vintage Toy Train from 1880s, a whimsical poem, of what is delightfully read as the \"Champagne of tea\". The northwest winds visit Darjeeling to tear it full of holes but the new beautiful things come in the first spit of spring on the northwest wind, and the old leaves go, not one lasts but the beauty stays with the new and lasts for eternity. Darjeeling is a beauty that won’t let your heart stop, from beating in ecstasy, and the tourist places in Darjeeling shall always ensure that!"));
        modelList.add(new Model(R.drawable.shimla,"Shimla","Snow-capped Himalayan peaks and green pastures surround Shimla, the capital of Himachal Pradesh. Enjoy a heritage walk through Shimla’s Victorian-era architecture, labyrinthine bazaars and lengthy pedestrian shopping mall. Don’t cause too much trouble taking in the town from Scandal Point, a large, open square; keep in mind that Shimla was a retreat destination for Mahatma Gandhi, who frequented a Georgian mansion in Shimla’s suburbs from the mid-1930s to '40s.\n" +
                "Among the most popular hill stations in India, Shimla holds a distinct place owing to its unique charm. Located at a distance of 342 km from the national capital, Delhi, Shimla is a great choice for a weekend getaway from Delhi and Chandigarh since there are so many places to visit in Shimla. Shimla is the capital city of Himachal Pradesh, and all it possesses and all it offers helps it easily justify its reputation and position as the capital city of a beautiful state, widely known for adventure activities and natural wonders. Laden with beautiful, dense forests of Pine, Oak, and Deodar, Shimla is refreshing in its very existence. \n" +
                "\n" +
                "The picturesqueness of this beautiful hill station makes it an apt destination for photographers looking for perfect frames and nature enthusiasts who want explore the nature in its pristine form. It is quite interesting that despite being home to a large population, the biosphere of Shimla is still in an excellent form. Shimla exhibits a very relaxing mood to those who visit it in search of tranquility.\n" +
                "\n" +
                "Due to the plenty of activity options available here, Shimla is emerging as a popular destination for offbeat travel as well. People from all over India and beyond visit Shimla to experience an adventure which makes it a major hotspot for adventure activities in northern India. It is also home to some beautiful places with spectacular views, and some truly magnificent specimens of architecture can be found in Shimla.\n" +
                "\n" +
                "Shimla houses some beautiful Hindu temples, located at apt locations, offering spectacular views of the beautiful hill station and the nearby hills with a thick covering of green forests. Some of the most revered temples in Shimla are Jakhoo Temple, Tara Devi Temple, Mansa Devi Temple, etc. These temples are located at short distances from the city center, so if you prefer, you can trek up to these temples through the woods. Shimla has a plethora of interesting places to visit and explore. As Shimla once served as the Summer Capital of British India, some captivating buildings with brilliant neo-Gothic architecture exist here.\n" +
                "\n" +
                "Some of the most remarkable ones among those are the Institute of Advance Learning, Gorton Castle, Bantony Castle, and Christ Church. You can spend an evening shopping from the Mall Road and enjoying some interesting cultural activities on the Ridge. Splendid views of the city can be enjoyed and captured in your camera from the Ridge after sunset. Shimla also has also some interesting places in store for wildlife lovers. Himalayan Bird Park is a delight for wildlife lovers, exhibiting some exotic and native unique bird species. Another great option for nature lovers and photographers in Shimla is Shimla Reserve Forest Sanctuary.\n" +
                "\n" +
                "Shimla is not the kind of place that would ever let you feel bored while you are there since there are many interesting things to do in Shimla. Small things feel extraordinary in its beautiful setting. Be it a lazy walk on the Mall Road or shopping low-cost wooden articles and woolen clothes from Lakkar Bazar; be it picking one of the many restaurants serving toothsome food or trying pastries at bakery shops on the Mall Road, everything has a ‘feel good’ factor about it here. Moreover, the popularity of Shimla as a travel destination for an offbeat experience is on the rise. Earlier, Shimla was more popular among people travelling with families as a summer getaway, but with the popularisation of adventure activities, it is earning a reputation among adventure lovers.\n" +
                "\n" +
                "Due to its proximity from major cities like Delhi and Chandigarh, people from these cities prefer to travel to Shimla to indulge into adventure activities over travelling to destinations farther than it. Among the most popular activities in Shimla are camping, trekking, ice skating, paragliding, river rafting and heli skiing. If you want to experience light and easy activities in Shimla, there are some nice easy trek options here that take you to amazing spots through lush green Pine and Oak forests. And, if you crave thrill, Shimla is surrounded by some prominent Himalayan mountain ranges which is the reason why there are some breathtaking trails for trekking in and around Shimla. You can also experience the unique fun of ice skating here. Mountain biking can also be enjoyed in Shimla if you are up for something different.\n" +
                "\n" +
                "Being the capital city of Himachal, there are abundant stay options in Shimla. You can find a good accommodation at a ridiculously low price and you can also find luxury hotels and resorts at scenic locations. Furthermore, there are some excellent campsites in Shimla where you can enjoy camping in the woods under a beautiful starlit sky. So, it does not matter whether you are a budget traveller or you prefer extravaganza; if you want to just relax in a comfortable accommodation laced with all modern amenities or you want an outdoor camping experience, Shimla has the most appropriate options to offer.\n" +
                "\n" +
                "Shimla looks beautiful during all the seasons and can be visited during any time of the year. However, if you are interested in indulging in activities like camping, trekking and rafting in Shimla, the best time to visit is between March to June when the climate is pleasant. Most tourists visit Shimla during summer to find refuge in the cold hills of Shimla. But, visiting Shimla during winters is altogether a different experience. It is an ideal destination to spend a cold, lazy vacation at. If you get lucky, you may get to witness snowfall here between December to February, which is an experience, the memories of which you will always want to keep intact.\n" +
                "\n"));
        modelList.add(new Model(R.drawable.cherrapunji,"Cherrapunji","Cherrapunji in Meghalaya is one of the wettest places on the planet and the only place in India to receive rain throughout the year. The town of Cherrapunji is nestled in the East Khasi Hills about 50 km southwest of the state’s capital, Shillong. Cherrapunji, also known as Sohra or Churra, means ‘the land of oranges’. The cliffs of Cherrapunji also offer stunning views of the plains of Bangladesh. " +
                "Spread out along the razor sharp ridges of a gigantic mountain wall, Cherrapunjee sits neatly on the edge of the Himalayas towering the pancake low lying plains of Bangladesh. This alluring village was once regarded as the wettest place on the earth given the massive monsoon rainfall that it sees. Road leading from Shillong to this miniscule village passes through the magnificent scenery that become sensational at the Dympep viewpoint. Here you’ll come across a photogenic V shaped valley that deeply slits into the plateau.  \n" +
                "\n" +
                "The lush green surroundings of Cherrapunjee very well justifies the Meghalaya’s over-used ‘Scotland of the East’ tag. Nohkalikai Falls here are particularly dramatic especially during the monsoon season when they are brimming with a quantity which is 20 times more than the original. These can be seen from the viewpoint that is located on a plateau that lies at the edge of the 4.4 km mountain ride from the Sohra market. You can hire a local taxi here that will shuttle you to the view point. More significant than this is the series of the ‘Grand Canyon’ gorges that are located around the region that further descends into the green chasms of the tropical forests.\n" +
                "\n"));
        modelList.add(new Model(R.drawable.andamannicobar,"Andaman and Nicobar ","Andaman and Nicobar Islands featuring palm-fringed beaches with spotless stretches of white sands, an uninterrupted presence of peace, and crystal clear turquoise waters all around - Andaman is a true example of what you call 'Tropical Paradise'.\n" +
                "\n" +
                "Andaman and Nicobar is an Indian archipelago located in the Bay of Bengal, claiming a large group of nearly 300 islands. While some of these islands have been commercialized and developed as tourism hubs, the rest are uninhabited, away from human interference and exemplify virgin nature." +
                "If you think the Andaman and Nicobar is all about relaxing on sandy beaches, basking in luxury resorts, and enjoying the beautiful scenery, you're under a wrong impression. There's a wild side to the place which makes it a fairly popular destination for adventure tourism as well. Welcoming thousands of adventurists from various parts of the globe every year, Andaman and Nicobar is also widely acclaimed for the range of water sports that are available here. The spectrum of water sports in Andaman covers numerous different kinds of experiences. From easy activities like beach strolling, swimming, and cruising to exhilarating experiences like speed boating, parasailing, and scuba diving, a wide range awaits you in Andaman. So, if you are one of those travellers who cannot be content with relaxation for long, you always have an option in Andaman to unleash the daredevil in you and feed it with stimulating action."));
        modelList.add(new Model(R.drawable.asam,"Assam","The multitude of places to visit in Assam warmly welcome nature lovers as well as wanderlust travellers to marvel at the wonders of the Northeast. One of the most renowned places is the Kaziranga National Park that displays the abundance of wildlife and flora in the region. Meanwhile, Guwahati is the largest city and a gateway to the urban lifestyle experience with its lively cafes, restaurants and other social outlets.\n" +
                "\n" +
                "Moreover, there are still many places to see in Assam that let you see the beautiful heritage and sheer beauty like the Rock Cut Caves in Bongaigaon which is known for fine specimens of five rock-cut structures, Da-Parbatia Temple known for the exquisite carvings and patterns, Kachari Fort for its picturesque glory, among many others.\n" +
                "\n" +
                "Not just that, if you are interested in the adventure aspect of holidays, then you are in luck as there are several places in Assam where you can take part in activities. Starting with Rock Climbing At Assam State Zoo, Water Rappelling at the stunning waterfalls that are scattered all around Assam, White Water Rafting At Bogamati and other rivers that flow in the state, treks and hikes through the hilly and forested terrains etc. Now, all these places not only promise to offer you a wonderful touring experience but also give you loads of memories to cherish all through your life."));


        //init the adapter with model list and context
        adapter = new CustomAdapter(modelList,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);

    }
}