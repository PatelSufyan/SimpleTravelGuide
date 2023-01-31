package com.example.whereto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class WestIndiaScreen extends AppCompatActivity {

    RecyclerView recycler;
    List<Model> modelList;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west_india_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        modelList = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList.add(new Model(R.drawable.gujarat,"Gujarat","There are many reasons why Gujarat finds a place among the top travel destinations in India. The places to visit in Gujarat include UNESCO sites, religious sites, wildlife sanctuaries with Asiatic lions, Jyotirlinga, Char Dham Temples, museums, the large white desert Rann of Kutch, Statue of Unity and Gandhian heritage sites. There are numerous opportunities for a sightseeing tour. The richness in history, heritage and culture will overwhelm you on your first visit!\n" +
                "\n" +
                "Gujarat borders Pakistan to the north-west, the Arabian Sea to the south-west, Rajasthan to the north, Maharashtra to the south, Madhya Pradesh to the east; Gujarat is the seventh largest state of India by area. The state is an electric mixture of different cultures and traditions, showcasing the traditions of the real India." +
                "Added to the already rich treasure of tourist attractions in Gujarat are newer ones which enrich Gujarat tourism. One of these is the Statue of Unity. At 597 feet, it's the world's largest statue. Some of the attractions surrounding the statue are butterfly garden, cactus garden, handicraft stores and mirror maze.\n" +
                "\n" +
                "Another one is the Sardar Patel Zoological Park, located just 3 kilometers from the Statue of Unity. It's popularly known as Jungle Safari Park. Unlike other parks, it's created in an open design. The park has animals which have been imported from across the world. There are more than 5 lakh plants in the zoo. The world's largest aviary is also found here. The aviary consists of around 500 birds belonging to 30 species. The birds are displayed in 2 sections: exotic and Indian.\n" +
                "\n" +
                "There are around 500 birds belonging to 30 species in the aviary, in addition to 30 types of plants and grass for their food. Orientations will also be provided to children and adults when they enter the aviary. There are 2 sections displaying the birds: exotic and Indian."));
        modelList.add(new Model(R.drawable.jaipur,"Jaipur","Also called the Pink City, Jaipur is the capital of the royal state of Rajasthan. Along with Delhi and Agra, Jaipur forms the Golden Triangle and hails as one of the most famous tourist circuits in the country.\n" +
                "\n" +
                "Rajputs ruled Jaipur for many centuries and developed as a planned city in the 17th century AD. With the old city surrounded by walls and gates decorated with drawings on the backdrop of a beautiful pink hue, Jaipur, the pink city, successfully retains its old-world charm. Home to a few UNESCO World Heritage sites, including Amer Fort and Jantar Mantar, Jaipur holds many magnificent forts, palaces, temples and museums and brims with bustling local bazaars where you can shop to your heart's content. The city is also very well known for its local food, and the most famous dishes include the Ghewar, Pyaaz Kachori and Dal Baati Churma. The city also hosts the Jaipur Literary Festival, which is Asia's biggest festival of its kind.\n" +
                "\n" +
                "One of the largest cities in India, Jaipur is also home to all the modern amenities with some of the most exotic hotels and resorts in the world. The city boasts an international airport and is also very well connected by rail and road. This makes Jaipur the gateway to Rajasthan - the starting point for places to visit in the interiors of the state. The metro, local buses, shared tuk-tuks, auto-rickshaws and taxi aggregator apps, including Uber and Ola, solve the commute problem in the city quite comfortably." +
                "There is a composite ticket for five of Jaipur's main attractions - Amber Fort, Albert Hall Museum, Jantar Mantar, Hawa Mahal and Nahargarh Fort. It costs INR 50 for Indians, INR 1000 for foreigners and INR 30 for foreign students. The ticket is valid for two days and can be bought from the ticket counter of any of the five monuments.\n" +
                "The Old City of Jaipur is often referred to as the Pink City. It encompasses the old walled city around Hawa Mahal with a six metres high boundary wall. There are seven different gates that provide access to the Old City. The major gates are  Chand Pol, Ajmeri Gate, and Sanganeri Gate. Hawa Mahal, Jantar Mantar, City Palace, Mubarak Mahal are some of the attractions located inside the Pink City. The vibrant bazaars of Jaipur like Bapu Bazaar and Johri Bazaar are also located here."));
        modelList.add(new Model(R.drawable.jodpur,"Jodpur","Jodhpur \"The Sun City\" was founded by Rao Jodha, a chief of the Rathore clan, in 1459. It is named after him only. Jodhpur in Rajasthan, India was previously known as Marwar. Jodhpur is the second largest city in Rajasthan. It is divided into two parts - the old city and the new city. The old city is separated by a10 km long wall surrounding it. Also it has eight Gates leading out of it. The new city is outside the walled city.\n" +
                "\n" +
                "Jodhpur is a very popular tourist destination. The landscape is scenic and mesmerizing. Jodhpur city has many beautiful palaces and forts such as Mehrangarh Fort, Jaswant Thada, Umaid Bhavan Palace and Rai ka Bag Palace. Other charms of Jodhpur include Government museum and it's beautiful Umed garden. The city is known as the \"Sun City\" because of its bright and sunny weather throughout the year. Read on for more Jodhpur information"));
        modelList.add(new Model(R.drawable.udaipur,"Udaipur","In the southernmost part of  Rajasthan, Udaipur is surrounded by the Aravalli Range and is brimming with natural beauty. It was set up in 1559 by Maharana Udai Singh II as the nascent capital of the Mewar Kingdom. Udaipur is well- connected with other parts of India through airway, railway and roadway.\n" +
                "\n" +
                "Unlike other parts of Rajasthan, Udaipur is filled with serenity. Away from the urban chaos, it is a blend of regal beauty, elevated slopes  and picturesque panorama. Udaipur is also known as the “City of Lakes” because of the presence of numerous interconnected natural lakes in and around the city. The “City of Lakes” is also profoundly called the “White City” because the Rajput style Palaces and Forts in Udaipur are made up of white marbles. Additionally, houses and other structures of the city are also dressed in white.\n" +
                "\n" +
                "Udaipur is famous for its historic Rajput-era forts, grand palaces, striking lakes, architectural temples, museums, galleries, traditional festivals and rich culture. The best places to visit in Udaipur which are must-have in your itinerary are Lake Pichola, City Palace, Eklingji Temple, Ambrai Ghat, Vintage Car Museum, Bada Mahal and Shilgram.\n" +
                "\n" +
                "People looking forward to doing thrilling things in Udaipur can happily indulge in Trekking, Paragliding, Cycling Tours and Helicopter Ride. Among passive activities, Sunset boat rides at Lake Pichola or Fateh Sagar Lake are excellent options to seek some solace. Others can go on a shopping spree at Shilpgram or Bada Bazaar or  Mochiwada Bazaar to hoard exquisite items like Bandhani sarees, handmade juttis, silver jewellery, bags and authentic Rajasthani handicrafts.\n" +
                "\n" +
                "The best time to visit Udaipur is between the months of November-February i.e. the winter months. During this time, the average temperature varies between 12°Celsius to 28 °Celsius. Since the climate of Udaipur remains pleasant during winters, travellers can explore the outdoors and participate in numerous activities without any inconvenience."));
        modelList.add(new Model(R.drawable.mumbai,"Mumbai","Mumbai, often referred as “the city of dreams” for all the right reasons, is a place that every traveller must visit. Mumbai presents a unique experience that is unmatched to any other destination. Capital city of Maharashtra state, Mumbai is the city of aspirations, power, wealth, glamour and nightlife along with stretches of shimmering beaches, caves, magnificent architecture, religious sites and a mouth-watering cuisine. With all this exciting and varied recreational opportunities Mumbai tourism offers a wholesome holiday experience.\n" +
                "\n" +
                "From the financial capital to entertainment centre of the country, Mumbai city has almost everything to make a holiday memorable. From elders to youngsters, this city offers suitable holidaying choices to everyone. Whether you are looking for a luxurious family holiday, adventure holiday with your friends, or a budget tour, you will find a variety of options suiting you in Mumbai.One of the most prominent parts of Mumbai Tourism is the list of sightseeing places that are worth visiting. There are many amazing places to visit in Mumbai that will make your tour enjoyable. From lakes, beaches, caves to temples and churches to historical buildings, art galleries, shopping hubs to entertainment parks, you will get ample of choices on your Mumbai tour.\n" +
                "\n" +
                "Some of the popular sightseeing places in Mumbai are Gateway of India, Elephanta Caves, Marine Drive, Haji Ali Dargah, Bandra-Worli Sea Link, Shree Siddhivinayak Temple, Juhu beach, Mount Mary Church, Taj Mahal Palace Hotel, Nariman Point, Kanheri Caves, Chhatrapati Shivaji Terminus, Mumbai Film City/Dadasaheb Phalke Chitranagri, Asiatic Society and many more. Places like Nehru Planetarium, Essel World and Taraporevala Aquarium are ideal for a visit with children. For shopping lovers, Colaba Causeway, Girgaon Chowpatty and Chor Bazaar are a few places to must visit."));
        modelList.add(new Model(R.drawable.goa,"Goa","Lying on the western coast, Goa is India's smallest state and unlike any other, known for its endless beaches, stellar nightlife, eclectic seafood, world-heritage listed architecture. Spread across just 3,702 km, Goa lies in the Konkan region. It is a far cry from the hippie haven or a beach getaway, and one of the only few destinations that is open 24x7. The laid-backness (susegad) of Goa attracts as many international tourists as it does Indians, or even more so.\n" +
                "\n" +
                "The Goans are quite friendly towards tourists and celebrate many festivals throughout the year, the most famous being the New Year and Goa Carnival. While the seafood is excellent, Goa has one of the best nightlife in India with trendy bars, beach shacks, elegant cafes and many clubs and discotheques. Thanks to lower alcohol prices in the state, Goa is also great for younger tourists with relatively tighter pockets.\n" +
                "\n" +
                "For those of us perpetually confused between North Goa and South Goa, this might help - the state of Goa is divided into North Goa and South Goa. While North Goa is the nightlife hub where all the touristy beaches, flea markets, and beach shacks are located, South Goa is the land of luxurious resorts and laid-back beach vibes. \n" +
                "\n" +
                "Having been a Portuguese territory for almost 450 years, the Portuguese architecture is nowhere as prevalent as in Goa - visit one of the many whitewashed churches, crumbling forts or spectacular churches. The yellow houses with purple doors, ochre coloured mansions and oyester shell windows is what completes the kalieodscope of Goan architecture.\n" +
                "\n" +
                "Panjim, the capital city located in the centre overlooks the calm Mandovi River where the famous floating casinos of Goa are docked. The centre is well-connected with an international airport and roads and trains run from North to South part of Goa. With a coastline stretching for over 100 kilometres, Goa has stunning beaches. While Baga and Calangute are more popular among the Indian family crowd, Anjuna and Arambol draw a lot of foreign tourists. The beaches in South Goa are relatively lesser explored, but some of them like Agonda and Palolem are more beautiful."));
        modelList.add(new Model(R.drawable.dadra,"Dadra & Nagar ","A perfect serene and sylvan land, Dadra and Nagar is a tourist destination to spend a perfect vacation with family and friends. The delightful place let the tourists experience nature at its best with lush green forests, massive waterfronts, meandering rivers, a variety of flora and fauna. Besides this, tourists will even get the opportunity to experience fine Portuguese architecture and tribal culture of Silvassa- the capital of Dadra and Nagar Haveli. Being a perfect place for both native and travellers, Dadra and Nagar Haveli beckons a travel experience unlike any other. For tourists planning to visit this amazing holiday destination, the travel guide will let one know what all is to be covered when spending a peaceful and calm vacation in Dadra and Nagar Haveli." +
                "Coming to the tourist attractions of Dadra and Nagar Haveli, the first and foremost things that grabs the attention of the tourists is the Portuguese architecture all around the region.  Of many the important ones where you can admire the splendid architecture of Dadra and Nagar Haveli is the Roman Catholic Church - the Church of Our Lady of Piety and the Hindu temples including Bindrabin temple and Swaminarayan Temple. As you stroll in Silvassa, you will also get the opportunity to visit the Tribal Cultural Museum which houses an interesting collection of musical apparatus, masks, life-size statues, fishing gadgets and more. Besides this Dadra and Nagar Haveli has a lot to offer to the nature lovers where one can sit and relax amid serene landscape comprising lush green hills, rolling meadows and native-styled cottages. Vanganga Lake Garden, Hirwa Van Garden, Vandhara Udyan, and Dudhni where the large waterfront of river Damanganga offers an amazing view of the Madhuban Dam are some points of interests where tourists can head to for witnessing the nature at its best. Also, one can even visit Hirwa Van to witness cascading waterfalls and extensive lawns interspersed with a variety of flowers. Wildlife enthusiasts can head to a mini zoo in Silvassa where one can spot birds, monkeys, pythons and crocodiles. Tourists can even opt for Vasona Lion Safari. Last but not the least, another destination worth a mention is the Union Territory is the Satmaliya Deer Park, which houses several deer species and other animals."));


        //init the adapter with model list and context
        adapter = new CustomAdapter(modelList,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);


    }
}