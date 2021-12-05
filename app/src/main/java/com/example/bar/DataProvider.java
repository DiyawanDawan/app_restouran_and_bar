package com.example.bar;

import android.content.Context;
import com.example.bar.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {


    private static List<Masakan> masakans = new ArrayList<>();

    private static List<Coktail> initCoktail(Context ctx) {
        List<Coktail> coktails = new ArrayList<>();
        coktails.add(new Coktail("Dark and Stormy", "Ingredients\n" + ". 2 oz. dark rum\n" +
                "• 3 oz. ginger beer\n" +
                "• 1/2 oz. lime juice (optional)", "Directions \n Fill a tall glass with ice cubes. Add rum, then pour in ginger beer and lime juice. Stir with a barspoon. Garnish with a lime wedge.", R.drawable.c_dark_and_stormy));
        coktails.add(new Coktail("French 75", "Ingredients \n • 2 oz. London dry gin\n" +
                "• 1 tsp. superfine sugar\n" +
                "• 1/2 oz. lemon juice\n" +
                "• 5 oz. Brut champagne", "Derictions \n Shake gin, sugar, and lemon juice well with cracked ice in a chilled cocktail shaker. Strain into a Collins glass half-full of cracked ice. Top off with champagne.", R.drawable.c_french_75));
        coktails.add(new Coktail("Boulevardier", "Ingredients \n • 1 1/2 oz. bourbon or rye whiskey\n" +
                "• 3/4 oz. Campari\n" +
                "• 3/4 oz. sweet vermouth", "Directions \n Stir ingredients with ice in a mixing glass until chilled. Strain into a coupe glass. Garnish with an orange twist.", R.drawable.c_boulevardier));
        coktails.add(new Coktail("Bloody Mary", "Ingrediens \n The Mix\n" +
                "• 1/2 c. tomato juice\n" +
                "• 1/4 inch horseradish, chopped\n" +
                "• 1 tsp. Worcestershire sauce\n" +
                "• dash of celery seeds\n" +
                "• 4 dashes hot sauce (Tabasco, Tapatio, etc.)\n" +
                "• 1/2 lemon's juice, fresh squeezed\n" +
                "• 1/2 lime's juice, fresh squeezed\n" +
                "• dash of sea salt\n" +
                "• dash of black pepper\n" +
                "• 1 tbsp. vodka\n" +
                "The Drink\n" +
                "• 2 oz. vodka\n" +
                "• 6-8 oz. Bloody Mary mix", "Directions \n Blend tomato juice, horseradish, Worcestershire, and celery seeds until smooth. Add hot sauce, lemon juice, lime juice, salt, and pepper, then blend. Adjust the mix depending on how spicy, salty, or citrusy you like it. Add 1 tbsp. vodka to stabilize the mix and keep the juices fresh, then blend. Combine 6-8 oz. of the mix with 2 oz. of vodka into a glass with ice. Pour back and forth into another glass 3 or 4 times to mix, then garnish however you like.", R.drawable.c_bloody_mary));
        coktails.add(new Coktail("Gimlet", "Ingredients \n " +
                "• 2 oz. London dry gin\n" +
                "• 2/3 oz. Rose's lime juice", "Directions \n Shake ingredients in a cocktail shaker with cracked ice. Strain into a chilled cocktail glass, and garnish with a lime.", R.drawable.c_gimlet));
        coktails.add(new Coktail("Moscow Mule", "Ingredients\n" +
                "• 2 oz. vodka\n" +
                "• 4-6 oz. ginger beer\n" +
                "• 1/2 oz. lime juice\n", "Directions\n Squeeze lime juice into a Moscow Mule mug, then drop in spent shell. Add 2-3 ice cubes and vodka, then fill with ginger beer.", R.drawable.c_moscow_mule));
        coktails.add(new Coktail("Aperol Spritz", "Ingredients \n" +
                "• 2 oz. Aperol\n" +
                "• 3 oz. prosecco\n" +
                "• 2 oz. (or a top off) club soda\n" +
                "• orange slices", "Directions\n Build Aperol, prosecco, and club soda in a wine glass over ice. Garnish with fresh orange slices in the glass.", R.drawable.c_aperol_spritz));
        coktails.add(new Coktail("Mojito", "Ingredients" +
                "• 2 oz. white rum\n" +
                "• 1/2 oz. lime juice (squeezed fresh)\n" +
                "• 1 tsp. superfine sugar\n" +
                "• 3 mint leaves\n" +
                "• club soda or seltzer", "Directions \n In a smallish Collins glass, muddle lime juice with 1/2 to 1 tsp. superfine sugar. Add the mint leaves, mushing them against the side of the glass, then fill the glass 2/3 with cracked ice and pour in the rum. Pitch in the squeezed-out lime shell and top off with club soda or seltzer.", R.drawable.c_mojito));
        coktails.add(new Coktail("Margarita", "Ingredients\n" +
                "• 2 oz. silver tequila\n" +
                "• 1 oz. Cointreau\n" +
                "• 1 oz. lime juice\n" +
                "• coarse salt for the rim", "Directions\n Rub the rim of a chilled cocktail glass with lime juice and dip in coarse salt. Shake tequila, Cointreau, lime juice, and ice in a mixing glass, then strain into the salted glass over ice.", R.drawable.c_margarita));
        coktails.add(new Coktail("Whiskey Sour", "Ingredients \n" +
                "• 2 oz. bourbon or rye\n" +
                "• 2/3 oz. lemon juice\n" +
                "• 1 tsp. superfine sugar\n" +
                "• 1/2 egg white", "Directions\n Shake ingredients well with cracked ice, strain into a chilled cocktail glass, and garnish with a lemon wedge and/or maraschino cherry.", R.drawable.c_whiskey_sour));
        return coktails;
    }

    private static List<Mocktail> initMocktail(Context ctx) {
        List<Mocktail> mocktails = new ArrayList<>();
        mocktails.add(new Mocktail("BLUEBERY MOJITO", "Bahan: \n 6 lembar daun mint\n" +
                "1 cup blueberry\n" +
                "¼ cup perasan jeruk nipis\n" +
                "¼ cup simple sirup\n" +
                "1 cup air soda\n" +
                "Es batu secukupnya\n" +
                "Cara membuat:", "Cara membuat\n Masukkan blueberry dan daun mint ke dalam shaker, tumbuk kasar.\n" +
                "Masukkan perasan jeruk nipis, simple sirup, dan es batu. Kocok sebentar.\n" +
                "Tuangkan ke dalam gelas.\n" +
                "Tambahkan air soda dan es batu. Hias dengan daun mint.", R.drawable.m_blueberry_mojito));
        mocktails.add(new Mocktail("NICE PEAR", "Bahan\n 250 ml jus pir\n" +
                "60 ml air lemon\n" +
                "2 sdm gula\n" +
                "Air soda secukupnya\n" +
                "Es batu secukupnya\n", "Cara membuat\n Campurkan semua bahan ke dalam shaker.\n" +
                "Tuangkan ke dalam gelas dan beri air soda secukupnya.\n" +
                "Hias dengan potongan buah pir di atasnya.", R.drawable.m_nice_pear));
        mocktails.add(new Mocktail("PINEPPLE COBBLER", "Bahan:\n 60 ml jus stroberi\n" +
                "30 ml air lemon\n" +
                "100 ml jus nanas\n" +
                "Air soda secukupnya\n" +
                "Es batu secukupnya", "Cara membuat\n Masukkan jus nanas, jus stroberi, dan air lemon ke dalam shaker yang sudah di isi es. Kocok sebentar.\n" +
                "Tuangkan ke dalam gelas. Tambahkan es batu dan air soda.\n" +
                "Hias dengan irisan nanas dan lemon.", R.drawable.m_pineapple_cobbler));
        mocktails.add(new Mocktail("HOLIDY SHIRLEY", "Bahan:\n ¼ cup jus jeruk\n" +
                "½ cup sprite\n" +
                "2 sdt simple syrup\n" +
                "Buah ceri untuk garnish\n" +
                "Es batu secukupnya", "Cara membuat: \n Tuang jus jeruk, simpe syrup, dan sprite ke dalam gelas. Aduk.\n" +
                "Tambahkan es batu secukupnya. Aduk kembali.\n" +
                "Garnish mocktail dengan buah ceri. Sajikan.", R.drawable.m_holayday_shirly));
        mocktails.add(new Mocktail("Virgin Watermelon Margarita", "Bahan:\n 1 buah semangka ukuran sedang, potong-potong\n" +
                "½ cup perasan jeruk nipis\n" +
                "4 sdm jus nanas\n" +
                "1/3 cup air soda\n" +
                "Es batu secukupnya", "Cara membuat:\n Haluskan buah semangka di dalam blender.\n" +
                "Tambahkan perasan jeruk nipis dan jus nanas. Blender kembali.\n" +
                "Tuangkan ke dalam pithcer yang sudah diberi es batu.\n" +
                "Tambahkan air soda di atasnya. Beri potongan jeruk nipis. Sajikan.", R.drawable.m_virgin_watermelon_margarita));
        return mocktails;
    }

    private static List<Indonesian_Food> initIndonesianFoos(Context ctx) {
        List<Indonesian_Food> indonesian_foods = new ArrayList<>();
        indonesian_foods.add(new Indonesian_Food("Rendang", "Bahan : \n 500 gram daging sapi, potong kotak jadi 8 atau 10 bagian\n" +
                "600 ml santan kental, dari satu setengah butir kelapa\n" +
                "5 sdm minyak goreng\n" +
                "300 ml air\n" +
                "Bumbu halus:\n" +
                "\n" +
                "10 buah cabai merah iris\n" +
                "6 butir bawah merah\n" +
                "3 siung bawah putih\n" +
                "3 cm kunyit\n" +
                "3 cm jahe\n" +
                "3 cm lengkuas\n" +
                "1 sdm garam\n" +
                "2lembar daun kunyit\n" +
                "1 batang serai\n" +
                "2 butir asam kandis\n" +
                "Cara Membuat:", "Ingrediens \n Tumis bumbu hingga harum, masukkan daging, aduk hingga berubah warna.\n" +
                "Masukkan daun kunyit, serai, dan asam kandis. Aduk perlahan.\n" +
                "Masukkan air. Masak hingga air menyusut. Aduk perlahan sesekali.\n" +
                "Masukkan santan, masak dengan api sedang.\n" +
                "Biarkan hingga daging empuk, kuah kering, dan berminyak. Angkat, sajikan.", R.drawable.i_rendang));
        indonesian_foods.add(new Indonesian_Food("Rawon", "Bahan: \n 500 gram daging sapi agak berlemak\n" +
                "2 liter air\n" +
                "3 batang serai, memarkan\n" +
                "3 cm lengkuas, memarkan\n" +
                "5 lembar daun jeruk\n" +
                "2 lembar daun salam\n" +
                "4 sdm minyak untuk menumis\n" +
                "2 tangkai daun bawang, potong-potong\n" +
                "Bumbu halus:\n" +
                "\n" +
                "5 butir bawang merah\n" +
                "3 siung bawang putih\n" +
                "2 butir kemiri\n" +
                "1 sdt ketumbar\n" +
                "2 cm jahe\n" +
                "2 cm kunyit\n" +
                "3 bh cabai merah (opsional)\n" +
                "4 bh keluwak tua, kukus, ambil isinya\n" +
                "2 sdt garam\n" +
                "Pelengkap:\n" +
                "\n" +
                "Kerupuk udang\n" +
                "100 gram tauge pendek\n" +
                "4 butir telur asin\n" +
                "Sambal\n", "Ingrediens\n Masak daging dengan api kecil\n" +
                "Masukkan daun salam, serai, lengkuas, dan daun jeruk sampai daging empuk dan matang.\n" +
                "Angkat daging, lalu potong kecil-kecil.\n" +
                "Saring rebusan air daging, sisihkan bersama irisan daging.\n" +
                "Haluskan semua bumbu halus, tumis sampai berbau harum.\n" +
                "Angkat, lalu masukkan ke dalam kaldu daging.\n" +
                "Masak dengan api kecil sampai mendidih kembali.\n" +
                "Cicipi, apakah rasanya sudah pas.\n" +
                "Masukkan daun bawang yang sudah dipotong, didihkan sebentar.\n" +
                "Tuang rawon kedalam mangkuk, taburkan tauge pendek di atasnya.\n" +
                "Sajikan bersama nasi hangat, telur asin dan sambal.", R.drawable.i_rawon));
        indonesian_foods.add(new Indonesian_Food("Sate", "Bahan : \n 250 g fillet ayam, dipotong dadu, kemudian tusukan ke tusukan sate\n" +
                "1 buah jeruk nipis yang telah iris\n" +
                "100 ml minyak goreng\n" +
                "3 butir bawang merah, diiris tipis\n" +
                "5 sdm kecap manis\n" +
                "nasi putih atau bisa diganti lontong secukupnya\n" +
                "Bumbu kacang :\n" +
                "\n" +
                "\n" +
                "3 butir bawang putih\n" +
                "4 butir bawang merah\n" +
                "100 g kacang tanah, digoreng\n" +
                "2 butir kemiri\n" +
                "garam secukupnya\n" +
                "150 ml air kaldu ayam\n" +
                "2 sdm minyak goreng\n" +
                "Sambal:\n" +
                "\n" +
                "cabe merah kecil 15 buah\n" +
                "bawang putih 4 siung\n" +
                "garam secukupnya\n" +
                "minyak goreng secukupnya", "Cara Membuat:\n Pembuatan bumbu kacang,  haluskan bawang putih, bawang merah, kacang tanah, garam, dan juga kemiri.  Tumis bumbu kacang hingga tercium bau harum, kemudian masukkan air kaldu dan selanjutnya masak sampai mengental lalu angkat. Sisihkan.\n" +
                "Selanjutnya , campurkan 2 sendok makan bumbu kacang dengan ditambah 2 sendok makan kecap manis, lalu celupkan sate, kemudian bakar hingga setengah matang. Angkat lalu gulingkan lagi dalam bumbu, terus  bakar lagi hingga matang, angkat.\n" +
                "Untuk sambal bawang,  Tumis bawang putih sampai setengah matang lalu angkat. Selanjutnya campur bawang putih ditambah juga cabe merah kecil, dan garam, haluskan.", R.drawable.i_sate));
        indonesian_foods.add(new Indonesian_Food("Tahu Bacam", "Bahan :\n 400 gram tempe/tahu, potong sesuai selera\n" +
                "800 ml air kelapa\n" +
                "100 gram gula merah, sisir\n" +
                "2 sdm kecap manis\n" +
                "1 lembar daun salam\n" +
                "1 cm lengkuas, memarkan\n" +
                "½ sdt garam\n" +
                "minyak untuk menggoreng\n" +
                "Haluskan :\n" +
                "\n" +
                "6 butir bawang merah\n" +
                "4 siung bawang putih\n" +
                "½ sdm ketumbar\n" +
                "3 batang serai, ambil putihnya", "Cara memasak: \n Ungkep atau rebus tempe bersama air kelapa, gula merah, kecap manis, daun salam, lengkuas, garam, dan bumbu halus sampai matang dan meresap. Biarkan dingin.\n" +
                "Panaskan minyak, goreng di atas api sedang hingga kecokelatan. Angkat, tiriskan dan hidangkan.", R.drawable.i_tahu_bacam));
        indonesian_foods.add(new Indonesian_Food("Soto ayam", "Bahan : \n 1/2 ekor ayam\n" +
                "2 liter air\n" +
                "250 gr tauge panjang, buang akarnya\n" +
                "1 batang daun bawang, iris halus\n" +
                "1 1/2 sdt garam\n" +
                "1 sdt gula pasir\n" +
                "3 lembar daun jeruk\n" +
                "1 batang serai, digeprek\n" +
                "2 ruas lengkuas, digeprek\n" +
                "2 ruas jahe, digeprek\n" +
                "Bumbu halus :\n" +
                "\n" +
                "1 sdt merica bulat\n" +
                "8 butir bawangmerah\n" +
                "4 siung bawang putih\n" +
                "3 ruas kunyit\n" +
                "Pelengkap :\n" +
                "\n" +
                "2 batang seledri iris halus\n" +
                "1 buah tomat, iris\n" +
                "bawang merah goreng\n" +
                "jeruk nipis, belah", "Cara Membuat :\n Rebus ayam hingga ayam empuk. Kecilkan apinya.\n" +
                "Tumis bumbu halus, daun jeruk, serai, lengkuas, dan jahe hingga keluar aromanya. Angkat dan masukkan ke dalam air rebusan ayam. Aduk rata dan masak hingga mendidih.\n" +
                "Tambahkan garam, gula pasir, kaldu bubuk, daun bawang, dan tauge. Aduk rata dan masak sebentar lalu angkat.\n" +
                "Sajikan dalam mangkuk dan beri bahan pelengkap.", R.drawable.i_soto_ayam));
        indonesian_foods.add(new Indonesian_Food("SOP BUNTUT", "Bahan : \n 1 kg buntut sapi\n" +
                "2 cm jahe, digeprek\n" +
                "1 btg daun bawang, iris\n" +
                "1 sdm, minyak goreng\n" +
                "200 gr wortel, potong serong atau dadu\n" +
                "250 gr kentang, potong dadu\n" +
                "Pala bubuk secukupnya\n" +
                "Air untuk merebus secukupnya\n" +
                "Bumbu halus:\n" +
                "\n" +
                "6 bh bawang merah\n" +
                "3 bh bawang putih\n" +
                "1 sdt merica bulat\n" +
                "Pelengkap:\n" +
                "\n" +
                "bawang merah goreng\n" +
                "tomat, potong dadu\n" +
                "daun bawang iris kasar", "Cara membuat\n Masukkan buntut dalam panci hingga terendam air, rebus di atas api sampai mendidih\n" +
                "Buang buih yang terapung diatas dan air rebusan pertama buntut. Hal ini berguna agar kaldu tidak berbau.\n" +
                "Panaskan minyak goreng, kemudian tumis bumbu halus\n" +
                "Selanjutnya masukkan bubuk pala, jahe, daun bawang hingga harum\n" +
                "Berikutnya masukan buntut dan beri air\n" +
                "Rebus dalam panci tertutup dengan api kecil\n" +
                "Rebus wortel dan kentang di panci terpisah hingga matang, kemudian tiriskan.\n" +
                "Setelah buntut lunak,ambil buntutnya lalu saring kaldunya, kemudian masukan kembali buntut ke dalam kaldu yang sudah disaring.\n" +
                "Didihkan buntut kembali dengan api kecil\n" +
                "Letakkan wortel dan kentang ke dalam mangkuk kemudian tuangkan kaldu dan buntut, kemudian beri taburan  pelengkapnya.", R.drawable.i_sop_buntut));
        indonesian_foods.add(new Indonesian_Food("MIE GORENG", "Bahan\n 1 bungkus mie telor\n" +
                "Secukupnya udang\n" +
                "5 butir bakso ikan\n" +
                "2 buah wortel\n" +
                "1 batang daun bawang\n" +
                "4 siung bawang merah\n" +
                "2 siung bawang putih\n" +
                "Secukupnya minyak goreng\n" +
                "3 sendok teh minyak wijen (opsional)\n" +
                "1 1/2 sendok teh lada bubuk\n" +
                "Kecap\n" +
                "Garam\n" +
                "Air/Kaldu Ayam", "Cara Membuat:\n Rebus mie telor hingga lunak tapi jangan terlalu lembek,  angkat dan tiriskan.\n" +
                "Iris wortel, bakso, dan daun bawang.\n" +
                "Siapkan udang yg telah dikupas bersih\n" +
                "Haluskan bawang merah dan bawang putih\n" +
                "Tumis bumbu halus hingga harum, masukkan udang, bakso, wortel.\n" +
                "Tambahkan minyak wijen kemudian masukkan air, garam, lada sedikit kecap manis dan terakhir masukkan mie beserta daun bawang aduk hingga meresap.\n" +
                "Icip, tambahkan garam sesuai selera.\n" +
                "Tuang ke dalam piring, Sajikan", R.drawable.i_mie_goreng));
        indonesian_foods.add(new Indonesian_Food("AYAM GORENG", "Bahan :\n 1 ekor ayam kampung muda, bagi menjadi 4 bagian\n" +
                "1 buah jeruk nipis, peras airnya\n" +
                "300 ml air kelapa muda\n" +
                "2 lembar daun salam\n" +
                "Minyak goreng secukupnya\n" +
                "Bumbu halus:\n" +
                "\n" +
                "5 siung bawang putih\n" +
                "5 butir kemiri\n" +
                "2 cm lengkuas\n" +
                "2 cm kunyit\n" +
                "garam\n" +
                "Cara membuat:", "Cara membuat\n Lumuri ayam dengan perasan air jeruk nipis.\n" +
                "Tambahkan bumbu halus. Aduk rata, diamkan 30 menit\n" +
                "Rebus ayam dalam air kelapa, tambahkan daun salam. Masak dengan api kecil dan aduk rata hingga ayam empuk, dan kuah mengental.\n" +
                "Panaskan minyak banyak, goreng ayam hingga kuning kecoklatan.\n" +
                "Angkat dan tiriskan.\n" +
                "Hidangkan ayam goreng dan sambal, dilengkapi dengan lalapan segar.", R.drawable.i_ayam_goreng));
        indonesian_foods.add(new Indonesian_Food("AYAM PANGGANG MERAG", "Bahan :\n 1 ekor ayam negeri, potong 10 bagian\n" +
                "Satu sendok teh air jeruk limau\n" +
                "1 sendok teh garam\n" +
                "3 sendok makan minyak untuk menumis\n" +
                "2 lembar daun salam\n" +
                "2 cm lengkuas, memarkan\n" +
                "600 ml santan dari 1 butir kelapa parut\n" +
                "1/2 sendok makan garam\n" +
                "1 sendok makan gula merah\n" +
                "1/4 sendok teh merica bubuk\n" +
                "Bumbu halus:\n" +
                "\n" +
                "8 butir bawang merah\n" +
                "4 siung bawang putih\n" +
                "4 buah cabai merah besar, bakar\n" +
                "8 buah cabai merah keriting, bakar\n" +
                "4 butir kemiri, sangrai", "Cara Membuat\n Lumuri ayam dengan air jeruk limau dan garam. Bakar sampai setengah matang. Sisihkan.\n" +
                "Panaskan minyak, tumis bumbu halus, daun salam, dan lengkuas sampai harum.\n" +
                "Masukkan santan, garam, gula merah, dan merica bubuk. Aduk rata. Masak sampai mendidih.\n" +
                "Masukkan ayam, kecilkan api. Masak sampai bumbu meresap dan semua bahan matang. Angkat.\n" +
                "Bakar ayam sambil diolesi sisa bumbu sampai harum dan kecokelatan. Angkat. Sajikan.", R.drawable.i_ayam_panggang_merah));
        indonesian_foods.add(new Indonesian_Food("NASI GORENG", "Bahan\n 1 piring nasi putih\n" +
                "2 buah sosis\n" +
                "kecap manis\n" +
                "kecap asin\n" +
                "garam\n" +
                "2 sdm mixed vegetables\n" +
                "1 sdm bawang merah goreng\n" +
                "mentega\n" +
                "1 siung bawang putih\n" +
                "1 butir telur\n" +
                "kaldu bubuk (opsional)\n" +
                "Pelengkap:\n" +
                "\n" +
                "Kerupuk\n" +
                "Mentimun, potong-potong", "Cara membuat:\n Geprek bawang putih lalu cincang dan potong sosis\n" +
                "Kocok lepas telur\n" +
                "Panaskan mentega hingga cair lalu masukkan telur, bawang putih dan sosis, tumis sebentar lalu masukkan nasi putih\n" +
                "Tuang kecap manis dan kecap asin secukupnya lalu goreng lagi kemudian beri sedikit garam,  dan satu sendok makan kaldu bubuk\n" +
                "Cicipi sedikit, jika kurang rasa bisa ditambah sedikit garam lagi.\n" +
                "Jika dirasa sudah pas, tuang nasi ke piring dan beri bawang goreng\n" +
                "Sajikan selagi hangat.", R.drawable.i_nasi_goreng));
        return indonesian_foods;
    }
    private static List<Timur_Tengah_Food> iniTimurTengahFood(Context ctx) {
        List<Timur_Tengah_Food> timur_tengah_foods = new ArrayList<>();
        timur_tengah_foods.add(new Timur_Tengah_Food("Samosa", "Bahan untuk kulit samosa:\n 250 gr tepung terigu\n" +
                "50 gr tepung tapioka\n" +
                "1 sdt garam\n" +
                "2 sdm margarin\n" +
                "air secukupnya\n" +
                "Bahan untuk isian samosa:\n" +
                "\n" +
                "250 gr daging sapi giling\n" +
                "1 buah wortel potong dadu\n" +
                "1 buah kentang potong dadu\n" +
                "3 siung bawang merah\n" +
                "3 siung bawang putih\n" +
                "1 sdt lada hitam bubuk\n" +
                "1/2 sdt pala bubuk\n" +
                "2 batang cengkih\n" +
                "1/2 sdt kapulaga bubuk\n" +
                "1 cm jahe\n" +
                "2 cm lengkuas\n" +
                "1 sdt garam\n" +
                "1 sdt saus tiram\n" +
                "1/2 sdt cabai bubuk", "Cara membuat isi samosa:\n Tumis wortel dan kentang yang telah dipotong kotak-kotak hingga empuk.\n" +
                "Masukkan bawang merah, bawang putih dan daging giling.\n" +
                "Taburkan lada hitam bubuk, pala bubuk, kapulaga bubuk, cabai bubuk dan garam.\n" +
                "Geprek jahe dan lengkuas. Ikut sertakan bersama tumisan daging.\n" +
                "Masukkan saus tiram dan matikan api ketika telah matang sempurna.\n" +
                "Cara membuat kulit dan memasak samosa:\n" +
                "\n" +
                "Masukkan tepung terigu, tepung tapioka, mentega dan garam dalam satu wadah baskom. Uleni hingga kalis dan sisihkan selama 30 menit.\n" +
                "Siapkan alat giling, bubuhkan dengan tepung terigu atau minyak agar tidak lengket. Giling tipis dan potong membentuk segitiga.\n" +
                "Bentuk kulit samosa yang telah dipotong segitiga dengan bentuk kerucut. Isi kulit samosa dengan tumisan isian yang telah tersedia. Setelah selesai rapatkan sisi bawah dengan bentuk tiga kaki.\n" +
                "Goreng dengan api kecil. Angkat samosa setelah matang dan renyah. Kriuuk!", R.drawable.t_samosa));
        timur_tengah_foods.add(new Timur_Tengah_Food("Chai Tea", "Bahan yang diperlukan:\n 1/2 sdt kayu manis bubuk\n" +
                "1 buah pekak/ kembang lawang\n" +
                "1/2 sdt jahe bubuk\n" +
                "2 buah kapulaga hijau\n" +
                "Sejumput bubuk pala\n" +
                "1 kantung teh celup\n" +
                "2 sdm susu kental manis\n" +
                "1 cangkir teh air panas", "Cara membuat\n Keprek kapulaga hijau, masukkan ke dalam cangkir teh.\n" +
                "Masukkan kayu manis bubuk, pekak, jahe bubuk, pala.\n" +
                "Masukkan susu kental manis dan tuangkan air panas ke dalam cangkir\n" +
                "celup teh, lalu angkat saat warna sudah agak coklat", R.drawable.t_chis_tea));
        timur_tengah_foods.add(new Timur_Tengah_Food("ROTI KHUBZ", "Bahan yang diperlukan:\n 250 gr tepung terigu\n" +
                "2 sdm susu bubuk putih\n" +
                "1 sdt gula pasir\n" +
                "5 gr ragi instan\n" +
                "1 sdm minyak\n" +
                "1 sdt garam\n" +
                "Air secukupnya", "Cara membuat\n Masukkan secangkir air bersama dengan gula dan ragi instan ke dalam sebuah baskom . Pastikan ragi aktif dengan ditandai adanya gelembung-gelembung kecil.\n" +
                "Masukkan tepung terigu, susu bubuk dan minyak. Uleni hingga kalis.\n" +
                "Diamkan adonan hingga mengembang selama 30 menit.\n" +
                "Setelah mengembang, taburkan garam dan uleni ulang.\n" +
                "Taburkan tepung di alat penggiling agar adonan tidak lengket, giling dengan membuat bulatan pipih. Kamu dapat mengukur ketebalan sesuka hati.\n" +
                "Nyalakan kompor dengan api lilin. Siapkan teflon tanpa diberi apa-apa.\n" +
                "Ketika teflon telah panas letakkan adonan. Bolak balik sampai kematangan yang diinginkan.", R.drawable.t_roti_khubz));
        timur_tengah_foods.add(new Timur_Tengah_Food("KOFTA", "Bahan yang dibutuhkan: \n 250 gr daging sapi giling\n" +
                "3 sdm tepung roti\n" +
                "1 butir telur\n" +
                "1 siung bawang bombay\n" +
                "2 lembar daun bawang\n" +
                "1/2 sdt pala bubuk\n" +
                "1/2 sdt lada hitam bubuk\n" +
                "Sejumput kayu manis bubuk\n" +
                "1 sdt garam\n" +
                "1/2 sdt basil kering\n" +
                "1 sdt cabai bubuk\n" +
                "Potongan keju mozarella sesuai selera", "Cara membuat\n Potong bawang bombay kecil-kecil dengan bentuk dadu.Tumis hingga harum dan layu.\n" +
                "Iris tipis daun bawang.\n" +
                "Campur daging sapi giling,daun bawang, telur, bawang bombay dan tepung roti di sebuah wadah.\n" +
                "Taburkan pala bubuk, lada hitam bubuk, kayu manis bubuk, cabai bubuk dan garam. Aduk hingga merata.\n" +
                "Buat adonan daging giling dengan bentuk bulat. Jangan lupa letakkan potongan keju mozarella di tengahnya.\n" +
                "Goreng kofta dengan api kecil. Angkat ketika berwana kecoklatan.", R.drawable.t_kofta));
        timur_tengah_foods.add(new Timur_Tengah_Food("NASI KEBULI", "Bahan-bahan:\n 250 gr beras pulen\n" +
                "1/2 ekor ayam kampung\n" +
                "Buntut sapi\n" +
                "2 butir kapulaga\n" +
                "1 batang serai\n" +
                "1 sdt pala halus atau bubuk\n" +
                "3 butir cengkeh\n" +
                "3 sdm menteg\n" +
                "8 siung bawang merah\n" +
                "5 siung bawang putih\n" +
                "1 sdt merica bulat\n" +
                "1 sdt jintan\n" +
                "1 sdm ketumbar\n" +
                "Jahe segar kira-kira 1cm\n" +
                "1/2 sdm garam\n" +
                "Bawang goreng (pelengkap)\n" +
                "Acar (pelengkap)\n" +
                "Kerupuk atau emping (pelengkap)", "Cara membuat:\n Haluskan bawang merah, bawang putih, merica bulat, jintan, ketumbar, jahe, kapulaga, serai, pala halus, cengkeh. Beri garam.\n" +
                "Bersihkan ayam, tuang air dalam panci, rebus ayam.\n" +
                "Ambil kaldu ayam tersebut.\n" +
                "Tuang sedikit minyak dalam penggorengan.\n" +
                "Masukkan bumbu yang telah dihaluskan, masak hingga harum.\n" +
                "Angkat dan masukkan ke kaldu ayam. aduk hingga semuanya rata.\n" +
                "Cuci beras pulen sesuai pilihan.\n" +
                "Masak beras dengan menggunakan kaldu ayam yang sudah dicampur dengan bumbu halus.\n" +
                "Tuang minyak dalam penggorengan, masukkan buntut sapi.Goreng hingga matang dengan menggunakan api sedang.\n" +
                "Tuang nasi dalam mangkok cetakan, letakkan di piring makan.\n" +
                "Tiriskan buntut goreng, letakkan di piring yang sama dengan nasi.\n" +
                "Tambahkan bawang goreng, kerupuk atau emping, dan acar kalo kamu suka", R.drawable.t_nasi_kebuli));
        timur_tengah_foods.add(new Timur_Tengah_Food("NASI BRIYANI", "Bahan yang dibutuhkan:\n 200 gr Daging kambing yang bersih dan sudah dipotong dadu\n" +
                "30 gr Kenari\n" +
                "65 gr Kurma yang dipotong-poton\n" +
                "3 buah cabe hijau iris Irisan\n" +
                "400 ml Yoghurt\n" +
                "450 ml Susu segar\n" +
                "1 sendok teh air jeruk nipis\n" +
                "Sedikit minyak untuk menumis\n" +
                "500 gr Beras yang sudah direndam dan dicuci bersih\n" +
                " \n" +
                "Bumbu yang dihaluskan:\n" +
                "\n" +
                "1/2 sendok teh Jinten\n" +
                "6 Butir bawang merah\n" +
                "1 Sendok teh Jahe bubuk\n" +
                "1/2 Sendok teh Cengkeh\n" +
                "3 Siung Bawang putih\n" +
                "Garam sesuai selera", "Cara memasak Nasi Briyani Kambing:\n Panaskan sedikit minyak dalam wajan lalu masukkan semua bumbu halus kedalamnya.Tunggu sampai tercium aroma harum sambil diaduk-aduk.\n" +
                "Masukkan beras yang sudah direndam kedalam bumbu tumis.\n" +
                "Masukkan juga daging kambing yang sudah dipotong-potong. Aduk-aduk sampai merata, lalu tuang susu dan tambahkan potongan kurma,serta kenari.\n" +
                "Aduk terus bahan tersebut seperti nasi liwet sampai benar-benar matang.\n" +
                "Masukkan cabe hijau iris dan air jeruk nipis sambil sedikit diaduk dan tutup bagian atasnya sebentar saja\n" +
                "Angkat nasi briyani yang sudah matang. Sajikan", R.drawable.nasi_biryani));
        return timur_tengah_foods;
    }
    private static List<Westren_Food> iniWestrenFood(Context ctx) {
        List<Westren_Food> westren_foods = new ArrayList<>();
        westren_foods.add(new Westren_Food("Lemon herd", "Bahan-Bahan\n - 2 Buah kentang ukuran sesuai selera\n" +
                "- 2 Sdm salted butter, lelehkan\n" +
                "- 3 Siung bawang putih, cincang\n" +
                "- 2 Sdm air perasan lemon\n" +
                "- 3 Sdm madu\n" +
                "- Sejumput garam\n" +
                "- 1 Sdm parsley\n" +
                "- 1/2 Sdt lada hitam", "\n Cara Membuat- Panaskan oven suhu 175 derajat celcius\n" +
                "- Siapkan loyang atau wadah tahan panas, lapisi dengan aluminium foil\n" +
                "- Cuci bersih kentang, jangan dikupas kulitnya\n" +
                "- Potong tipis kentang, namun jangan sampai patah\n" +
                "- Campur semua bahan aduk jadi satu sampai rata\n" +
                "- Oleskan ke kentang, pastikan tiap sela potongan terkena olesan bumbu\n" +
                "- Panggang suhu 175 derajat celcius selama 30 menit\n" +
                "- Oles lagi bumbu, kemudian panggang lagi selama 30 menit\n" +
                "- Sajikan", R.drawable.w_lemon_herp));
        westren_foods.add(new Westren_Food("Sopo tahu", "Bahan-bahan:\n - 2 Buah tegg tofu, potong-potong balur sedikit maizena lalu goreng\n" +
                "- 5 Buah jagung muda, iris serong\n" +
                "- 1 Batang wortel, iris serong tipis\n" +
                "- Siapkan 100 gr daging/seafood (bisa diganti sesuai selera)\n" +
                "- 5 Buah bakso ikan, iris\n" +
                "- 1 Batang daun bawang, iris\n" +
                "- 3 Siung bawang putih\n" +
                "- 1 Sdm saus tiram\n" +
                "- 2 Sdm kecap asin\n" +
                "- 1/2 Sdm kecap ikan\n" +
                "- 1 Sdm kecap manis\n" +
                "- Sedikit gula\n" +
                "- Secukupnya garam dan lada\n" +
                "- Air secukupnya\n" +
                "- 1 Sdt minyak wijen\n" +
                "- 1 Sdm maizena, larutkan dengan sedikit air", "Cara memasak:\n - Tumis bawang putih dengan minyak sampai harum, lalu masukkan daging/seafood sampai berubah warna\n" +
                "- Tambahkan bakso ikan, wortel, jagung muda\n" +
                "- Masukkan saus tiram, kecap asin, kecap ikan, kecap manis, air, gula, garam dan lada\n" +
                "- Masak hingga mendidih dan cicip rasa, tambahkan minyak wijen, daun bawang, lalu larutkan dengan larutan maizena", R.drawable.w_sopo_tahu));
        westren_foods.add(new Westren_Food("French toast", "Bahan-bahan\n " +
                "- Telur 1bh\n" +
                "- Vanili\n" +
                "- Gula pasir 1 sdm\n" +
                "- Susu cair plain", "Cara membuat:\n - Kocok telur, vanili, gula pasir dan susu cair\n" +
                "- Balurkan roti dalam adonan\n" +
                "- Panggang dalam margarin cair\n" +
                "- Masak hingga kecokelatan\n" +
                "- Sajikan dengan es krim", R.drawable.w_french_tost));
        westren_foods.add(new Westren_Food("Chicken cordon bleu", "Bahan-bahan:\n - 1 Buah dada ayam\n" +
                "- Buah daging asap\n" +
                "- Slice mozarella, bisa diganti dengan kraft quick melt\n" +
                "- 1 Butir telur\n" +
                "- Secukupnya garam\n" +
                "- Secukupnya lada\n" +
                "- Secukupnya tepung bumbu serbaguna\n" +
                "- Secukupnya potato flake, bisa diganti tepung panir", "Cara memasak:\n - Belah dua dada ayam, kemudian iris tipis dada ayam membelah dua tapi jangan sampai putus\n" +
                "- Pipihkan dengan pemukul daging, kalau tidak ada bisa pakai ulekan, pelan-pelan memukulnya supaya daging tidak hancur\n" +
                "- Taburi garam dan lada secukupnya secara merata\n" +
                "- Taruh daging asap di atas dada ayam, lalu keju kemudian gulung. Sematkan tusuk gigi supaya gulungannya tidak terbuka\n" +
                "- Balur dengan tepung bumbu serba guna secara merata\n" +
                "- Celupkan ke dalam telur yang sudah dikocok secara merata, kemudian balur dengan potato flake atau tepung panir secara merata\n" +
                "- Simpan ayam ke dalam kulkas minimal 1 jam\n" +
                "- Goreng ayam menggunakan teknik deep fried atau dengan minyak banyak, pastikan minyak sudah panas dan menggunakan api kecil, goreng sampai berwarna cokelat keemasan\n" +
                "- Chicken cordon bleu siap disajikan dengan kentang goreng, sayuran dan brown sauce", R.drawable.chicken_cardob_blue));
        westren_foods.add(new Westren_Food("Garden veggie chickpea sandwich.",
                "Bahan-bahan:\n - Siapkan 15 ons kacang chickpea kaleng\n" +
                        "- 3 Batang daun bawang, cincang halus\n" +
                        "- 2 Batang seledri, cincang halus\n" +
                        "- 1/4 Wortel, parut\n" +
                        "- 1/4 Paprika cincang\n" +
                        "- 1/4 Acar cincang\n" +
                        "- 1/4 Cup mayones rendah lemak (bisa menggunakan mayones vegan)\n" +
                        "- 1-2 Sendok teh mustard\n" +
                        "- 1/8 Dill kering (optional)\n" +
                        "- 1/8 Sendok teh garam\n" +
                        "- 1/8 Sendok teh lada hitam\n" +
                        "- 3 Sendok makan biji bunga matahari tanpa garam\n" +
                        "- 2 Sendok makan daun basil cincang\n" +
                        "\n" +
                        "Bahan sandwich:\n" +
                        "- Roti gandum\n" +
                        "- Selada\n" +
                        "- Daun basil (optional)\n" +
                        "- Tomat (optional)\n" +
                        "- Bawang bombay (optional)\n" +
                        "- Olesan untuk sandwich (bisa mayones mustard pedas, dan saus tomat)", "Cara memasak:\n - Masukkan kacang chickpea ke dalam mangkuk besar, kemudian tumbuk menggunakan potato smasher atau bisa dengan food processor\n" +
                "- Tuang daun bawang, wortel parut, seledri, acar, dan lada hitam ke dalam mangkuk. Aduk hingga rata\n" +
                "- Tambahkan mayones, mustard, dill, garam, biji bunga matahari, dan lada\n" +
                "- Tata lembaran roti gandum, letakkan daun basil, dan selada sesuai keinginan\n" +
                "- Tuang isian sandwich secukupnya, dan tutup kembali dengan lembaran roti", R.drawable.w_garden_veggie_chickpea_sandwich));
        westren_foods.add(new Westren_Food("Rosemary chicken with sauteed vegetables", "Bahan-Bahan\n - Fillet ayam paha/dada\n" +
                "- Jagung pipil\n" +
                "- 1 Batang wortel potong korek api\n" +
                "- Garam\n" +
                "- Merica\n" +
                "- Lada butir\n" +
                "- Rosemary\n" +
                "- Thyme", "Cara memasak:\n - Bumbui ayam dengan garam, lada butir, rosemary dan thyme\n" +
                "- Panaskan panggangan/teflon dengan butter lalu grill ayam hingga matang\n" +
                "- Panaskan wajan dengan sedikit butter lalu tumis jagung dan wortel, tambahkan sedikit air dan bumbui lalu masak hingga matang\n" +
                "- Sajikan", R.drawable.w_rosemary_chicken_with_sauteed_vegetables));
        westren_foods.add(new Westren_Food("Spicy tuna roll.", "Bahan-bahan\n - Siapkan 5 ons ikan tuna cincang\n" +
                "- 1 Sendok makan saus sriracha (saus pedas Thailand)\n" +
                "- 1/2 Sendok teh minyak cabai\n" +
                "- 1/2 Sendok teh rice vinegar\n" +
                "- 2 Sendok makan bawang daun cincang\n" +
                "- 1,5 Sendok makan mayones rendah lemak\n" +
                "- 6 Lembar nori\n" +
                "- 1,5 Cup nasi Jepang", "Cara membuat:\n - Campur daging tuna, saus sriracha, minyak cabai, rice vinegar, bawang daun cincang, dan mayones\n" +
                "- Siapkan tatami atau sushi roller, letakkan lembaran nori di atas tatami. Tambahkan nasi di atas rumput laut dan sebarkan hingga 1/4 bagian nori. Usahakan jangan terlalu tebal\n" +
                "- Letakkan tuna di tengah nasi\n" +
                "- Gulung perlahan, dan beri sedikit air di ujung lembaran nori untuk merekatkan\n" +
                "- Potong gulungan sushi menjadi beberapa bagian\n" +
                "- Sajikan di piring bersama kecap asin atau wasabi", R.drawable.w_spicy_tuna_roll));
        westren_foods.add(new Westren_Food("Chickpea salad with lemon, tuna, and olives.", "Bahan-bahan\n - Siapkan 15 ons kacang chickpea\n" +
                "- 1 Kaleng tuna\n" +
                "- 1/2 Cup buah zaitun Kalamata, cincang kasar\n" +
                "- 1/3 Cup bawang bombay cincang kasar\n" +
                "- 1/4 Cilantro, cincang kasar\n" +
                "- 1/2 Sendok teh garam\n" +
                "- 1 Sendok makan perasan lemon\n" +
                "- 2 Sendok makan minyak zaitun\n" +
                "- Lada hitam secukupnya", "Cara-masak\n - Campur semua bahan di satu mangkuk besar\n" +
                "- Sajikan dengan roti Prancis panggang", R.drawable.w_chicpea_salad_widt_lemon_tuna_and_olives));
        westren_foods.add(new Westren_Food("Sun dried tomato basil pasta.", "Bahan-bahan\n - 1 Kotak pasta atau spaghetti (varian bisa disesuaikan)\n" +
                "- 1/4 Tomat sun dried cincang (Tomat Italia yang sudah dikeringkan dengan matahari dan direndam dalam minyak)\n" +
                "- 1/2 Sendok makan bawang putih cincang\n" +
                "- 1 Sendok makan cuka balsamic\n" +
                "- 1/2 Cup daun basil, cincang kasar\n" +
                "- 1/2 Buah bawang bombay ukuran medium, potong tipis\n" +
                "- 1/3 Cup minyak zaitun\n" +
                "- 3 Sendok makan susu almond tawar\n" +
                "- 1/4 Sendok teh garam\n" +
                "- 1/8 Sendok teh lada", "Cara memasak:\n - Rebus spaghetti hingga matang, tiriskan\n" +
                "- Masukkan semua bahan ke dalam blender hingga menjadi pasta\n" +
                "- Siapkan panci saus dan panaskan minyak zaitun\n" +
                "- Tumis bawang bombay hingga harum\n" +
                "- Masukkan pasta yang sebelumnya sudah dibuat, tambahkan daun basil, cincangan tomat kering, dan juga spaghetti\n" +
                "- Aduk hingga rata, dan sajikan di atas piring", R.drawable.w_sun_dried_tomato_basil_pasta));
        westren_foods.add(new Westren_Food("Spanish chickpea and spinach stew.", "Bahan-bahan:\n - 2 Sendok makan atau 30 ml minyak zaitun\n" +
                "- 3 Siung bawang putih, cincang halus\n" +
                "- 3 Siung bawang merah, cincang halus\n" +
                "- 1/2 Buah bawang bombay ukuran sedang\n" +
                "- Jinten bubuk secukupnya\n" +
                "- 1,5 Sendok teh paprika bubuk\n" +
                "- 1/2 Cabai bubuk\n" +
                "- 1/2 Sendok teh garam\n" +
                "- 2-3 Sendok teh gula merah\n" +
                "- Lada hitam secukupnya\n" +
                "- 2 x 400 gram tomat kaleng (atau bisa membuat pasta tomat sendiri)\n" +
                "- 1,5 Cup kacang chickpea yang sudah direbus\n" +
                "- 200 gram bayam\n" +
                "- Kacang almond secukupnya\n" +
                "- Nasi merah (bisa diganti nasi putih secukupnya)", "Cara memasak:\n - Panaskan minyak di atas panci antipanas, lalu tumis bawang bombay hingga harum. Masukkan bawang putih dan lanjut tumis hingga kecokelatan\n" +
                "- Tambahkan bubuk jinten, bubuk paprika, bubuk cabai, dan garam. Tumis hingga rata\n" +
                "- Tuang tomat kaleng lalu masak dengan api kecil sampai mengental\n" +
                "- Taburkan bubuk lada hitam, aduk sebentar, lalu masukkan kacang chickpea\n" +
                "- Masukkan daun bayam ke dalam panci, lalu tutup panci selama 3 menit. Aduk sebentar lalu matikan api\n" +
                "- Sajikan dengan nasi", R.drawable.w_spanish_chickpea_and_spinach_stew));
        return westren_foods;
    }


    private static void initAllMasakan(Context ctx) {
        masakans.addAll(initCoktail(ctx));
        masakans.addAll(initMocktail(ctx));
        masakans.addAll(initIndonesianFoos(ctx));
        masakans.addAll(iniTimurTengahFood(ctx));
        masakans.addAll(iniWestrenFood(ctx));
    }

    public static List<Masakan> getMasakansByTipe(Context ctx, String jenis) {
        List<Masakan> masakansByType = new ArrayList<>();
        if (masakans.size() == 0) {
            initAllMasakan(ctx);
        }
        for (Masakan h : masakans) {
            if (h.getMasakan().equals(jenis)) {
                masakansByType.add(h);
            }
        }
        return masakansByType;
    }
}
