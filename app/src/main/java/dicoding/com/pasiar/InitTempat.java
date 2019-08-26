package dicoding.com.pasiar;

import java.util.ArrayList;
import java.util.List;

import dicoding.com.pasiar.model.wisata;

public class InitTempat {
    private List<wisata> wisataList = new ArrayList<>();

    public InitTempat(){
        wisata w1 = new wisata();
        w1.setId_t4w(1);
        w1.setNama_t4w("Pantai Kolbano");
        w1.setLokasi("Kab. TTS, Kec. Amanuban Selatan");
        w1.setJarak(80);
        w1.setFasilitas("-");
        w1.setKeterangan("Merupakan salah satu Tempat Wisata Keren Di Kabupaten Timor Tengah Selatan yang dapat " +
                "Anda kunjungi dan nikmati. Pantai yang berjarak sekitar 80 kilometer dari kota Sue ini masih " +
                "sangat asri dan alami. Di pantai ini Anda akan disuguhkan dengan pesona pantai yang " +
                "sangat indah. Di pantai yang terkenal dengan kerikil seribu warna ini juga terdapat sebuah " +
                "bongkahan batu besar berbentuk seperti kepala singa (Fatu Un) yann menjadi simbol dari Pantai Kolbano.");
        w1.setGambar(R.drawable.kolbano_1);
        w1.setAllImg(new int[]{R.drawable.kolbano_1, R.drawable.kolbano_2, R.drawable.kolbano_3});

        wisata w2 = new wisata();
        w2.setId_t4w(2);
        w2.setNama_t4w("Pantai Oetune");
        w2.setLokasi("Kab. TTS, Kec. Amanuban selatan");
        w2.setJarak(70);
        w2.setFasilitas("Tempat parkir, Lopo (tempat berteduh), Toilet");
        w2.setKeterangan("Jika Anda ingin mencari ketenangan dan kenyamanan saat berlibur, Pantai Oetune sangat " +
                "cocok buat Anda dan keluarga. Salah satu Tempat Wisata Keren Di Kabupaten Timor Tengah Selatan " +
                "ini menyajikan hamparan pasir putih pantai sepanjang puluhan kilometer bagaikan pasir ditengah " +
                "gurun. Selain memiliki hamparan pasir putih yang sangat luas, Pantai ini juga sangat cocok " +
                "sebagai tempat selancar (surfing) karena selain memiliki air laut yang jernih dan bersih, " +
                "Ombak di pantai ini bisa mencapai ketinggian 4-7 meter.");
        w2.setGambar(R.drawable.oetune_3);
        w2.setAllImg(new int[]{R.drawable.oetune_1, R.drawable.oetune_2, R.drawable.oetune_3 });

        wisata w3 = new wisata();
        w3.setId_t4w(3);
        w3.setNama_t4w("Gunung Marmer Fatumnasi");
        w3.setLokasi("Kab. TTS, Kec. Mollo Utara");
        w3.setJarak(35);
        w3.setFasilitas("-");
        w3.setKeterangan("Alam Futumnasi merupakan kawasan konservasi sumber daya alam Kabupaten Timor Tengah Selatan, " +
                "Provinsi Nusa Tenggara Timur juga memiliki tempat wisata Gunung Marmer Futumnasi yang sangat indah, " +
                "masih asri dan alami. Tempat ini menyajikan alam pegunungan yang sangat mempesona. " +
                "sejuk dan nyaman sebagai tempat berlibur. Selain memiliki pemandangan yang eksotis." +
                "Hal-hal menarik yang dapat Anda jumpai di Gunung Marmer Futumnasi mulai dari hutannya yang lebat, " +
                "padang rumput yang luas, bebatuan yang unik dan gagahnya puncak Mutis. \n" +
                "Di Gunung Marmer Futumnasi juga terdapat tumbuhan langka Bonsai Alam yang telah berusia ratusan " +
                "tahun serta sederatan gunung batu yang sangat indah seperti Fatu Kolen, Benteng Dua Putri, " +
                "Fatu Nausus dan Fatu Taapan.");
        w3.setGambar(R.drawable.fatumnasi_1);
        w3.setAllImg(new int[]{R.drawable.fatumnasi_1, R.drawable.fatumnasi_2, R.drawable.fatumnasi_1});

        wisata w4 = new wisata();
        w4.setId_t4w(4);
        w4.setNama_t4w("Pegunungan Fatunausus");
        w4.setLokasi("Kab. TTS, Kec. Mollo Utara");
        w4.setJarak(28);
        w4.setFasilitas("Home Stay");
        w4.setKeterangan("Di sini Anda juga dapat melihat batu besar berbentuk candi yang merupakan tempat " +
                "persembahyangan bagi masyarakat Suku Mollo yang berdomisili di sekitar batu tersebut. " +
                "Berada pada ketinggian 1.500 mdpl, Anda juga akan disuguhkan panorama alam pegunungan serta " +
                "lembah yang cantik memesona. Udaranya yang sejuk dan suasananya yang tenang akan membuat Anda " +
                "merasa nyaman berlibur ke tempat ini.");
        w4.setGambar(R.drawable.fatumnasi_2);
        w4.setAllImg(new int[]{R.drawable.fatunausus_1, R.drawable.fatunausus_2, R.drawable.fatunausus_3});

        wisata w5 = new wisata();
        w5.setId_t4w(5);
        w5.setNama_t4w("Kampung Adat & Benteng None");
        w5.setLokasi("Kab. TTS, Kec. Kuatnana");
        w5.setJarak(17);
        w5.setFasilitas("Penginapan");
        w5.setKeterangan("Di Kabupaten Timor Tengah Selatan juga terdapat benteng bekas peninggalan Belanda yang bernama " +
						"Benteng None. Benteng pertahanan Adat None pada zaman melawan penjajahan Belanda ini terbuat "+
						"dari batu alam dan sejenis tumbuhan berduri (Naus) yang ditanam berjejer sepanjang 1 kilometer. "+
						"Sementara pada sisi lainnya terdapat jurang yang sangat terjal. Dia tempat ini Anda bisa "+
						"melakukan aktivitas selfie dengan latarbelakang benteng yang aeolah-olah membawa "+
						"Anda ke masa lampau.");
        w5.setGambar(R.drawable.benteng_none_1);
        w5.setAllImg(new int[]{R.drawable.benteng_none_1, R.drawable.benteng_none_2, R.drawable.benteng_none_1});

        wisata w6 = new wisata();
        w6.setId_t4w(6);
        w6.setNama_t4w("Air Terjun Oehala");
        w6.setLokasi("Kab. TTS, Kec. Mollo Selatan");
        w6.setJarak(10);
        w6.setFasilitas("Tempat parkir, Lopo (tempat berteduh), Toilet");
        w6.setKeterangan("Air Terjun Oehala yang terletak di Desa Oehala, Kota Soe, Kecamatan Mollo Selatan, " +
                "Kabupaten Timor Tengah Selatan, Provinsi Nusa Tenggara Timur. Air terjun yang memiliki tujuh " +
                "tingkatan ini memiliki air yang cukup deras dan sangat dingin yang berasal Gunung Mutis."+
                "\nDi air terjun ini Anda bisa berenang dibawah masing-masing tingkatannya yang berbentuk kolam " +
                "penampungan air. Selain merasakan segarnya air kolam, Anda juga dapat menikmati panorama hijau " +
                "pegunungan Gunung Mutis yang sangat indah memesona.  ");
        w6.setGambar(R.drawable.oehala_1);
        w6.setAllImg(new int[]{R.drawable.oehala_1, R.drawable.oehala_2, R.drawable.oehala_3});
		
		wisata w7 = new wisata();
        w7.setId_t4w(7);
        w7.setNama_t4w("Cagar Alam Mutis");
        w7.setLokasi("Kab. TTS, Kec. Fatumnasi");
        w7.setJarak(30);
        w7.setFasilitas("-");
        w7.setKeterangan("Cagar Alam Gunung Mutis (2.427 mdpl) yang terletak di Kecamatan Fatumnasi dan Kecamatan Tobu, "+
						"Kabupaten Timor Tengah Selatan. Walaupun Pulau Timor terkenal dengan alamnya yang gersang dan "+
						"udaranya yang panas, Namun dibalik itu semua Pulau Timor juga menyimpan keindahan alam yang sangat "+
						"keren dan menakjubkan. "+
						"\nDi Cagar Alam Gunung Mutis Anda bisa melihat dan menikmati panorama hutan hijau yang luas dengan "+
						"pepohonan yang menjulang tinggi dan aneka satwa endemik khas Timor seperti Rusa Timor, Kuskus, "+
						"Babi Hutan, Biawak Timor, Ular Sanca Timor, Ayam Hutan, Punai Timor, Betet Timor, Pergam Timor, "+
						"Perkici Dada Kuning dan lain sebagainya.");
        w7.setGambar(R.drawable.mutis_2);
        w7.setAllImg(new int[]{R.drawable.mutis_1, R.drawable.mutis_2, R.drawable.mutis_3});
		
		wisata w8 = new wisata();
        w8.setId_t4w(8);
        w8.setNama_t4w("Desa Boti");
        w8.setLokasi("Kab. TTS, Kec. Kie");
        w8.setJarak(40);
        w8.setFasilitas("-");
        w8.setKeterangan("Suku boti merupakan salah satu suku di Kabupaten TTS yang masih memegang teguh tradisi nenek moyangnya. " +
                "Suku Boti merupakan keturunan dari suku asli pulau Timor, Atoni Metu. Secara administratif kini menjadi " +
                "desa Boti kecamatan Kie. Karena letaknya yang sulit dicapai di tengah pegunungan, desa Boti seakan tertutup " +
                "dari peradaban modern dan perkembangan zaman. Kehidupan sehari-hari suku boti masih sangat tradisional dan " +
                "jauh dari peradaban kehidupan sekarang yang serba modern. Tradisi dan kehidupan suku boti inilah yang " +
                "membuat daya tarik wisata yang bernilai luar biasa dimana sering di kunjungi baik dari wisatawan lokal " +
                "dan wisatawan luar negeri maupun dari media cetak atau media elektronik yang ingin meliput kehidupan " +
                "dan tradisi budaya yang masih tradisional yang turun temurun dari nenek moyangnya dan kepercayaan asli " +
                "orang timor yaitu animisme.");
        w8.setGambar(R.drawable.boti_1);
        w8.setAllImg(new int[]{R.drawable.boti_1, R.drawable.boti_2, R.drawable.boti_3});
		
		wisata w9 = new wisata();
        w9.setId_t4w(9);
        w9.setNama_t4w("Fatukopa");
        w9.setLokasi("Kab. TTS, Kec. Fatukopa");
        w9.setJarak(57);
        w9.setFasilitas("-");
        w9.setKeterangan("Fatukopa sesungguhnya adalah sebuah bukit karang dengan sedikit vegetasi khas hutan hujan tropis. " +
                "Nama kecamatan (dan desa) di mana bukit batu itu terletak dinamakan pula Fatukopa. Kini warga kecamatan " +
                "Fatukopa tersebar 7-8 km di sekitar gunung batu tersebut, dari Timur, Barat, Utara dan Selatan. " +
                "Untuk kepentingan wisata, masyarakat sekitar paling-paling, membawa wisatawan, memandang bukit tersebut " +
                "dari kejauhan. Memang dengan pandangan jauh, bukit batu itu akan terasa sekali bentuk kapal karamnya.");
        w9.setGambar(R.drawable.fatukopa_1);
        w9.setAllImg(new int[]{R.drawable.fatukopa_1, R.drawable.fatukopa_2, R.drawable.fatukopa_1});
		
		wisata w10 = new wisata();
        w10.setId_t4w(10);
        w10.setNama_t4w("Fatuulan");
        w10.setLokasi("Kab. TTS, Kec. Kie");
        w10.setJarak(60);
        w10.setFasilitas("-");
        w10.setKeterangan("Kalau dalam bahasa Dawan Timor, Fatuulan berarti batu (fatu) dan hujan (ulan). Jika digabungkan " +
                "berarti batu hujan. Nama ini menggambarkan kondisi jalan setempat dengan batu besar yang lembab. " +
                "Kondisi ini mendominasi daerah perkampungan sekitar.\n" +
                "\n Meski perjalanannya menantang, pemandangan di desa ini benar-benar bagus! Destinasi ini sangat cocok untuk " +
                "kamu yang sesekali ingin menjauh dari keramaian kota.");
        w10.setGambar(R.drawable.fatuulan_2);
        w10.setAllImg(new int[]{R.drawable.fatuulan_1, R.drawable.fatuulan_2, R.drawable.fatuulan_3});

        wisataList.add(w1);
        wisataList.add(w2);
        wisataList.add(w3);
        wisataList.add(w4);
        wisataList.add(w5);
        wisataList.add(w6);
        wisataList.add(w7);
        wisataList.add(w8);
        wisataList.add(w9);
        wisataList.add(w10);
    }
    public wisata getWisata(int row){
        return wisataList.get(row);
    }
    public List<wisata> getAllWisata(){
        return wisataList;
    }
}
