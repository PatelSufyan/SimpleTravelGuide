package com.example.whereto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HotelScreen extends AppCompatActivity {


    RecyclerView recycler;
    List<Model> modelList;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_screen);



        modelList = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList.add(new Model(R.drawable.jummu,"Jammu and Kahmir Hotels ","Clarks Inn Express\n" +
                "Couple Friendly\n" +
                "Vc Tower,Nh-44,Main Highway Road,Bari Brahmana, Jammu-181133" +
                "Capital O 11567 Hotel Shivalik Hills\n" +
                "106, Near Outer Gate Railway Station, Trikuta Nagar, Jammu - 180001" +
                "Capital O 11567 Hotel Shivalik Hills\n" +
                "106, Near Outer Gate Railway Station, Trikuta Nagar, Jammu - 180001\n" +
                "Le ROI, Jammu@ Tawi Railway Station\n" +
                "Multi-Functional Complex,within 10 meter radius opposite to Tawi RailwayStation,Jammu 180001"));
        modelList.add(new Model(R.drawable.srinagar,"Srinagar Hotels","Fortune Resort Heevan - Member ITC'S Hotel Group\n" +
                "Gupta Ganga Ishber Nishat, Dal Lake, Srinagar, India, 191121 " +
                "Batra Hotel and Residences\n" +
                "Durganag Mandir, Dal Gate Srinagar Kashmir, Dal Lake, Srinagar, India, 190001 " +
                "Radisson Srinagar\n" +
                "11, Maulana Azad Road, Dal Lake, Srinagar, India, 190001" +
                "Hillscape Inn\n" +
                "44 Dewan Bagh,Nishat, Dal Lake, Srinagar, India, 191121 "));
        modelList.add(new Model(R.drawable.agra,"Agra Hotels","Dayal Lodge - A Boutique Hotel (Comfortable & fully featured budget accommodation in Dayalbagh, Agra, India), 25 - New Agra, Dayalbagh Road, Agra - 5 (Near Bhagwan Talkis Crossing, Towards Dayalbagh), ☎ +91-9219606365, 9359848731 (book@dayallodge.com), [19]. checkout: 11:00. \"Best Family Hotel in Dayalbagh Area, Hotel Near Taj Mahal, Agra, Rated above 4 Stars across hotel review platforms Rs. 950.00\n" +
                "" +
                "Hotel Raj, 2/26, South Gate Taj Mahal, Tajganj, Agra, India (almost at the end of the little alley that ends on Taj Mahal South Gate), ☎ +91 9627743662, 9627401177, 5622330079, [22]. checkout: 13:00. One of the cheapest places in Tajganj, simple rooms, but great attention by the host; they also have a great restaurant, excellent food and good prices. Double ₹400 (march 2015).\n" +
                "" +
                "Hotel Kamal, (by the south gate of the Taj Mahal), ☎ 0091-562-2330126 (hotelkamal@hotmail.com). Around ₹300-850\n" +
                "" +
                "Hotel Amba Inn, 1/51, Delhi Gate, Near Raja ki Mandi Railway Station (2 mins from railway station), ☎ 91 562 2520779, 91 9412720194, [24]. checkout: noon. Offers facilities for 22 rooms in total. There are both double rooms, single rooms, as well as facility for an extra bed. All the rooms are air conditioned/air cooled, with television. Single ₹550-800, double ₹650-900\n"));
        modelList.add(new Model(R.drawable.amritsar,"Amritsar Hotels","Asha Guesthouse, Near Golden Temple, Sarai Guru Ramdas Ji (less than 5 minute walk from Golden Temple), ☎ +91-183-2293031. Clean, friendly reception, hot water. No wi-fi in room but available at reception. Very close to Golden Temple and the taxi stand where you can get a shared jeep to the Wagah border. double Rs. 500.\n" +
                "" +
                "Hotel Sita Continental, Sheran Wala Gate (10 minutes walk from Golden Temple), ☎ +91-183-5002840. Its basic, new and clean. double Rs. 550-650\n" +
                "" +
                "Mrs. Bhandari's Guest House, [12], No. 10, Cantonment phone=\"+91 183 2 222390, Rs. 2000-3500, Very neat and clean rooms\n" +
                "" +
                "Hotel le golden [13] very near to the golden temple having view of golden temple from room & restaurant.Rs.1550. to 5250.\n"));
        modelList.add(new Model(R.drawable.delhi,"Delhi Hotels","Delhi Hotel, C23 Greater Kailash 2, [37]. Boutique hotel with affordable, neat, clean & hygienic rooms.  edit\n" +
                "Durga International, 8715, D.B. Gupta Rd (500m from New Delhi Railway Station), ☎ +91 98 9942 3411, [38]. Basic hotel. Single: From ₹1,900; Double: From ₹2,100; Family Suite:₹4,500; Honeymoon Suite: ₹6,500.  edit\n" +
                "Ginger Delhi (Rail Yatri Nivas), IRCTC- Rail Yatri Niwas, New Delhi Railway Station, Bhav Bhutti Marg (opposite New Delhi Railway Station or take Rail Yatri Nivas exit from New Delhi Metro station), [39]. Run by Tata group, known for clean and cost effective no-frills budget hotels ₹1,500-1,800.  edit\n" +
                "Hare Rama Guest House, 298 Main Bazaar (Down the side road near the Khanna Cinema), ☎ +91 11 2743 3017. Popular hotel and place to book sleeper buses if you're heading to Dharamsala or Pushkar. They're very laid back staff which makes a nice change. 24 hour hot water and check in, and 24 hours stay from when you arrived. ₹400 single, ₹500 double for an ok Non-air-con room. Add 50% for air-con.  edit\n" +
                "Metropolis Tourist Home, 1634 Bazaar Hand, ☎ +91 11 2351 8074, [40]. More expensive than the average Paharaganj hotel. It also has a good restaurant. Double: ₹2,500-3,500.  edit\n" +
                "Hotel Namaskar, 917 Chandiwalan, Main Bazaar, Paharganj (located down a side alley), ☎ +91 11 2358 3456, +91 11 6526 3010 , +91 11 2358 2233 (hotelnamaskar@hotmail.com), [41]. Only 5 min from the train station. Be prepared for a somewhat gloomy hotel, with possibly cock roaches in the rooms. No sheets or towels. Primary school right next to the hotel makes sleeping past 8AM nearly impossible. Double Room: ₹400-650. Breakfast not included\n"));

        modelList.add(new Model(R.drawable.lucknow,"Lucknow Hotels","Hotel Buddha Residency Hotel Buddha Residency situated only Approx. distance from all prime locations from Charbag 1.5 KM, Hazratganj 1KM, Vidhan Sabha 0.5 KM, Kaisarbagh 2.5 KM, Airport 11 KM , guests are well located to enjoy the town's attractions and activities. PH.05222235555,Mo.+91-8948199993,9670556644.\n" +
                "New Sharma Hotel Opposite charbagh railway station. There are two Sharma Hotels there, One is 30 years old. ph 0522-2635901,2630544,4045586\n" +
                "Sharma Hotel Opposite charbagh railway station. Contact person Shujat Hashmi, Mob:9369266335\n" +
                "Hotel Mansi Ganga near charbagh railway station ph 0522-2630513,2637841\n" +
                "Hotel Manglam, [7]. Close to Aminabad. It is close to Husainabad Clock Tower, and Nawabganj Bird Sanctuary (not close to any of those, by Lko's distant standards Rates start at India Rupees 1,290.00.  edit\n" +
                "Lucknow Homestay [9]110D Mall Avenue. Has WiFi, home cooked meals and boasts of space. Just off The Mall. The hosts are super friendly and a mine of information."));
        modelList.add(new Model(R.drawable.dehradun,"Dehradun Hotels","Hotel Doon Castle, Patel nagar, niranjanpur, opp.telephone exchange, saharanpur road. Tel:+91 135 2626166, 2726166 www.hoteldooncastle.com.\n" +
                "Motel Kwality, 19, Rajpur Road. Tel:+91 135 657-001 - clean, but with basic facilities.\n" +
                "Hotel Ambassador, Windlass Shopping Centre, Rajpur Road. Tel: +91 135 655-831, 655-832 - very good location, well-designed rooms.\n" +
                "Hotel Deep Shikha , 57/2 Rajpur road, Dehra dun Tel: +91 135 2659889, 2659888- Very good location-mussoorie road opp secretrait\n" +
                "Hotel Viceroy Inn, N.H.-72, Saharanpur Road, Niranjanpur, 391/1, ☎ 0135-2729995, [8]. on main Dehradun-Saharanpur Road. Has decorated rooms, suites with Wifi, a big conference hall, a wedding hall, etc.  edit\n" +
                "Central Hotel Dehradun, Opposite Gandhi Park, Rajpur Road,Dehradun Tel: 7520631333 centrally located.\n" +
                "Mid range\n"));
        modelList.add(new Model(R.drawable.bangalore,"Bengaluru Hotels ","Hotel Rest Inn, #26, Rest House Road, Off Brigade Road, ☎ +91 080 40390390, [35]. checkin: 12 noon; checkout: 12 noon. Good Quality Budget Hotel Rooms in the heart of the city. This Hotel has an in-house restaurant as well and is walkable distance from Brigade Road and MG Road. Amenities on offer are Television, Mini Fridge, Wi-fi Connectivity, Room service, Travel Desk, Conference Hall, 24 hrs Hot water, Independent Air Conditioning and Coffee Maker. Single Rs 2,200 double Rs 2,600\n" +
                "" +
                "Church Street Inn, 46-1-1, Church St, [36]. Clean rooms, clean attached bathrooms, wifi internet access, Complementary continental breakfast, Walking distance from MG Road, Brigade Road and restaurants. Bookshop in lobby area [37]. 6 fully furnished rooms, all A/C, direct dial from rooms, free wifi, cableTV, including HBO and ESPN, free in house library. Offices open 24 hr. Single Rs 1,864 double Rs 1,800\n" +
                "" +
                "Royal Regency Lodge, S. C. Rd (next to Movieland theater), ☎ +91 80 4113 0202 [138]. Clean rooms and convenient to the city’s local transports like the City bus station and the City Railway Station.\n" +
                "" +
                "UG Deluxe, Majestic, Thulsi Thotta, (stop near the small road opposite Upparpet Police station and next to Navruchi restaurant, then take right and then immediate left on a small lane and at the end of it take right and you will see the lodge on your right). You may want to take an auto instead of walking down if you are going after a rainy day as your shoes will get dirty. Non-A/C rooms cost around Rs 550 (approx US$13), A/C rooms may cost an extra Rs 200 (US$5).\n" +
                "" +
                "Citizen Lodge, (about 1 km from MG Rd). Bare bones motel-style establishment is well located but leaves much to be desired in terms of cleanliness and overall quality. Double non-A/C room costs around Rs 800\n"));
        modelList.add(new Model(R.drawable.chennai,"Chennai Hotels","roadlands lodging house, 18, Vallaba Agraharam St, SVM Nagar, Ellis Puram, Padupakkam, Triplicane, Chennai, Tamil Nadu 600005 (Star Theatre), ☎ +91 4428548131 (broadlandshotel@yahoo.com). Traveller's institution which is very popular with the backpacker crowd, leafy courtyard, a rustic feel to the whole hotel, good rooms are situated to the back of the hotel and one of the most recommended rooms are roof cottages. Great place to get over your jet-lag and to get \"acclimatized to Iindia\". Walking distance from the beach and 10 minute rickshaw ride\n" +
                "" +
                "hennai Gate Hotel, 37, 39, 41, Old No 17 & 18, New, Gandhi Irwin Rd, Egmore, Chennai, Tamil Nadu 600008, ☎ +91 44 2819 4377\n" +
                "" +
                "Karpagam International Hotel, 41, S Mada St, Mylapore, Sankarapuram, Alamelu Manga Puram, Chennai, Tamil Nadu 600004, ☎ +91 4424959984,\n" +
                "" +
                "New Woodlands Hotel, 72-75, Dr Radha Krishnan Salai, CIT Colony, Mylapore, Chennai, Tamil Nadu 600004, ☎ +91 4428113111, [91]. It is sometimes crowded. There is a nice quiet art gallery and cafe nearby, the ashvitha cafe. Recommended for those who want to slow down and soak in the pace of life in Chennai. Theaters and shopping arcades are close by.  edit\n" +
                "Regent Hotel, 11, Kennet Ln, Egmore, Chennai, Tamil Nadu 600008, ☎ +91 442819180\n2"
                +
                "" +
                "Chennai Gate Hotel, 37, 39, 41, Old No 17 & 18, New, Gandhi Irwin Rd, Egmore, Chennai, Tamil Nadu 600008, ☎ +91 44 2819 4377\n"));

        modelList.add(new Model(R.drawable.hyderabad,"Hyderabad Hotels","Aahwaanam, NTR Estate, Jawaharlal Nehru Road Abids (Opp. Ramakrishna Cinema Hall), ☎ +91 40 2474 0301, +91 40 2474 0305, +91 92 9133 3108. checkin: 24 hr; checkout: 24 hr. Basic budget hotel. Most rooms are not A/C. Rs 600-1,000. \n" +
                "" +
                "Ashoka, 6-1-70, Lakdi-ka-Pul, ☎ +91 40 2323 0105, +91 40 6651 0222, +91 40 3062 0222, +91 40 6651 0220. A/C and non-A/C rooms. Rs 600-1,500\n" +
                "" +
                "Dwaraka Heritage, 116, Chenoy Trade Centre, Parklane, Secunderabad, ☎ +91 40 27845020, +91 40 2789 5111. 50 rooms, basic facilities, internet Rs 600-1,100\n" +
                "" +
                "Haridwar, 4-6-464, Esamiya Bazar, Koti, ☎ +91 40 2465 6711 +91 40 2473 2780, [51]. checkin: 24hr; checkout: 24 hr. Basic functional hotel with attached vegetarian restaurant. Caters mainly to visitors from North India. Rs 300-900.\n" +
                "itara Paradise, No. 6-3-788/34, Opp. Lane of Chandana Bros, Ameerpet, ☎ +91 40 2373 5222, +91 40 2373 5333, +91 40 6684 4449, [53]. Small hotel, bang in the middle of the Ameerpet shopping district. Don't expect a quiet stay, but the rooms are spacious and elegant. This hotel is geared more towards weddings and celebrations, not for business travellers or tourists. Rs 1,100-1,500.\n"));
        modelList.add(new Model(R.drawable.kochi,"Kochi"," Casa Linda Ballard, St.Paul's Street (Near St.Paul's School), ☎ +91 484 2216888. A well maintained hotel in typical European style. Budget\n." +
                "" +
                "Hotel Fort Avenue, Bazaar Street (Near old Bazaar), ☎ +91 484 2226103. A well maintained hotel. Budget\n" +
                "" +
                "Vintage Inn, Rids Dale Branch Road, Njaliparambu Jn., (near K.B. Jacob Rd, traffic circle), ☎ +91 484 2215064, [24]. Clean, comfortable ensuite rooms, fan or A/C, free WiFi in the lobby, 5 min walk from historic centre. from Rs 300 (off season)\n." +
                "" +
                "Banana Hut Hotel, Main Ferry Rd (On the left 150m to the Chinese Fishing nets from the main Ferry Station). Basic rooms, but cheap and kind hosts. Leaving your bag there during the day is possible and was safe. from Rs 300 (off season)\n"));
        modelList.add(new Model(R.drawable.mysore,"Mysore","Mannars Residency [11] (formerly known as MTR Residency), Opp to more mega store, Narayan Shastry Road,Mysore-570001, Tel: 0821-2424040, 0821-4242424, +91-9886660803.\n" +
                "" +
                "Mannars Yatrinivas [12] (formerly known as MTR Yatrinivas), Chandrahupta Road,near sangam theatre, Halladakeri, Mysore-570001, Tel: 0821-2521148,+91-821-4269105,+919886660803.\n" +
                "" +
                "Mannars Deluxe [14] (formerly known as MTR Deluxe),Near Sangam Theatre, Halladakeri, Mysore-570001, Tel: Tel: 0821-2448344,0821-2443207, +919886660803.\n" +
                "" +
                "Hotel Ritz, B N Road, Mysore – 570 001, Tel : 0821-2422668, 2429082, What this small, colonial-era four-room hotel lacks in cleanliness and upkeep, it makes up in charm and friendly staff. The front desk will help you book further travel, such as buses to Ooty.\n" +
                "" +
                "Hotel Roopa [15], Very close to Mysore Palace. B.N. Road, Mysore – 570 001, Tel : 0821-2443770.\n"));
        modelList.add(new Model(R.drawable.ooty,"Ooty Hotels","Sterling Ooty Elk Hill (A Sterling Hoiday Resort), No 25, Ramakrishna Mutt Road, R.K.Puram, ☎ 0423 2452634, [10]. checkin: 12:00; checkout: 10:00. Amid lofty Nilgiri peaks and low passing clouds, the sloping roofs and terracotta tiles of Sterling Holidays Elk Hill Resort emerge and vanish. As you look out on Ooty valley from your room’s balcony or sit-out, time seems to stand still. 3000 to 4000 \n" +
                "" +
                "Hotel Sinclair, Gorishola Road, ☎ +91-0423-2444309 (ooty@sinclairshotels.com, fax: +91-0423-2444229), [8]. Great view of Ooty and surrounding hills. 5 minutes drive to go to the town market and restaurants. The hotel has its own restaurant and a bar. Complete renovation in progress December 2011 but should be completed by end Feb 2012. from Rs. 2000 to 10000\n"
                +
                "" +
                "Hotel Savoy from the Taj Group is one good option.Sitting firm on a rising hill, the Hotel sprawls over six acres of landscaped gardens, offering colonial style cottages that were built between 1834-1865. Colorful flowerbeds merge to form a multi-coloured quilt around the cottages, adding to their gentle refinement and old English Charm. A quiet retreat, the Savoy Hotel offers a little pocket of paradise.\n" +
                "" +
                "Sunshine Inn Mobile - 99433-33323 or 98942-96961 Three-star property with 70 rooms. Includes a restaurant, room service, in-house laundry, travel desk, and car parking is available inside the hotel premises. Season tariff starts from Rs.1800 + tax.\n" +
                "" +
                "Sullivan court, Near Rose Garden, [9]. 5 Star Luxury Hotel of Ooty. Most famous hotel, best rooms, part of ITC Hotels India.\n "));
        modelList.add(new Model(R.drawable.wayanad,"Wayanad", "Misty Mount Homestay\n Payyampally Near Kuruva Island, Near Telephone Exchange Payyampally, Kalpetta India\n" +
                "" +
                "Dream Land Residency\n #1 of 1 inn in Mananthavady\n Mananthavady-Koyileri-Panamaram Road, Mananthavady 670645 India\n" +
                "" +
                "Parisons Plantation Experiences by ABAD\n #1 of 2 guest houses in Thavinhal\n Thavinhal 670644 India\n" +
                "" +
                "Koomankolly Heritage Retreat\n #1 of 4 lodges in Thirunelly Thirunelly Temple, Mananthawady Village, Thirunelly 670646 India\n"));
        modelList.add(new Model(R.drawable.munnar,"Munnar","Pulimoottil Estate Bungalow, (10 km from Munnar Town in Mankulam Road), [14]. Offers independent estate bungalows and rooms. Has restaurant, conference hall etc. Enjoy a stroll through a Cardamom Plantation, visit the stream. Offers Camp fire facilities.\n" +
                "" +
                "Devadaru Holiday Villa, Near Chengulam Dam (15 km from Munnar town), [19]. A single villa in a 2 acre spice garden, you rent it in whole, no hotels or resorts can match this privacy.\n" +
                "" +
                "Bella Vista Resort, Chithirapuram Post (20 km from Munnar town), [18]. Very scenic with roof top restaurant. Double honeymoon cottage around Rs 1,800\n" +
                "" +
                " ature Zone Resort Munnar, Pulippara, Pallivasal, Munnar, ☎ +91 9745433330, [13]. Ideal place for travelers seeking a break from the city ,want to spend time with nature with picturesque surroundings and peaceful environment\n" +
                "" +
                "Hotel Misha, Misha Jn (close to the main market in old Munnar. Opposite Hotel Green Ridge.), ☎ +91 48 6523 0376, +91 48 6523 2376 (mishaholidays@gmail.com), [12]. checkout: 12 noon. Can be negotiated further down to Rs 700-800/- in peak season and lower in off season. Rs 1,200-1,700.\n"));
        modelList.add(new Model(R.drawable.gujarat,"Gujarat Hotels","Eulogia Inn\n" +
                "#3 of 548 hotels in Ahmedabad\n" +
                "Beside Prime Status Opp. Safal Vivan Bungalow , Near Gota Bridge, Gota, Ahmedabad 382481 India\n" +
                "072111 98890\n" +
                "" +
                "Lords Plaza - Surat\n" +
                "#1 of 156 hotels in Surat\n" +
                "Delhi Gate, Ring Road,, Surat 395003 India\n" +
                "" +
                "Ginger Surat City Center\n" +
                "#2 of 156 hotels in Surat\n" +
                "opposite Surat Railway Station, Doriwala Square, Surat 395003 India\n" +
                "" +
                "Lords Inn Somnath\n" +
                "#1 of 28 hotels in Somnath\n" +
                "Veraval Somnath Bypass Prabhash Patan, Somnath 362001 India\n"));
        modelList.add(new Model(R.drawable.jaipur,"Jaipur Hotels","im Vilas, [18]. Family run guesthouse located in the heart of the city, with 8 A/C rooms. The service is friendly and it is also excellent value for money. A/C Double Rooms Prices [June 2012]: from 1800 Rs to 2,850 Rs. Breakfast & Taxes included\n" +
                "" +
                "Chit Chat Guest house , D-160 Kabir Marg, Bani Park. ☎ +91 141 2201899, +91 2202843 [45], chitchat7@hotmail.com. Rs 300/person single, double room Rs 500/day (hot/cold shower). Airport/rail station/bus station pick up available, nice restaurant\n" +
                "" +
                "Milestone 251, Hotel Milestone 251 jaipur ☎ +91 96107 1000, reservations@milestone251.com. 3 Star Comfort Hotel located near to Railway Station in Bani Park area.\n" +
                "" +
                "Hotel Meghniwas, [56] ☎ +91 141 2202034, email@meghniwas.com. Single and double rooms from Rs 2,000. It also has a swimming pool open to non-guests for Rs.200\n" +
                "" +
                "Sarang Palace, A-40, Subhash Nagar, ☎ +91 141 2281199, [61], [62]. 3 star heritage hotel, offers free pick up from train and bus station From Rs 1,800."));
        modelList.add(new Model(R.drawable.jodpur,"Jodpur Hotels","Hotel Lake View & Resort [29], Akhey Raj Ka Talab, Kaylana Road, Jodhpur-Jaisalmer Highway. ☎ +91 291 2750614, +91 291 2751614.(info@hotellakeviewandresorts.com\n)" +
                "" +
                "otel Sachdeva Excellency [30], Bank of Baroda Lane, Sojati Gate, Jodhpur. ☎ +91 291 5101324, +91 291 2635858, mobile: +91 9829025707, (info@hotelsachdeva.com)\n"
                +
                "" +
                "Innseason, P.W.D Road, Jodhpur. ☎ +91 291 2616400, ☎ +91 291 2621481, fax: 91 291 2616400\n," +
                "" +
                "Devi Bhawan, Defence Lab Road, Ratanada, +91 291 251-1067 (devibhawan@sify.com), ☎ +91 98 28035359), [41]. A 90 year old heritage building with rooms set around a garden. The rooms are decorated with period furniture and Rajasthani textiles. 1.5 km from the centre of the town.\n"));
        modelList.add(new Model(R.drawable.udaipur,"Udaipur Hotels","Anjani Hotel, 77 Gangour Ghat Marg, (mail@anjanihotel.com), [28]. A former palace. Rooms have balconies with lake views. Rooftop restaurant. ₹1,530-2,210.\n " +
                "" +
                "Nayee Haveli, Gangour Ghat, ☎ +91 9829511573 (rahil_gul@yahoo.com), [34]. A 100+ year haveli with 6 rooms, lake views, and a rooftop restaurant.\n" +
                "" +
                "Boheda Palace, Kalaji Goraji, near Lake Palace Road (Directly east of the City Palace), ☎ +91 294 2424414 (info@hotelbohedapalace.com). Large rooms with Rajastani decorations and painted ceilings. Good service. ₹2,200\n" +
                "" +
                "Zostel Udaipur, 25-26 Nav Ghat (Near City Palace), ☎ +91 77288 97595, [50]. A great place to meet young travelers. Rooftop café. Free walking tours. Some rooms have a lake view. On a narrow road. Dorm bed: ₹449, Double: ₹1,999\n"));
        modelList.add(new Model(R.drawable.mumbai,"Mumbai Hotels","locomo hostel, vile parle east monghibai road (outside vile parle station), ☎ 8928094289, [6]. checkin: 1400; checkout: 1200. 799\n" +
                "" +
                "The Orchid- Ecotel Mumbai Airport Nehru Road, Vile Parle (East), Adjacent To Domestic Airport, 400099 Mumbai, India" +
                "" +
                "Trident Nariman Point Nariman Point, 400021 Mumbai, India" +
                "" +
                "JW Marriott Mumbai Sahar AirportIA Project Road, Chhatrapati Shivaji International Airport, Andheri East, 400099 Mumbai, India\n"));
        modelList.add(new Model(R.drawable.goa,"Goa Hotels","The Menino Regency\n" +
                "Dr. Dada Vaidya Road Panjim - Goa 403001\n" +
                "" +
                "SinQ Edge\n Horizon Residence, Near Models Status, Dona Paula - Goa university Road, Dona Paula Goa 403004\n" +
                "" +
                "La Gracia Resort\n 207/7 New Wada Morjim Pernem North Goa - 403512\n" +
                "" +
                "Ocean Palms Goa\n E-1/304/5/6 A/B/C, OCEAN PALMS Goa, OPP. HOLIDAY, STREET, CALANGUTE, North Goa, Goa, 40351\n6"));
        modelList.add(new Model(R.drawable.dadra,"Dadra And Nagar Hotels","Khanvel Resort\n" +
                "Next to Vanvihar complex, Chauda Khanvel, Khanvel, Khanvel, India, 396230\n" +
                "" +
                "Ras Resorts\n" +
                "128 (P) (I),Silvassa Naroli road Silvassa, Athal, Silvassa, India, 396230" +
                "" +
                "Forest Village Holiday Homes\n" +
                "Baman pada,Rundana, Khanvel, Silvassa, Silvassa, India, 396230\n" +
                "" +
                "Lords Resorts Silvassa\n" +
                "Kakad faliya Road, Athal, Silvassa, India, 396235 "));
        modelList.add(new Model(R.drawable.kolkatta,"Kolkatta Hotels ","OYO Rooms, 39/1, Post Office Road, Dum Dum Gorabazar, Kolkata- 700 028, ☎ +91- 9830526691, [2]. OYO Rooms is India's largest branded network of hotels spread across 168 cities with 6500+ hotels offering standardized stay experiences at an unmatched price with an average Tripadvisor rating of 4.5/5. OYO Rooms at Kolkata is having presence across 300 hotels in every part starts at Rs 800 (approx. US$13), including tax, free breakfast & wifi.\n" +
                "" +
                "Hotel Aston, 3, Aston Road, Kolkata - 700 020, India, ☎ 091-033-24863145, [3]. Hotel Aston is strategically situated in the heart of Kolkata, India, close to the city center. It is 20 km from the Dumdum Airport and 6 km from the Howrah Railway Station.\n " +
                "" +
                "Housez 43, 43, Mirza Galib Street, Kolkata - 700 016, India, ☎ +91 33 2227 6020 to 21, [4]. Housez 43 is a boutique hotel in Kolkata, India. It has 28 tastefully designed rooms that reflects fine aesthetics. Their dining room is cozy, and provides a perfect European experience\n" +
                "" +
                "Hotel Samilton, 37, Sarat Bose Road, Kolkata - 20, India., ☎ 3051 - 7700 / 7777, [5]. The Hotel Samilton is in Sarat Bose Road, the commercial hub of Kolkata, West Bengal, INDIA. Kolkata is one of the major metropolitan cities of India.The Hotel Samilton offers all facilities of a Modern Hotel with homely comfort. The hotel is well equipped and provide the best of services. Rates start at Rs. 2595.00\n." +
                "" +
                "Hotel Roland, 28A, Rowland Road, Kolkata - 700 020, ☎ (033) 30517600, [6]. Hotel Roland is Situated in Central Kolkata, and the Maxmuller Bhavan is near by. It is around a 45 minutes drive away from the airport.The Hotel is located 8 kms. from Netaji Subhash Airport, 3 kms. from Howrah Railway Station and 1 km. from Esplanade Bus Stand. Hotel Roland offers 25 Air-Conditioned rooms with attached modern baths. Rates start at Rs. 1895.00.\n"));
        modelList.add(new Model(R.drawable.darjeeling,"Darjeeling Hotels","Hotel Aliment, ☎ 03542255068. checkout: 10AM. Located at the top of the hill, the views are nice, but the 15 min walk from the clock tower is quite steep. In some double rooms there is hot water 6:30PM-7:30PM, but they can fill up a bucket with hot water the rest of the day. There is also a simple restaurant, which houses an impressive library. Rs 400-1600\n." +
                "" +
                "Hotel Roma, ☎ 09339424307. checkin: 12 noon; checkout: 11AM. Located near the mall , the views are nice, but the 3 min walk to mall. , There is also a restaurant, Rs 1300-2000.\n " +
                "" +
                "Birds Eye, Dr. Zakir Hussain Rd (near the top of the hill on the south end of Darjeeling. From the jeep drop off and train station it is up to the very top and then keep going right), ☎ 9832321037,. checkout: noon. Opened in October 2008. Rs 300\n+" +
                "" +
                "Hotel Pineridge, The Mall, Darjeeling (on the left before Chowrasta), ☎ +91 354 2254074. Few rooms face Kanchenjungha. Rooms are dank & dreary with rickety old furniture. Offers a hint of the old world charm. Rs 2000\n" +
                "" +
                "he Parklane hotel, N C Goenka road (from Darjeeling station on the way to chowk bazzar), ☎ +91 354 2256902. checkin: 12 noon; checkout: 12 noon. All rooms office good hill view with balcony. Pure vegetarian restaurant is attached with hotel. Rs 850-1,600."));
        modelList.add(new Model(R.drawable.shimla,"Shimla Hotels","Shimla Youth Hostel located in \"must visit\" Lakkar Bazar offers budget accommodation, ranging from Rs.500 to 1000. and a discount to Youth hostel members. Ph:+919418025462. shimlayouthhostel@yahoo.com\n" +
                "" +
                "Hotel White, Lakkar Bazaar (500m NE of The Ridge), ☎ +91 177 265-5276 (hotelwhite@yahoo.co.in, fax: +91 177 265-5276), [13]. This hotel surprisingly offers clean and spacious rooms all done up in white at budget-friendly rates. Opt for their suite which also offers a balcony and great views of the vally. Rs1500\n" +
                "" +
                "Dalziel (2,135 metres above sea level), The Mall (10 minutes walk westwards from Scandal Point), ☎ 9211709437, [14]. checkin: 27/5/12; checkout: 29/5/12. Situated in a wooden heritage building. Laundry service and meals available.Food & water served unhygenic From Rs 400 upwards\n" +
                "" +
                "Hotel Combermere (2,150 metres above sea level at Circular Road level, 2,185 metres at the top-floor level), The Mall (10 minutes' walk eastwards from Scandal Point; near The Lift, opposite the Indira Gandhi Sports Complex), ☎ +91 177 225-1246/47/48, 265-2242/43/46/48 (hcs@sancharnet.in, fax: +91 177 225-2251, 265-7906) "));
        modelList.add(new Model(R.drawable.cherrapunji,"Cherrapunji Hotels","herrapunjee Holiday Resort, Village Laitkynsew, Cherrapunjee Pincode - 793 108, ☎ 094361 15925 096153 38500, 098630 79856, [1]. 3000rs\n" +
                "" +
                "aimika Park, sohra/cherrapunjee (3 kms before reaching the marketplace, there is a divertion to the right. drive for 1/2 km to reach saimika park), ☎ +919863020718, [2]. A 65 acre plot of land with a restaurant, 7 guest rooms, two of which are made in traditional design using locally available construction material,a dormitory is available for backpackers. A conference hall is also available. Some of the amenities include a plunging pool, a basketball court,tennis court, fishing pond and trekking guides to take you to visit community forests and enjoy natural sohra. When you're not up to the outdoors there are indoor board games available. 400-2500\n" +
                "" +
                "By The Way, Dukan Road. Lower Cherrapunjee (On the main road, just before the gas station (Indian Oil), on the right when you're coming from Shillong.), ☎ Heprit 09856630274. provides Lodging for 'BACKPACKERS' Has 2 rooms with a shared bathroom since he closed down the dorm rooms. 500 INR per roo\nm" +
                "" +
                "Polo Orchid Resort, [3]. Cherrapunjee`s only Resort. Winner of the World Travel Brands Awards. Crazy expensive\n"));
        modelList.add(new Model(R.drawable.andaman,"Andaman and Nicobar Hotels","Taj Exotica Resort & Spa, Andamans\n" +
                "Radhanagar Beach No 7 Havelock Island, Havelock Island, Andaman and Nicobar Islands, India, 744211 -\n" +
                "" +
                "Sea Shell Havelock\n" +
                "2 Govind Nagar Beach, 2 Govind Nagar Beach, Havelock Island, Andaman and Nicobar Islands, India, 744211 -\n" +
                "" +
                "Sea Hills Hotels & Resorts\n" +
                "Subhash Nagar, Shadipur, Andaman & Nicobar Island, Port Blair, Andaman and Nicobar Islands, India, 744106 -\n" +
                "" +
                "Tilar Siro Andamans - CGH Earth\n" +
                "Beach no.5, Vijay Nagar, Swaraj Dweep, Havelock Island, Andaman and Nicobar Islands, India, 744211 - \n" +
                "" +
                "Welcomhotel by ITC Hotels, Bay Island, Port Blair" +
                "Marine Hill,, Port Blair, Andaman and Nicobar Islands, India, 744101\n"));
        modelList.add(new Model(R.drawable.asam,"Assam Hotels","Palm Valley Svasti Resort\n #31 of 541 hotels in Udaipur\n Jhadol Road Naya Kheda, Udaipur 313901 India\n" +
                "" +
                "Jaiwana Haveli\n #8 of 541 hotels in Udaipur\n  14 Lalghat City Palace Road Behind Jagdish Temple On the eastern shore of Pichola Lake, Udaipur 313001 India\n" +
                "" +
                "Hotel Lakend\n #25 of 541 hotels in Udaipur\n Alkapuri Fatehsagar Lake Shores, Udaipur 313001 India\n" +
                "" +
                "The Ananta Udaipur\n #3 of 4 hotels in Bhujra\n Kodiyat Main Rd Village Bujda, Tehsil Girwa, Bhujra, Udaipur 313031 India\n" +
                "" +
                "Fateh Niwas by Fateh Collection\n #7 of 541 hotels in Udaipur\n Rampura Circle, Udaipur 313001 India\n"));
        //init the adapter with model list and context
        adapter = new CustomAdapter(modelList,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);

    }
}