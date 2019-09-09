package com.example.dheo.SubmissionRecyclerView.utils;

import com.example.dheo.SubmissionRecyclerView.model.Animal;

import java.util.ArrayList;

public class AnimalsData {
    public static String[][] data = new String[][]{
            {"Komodo", "Komodo atau Varanus Komodoensis merupakan hewan asli Indonesia yang tepatnya dari pulau Komodo ini sangat popular di dunia. Saat ini habitat komodo di alam bebas sudah mulai berkurang dan hanya tinggal beberapa ratus ekor saja. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Komodo.jpg"},
            {"Macan tutul amur", "Macan tutul amur ini memiliki bulu khas yang sangat indah dan juga tebal. Hewan ini berasal dari Rusia. Karena pemburuan tersebutlah yang membuat hewan ini semakin  langka di Rusia, hanya tersisa kurang lebih 30 ekor saja di dunia. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Macan-tutul-amur.jpg"},
            {"Gorilla dataran rendah", "Hewan ini sering diburu oleh para pemburu yang tidak bertanggung jawab. Hewan ini diburu bukan untuk diambil bulu atau kulitnya, akan tetapi untuk diambil dagingnya untuk dijadikan bahan makanan sehingga membuat hewan ini menjadi langka. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Gorilla-dataran-rendah.jpg"},
            {"Saola", "Saola atau sering disebut dengan Unicorn Asia ini merupakan salah satu hewan langka yang terancam punah. Para ahli menyatakan bahwa hewan ini sekarang keberadaannya hanya beberapa puluh ekor saja dan akan diperkirakan akan punah jika tidak ada penanganan khusus untuk mengembangbiakkan hewan ini. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Saola.jpg"},
            {"Ikan vaquita", "Ikan vaquita adalah ikan asal teluk California, ikan ini sangat mirip dengan ikan lumba-lumba, namun di antaranya tetap berbeda. Ikan  Vaquita merupakan satwa laut langka yang terancam punah, saat ini hanya tersisa sekitar 100 ekor saja. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Ikan-vaquita.jpg"},
            {"Harimau Siberia", "Jika Indonesia mempunyai Harimau Sumatra,  maka Siberia juga memiliki Harimau endemik di negaranya. Harimau ini biasanya dijuluki dengan sebutan Harimau Amur. Harimau Siberia adalah satu-satunya harimau terbesar di dunia. Saat ini populasinya kurang lebih sekitar 400 hingga 500 ekor saja. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Harimau-Siberia.jpg"},
            {"Badak hitam", "Badak hitam ini adalah hewan purba yang masih hidup sampai sekarang. Habitat badak hitam ini ada di afrika. Menurut data penelitian oleh ilmuan, di habitat liarnya saat ini hanya tinggal sedikit saja. Populasinya saat ini hanya sekitar 4.800 ekor. Belum diketahui pasti jumlah tersebut, bisa jadi lebih sedikit atau lebih banyak. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Badak-hitam.jpg"},
            {"Penyu belimbing", "Habitat asli penyu belimbing ini ada di Indonesia tepatnya di daerah Papua Barat. Kasus yang menyebabkan semakin berkurangnya hewan tersebut bukanlah disebabkan oleh pemburuan liar, akan tetapi disebabkan oleh kualitas air laut yang semakin memburuk. Apa lagi tiap tahunnya penyu belimbing ini melakukan migrasi yaitu dari satu tempat pindah ke tempat lainnya. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Penyu-belimbing.jpg"},
            {"Lemur bambu besar", "Madagascar yang dulunya dipenuhi oleh lemur bambu besar saat ini ternyata populasinya mulai berkurang. Lebih tepatnya di Madagascar bagian tenggara. Saat ini hanya tersisa sekitar 200 ekor saja. Yang menyebabkan berkurangnya spesies ini adalah karena perubahan iklim yang sangat ekstrim. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Lemur-bambu-besar.jpg"},
            {"Tupai jepang", "Seperti namanya, tupai ini memang berasal dari negara jepang. Nama latin tuapi ini adalah Sciurus lis, tupai ini merupakan spesies endemik jepang. Penyebaran tupai ini yaitu di pulau Honsu, Kyushu, dan Shikoku. Dari survei yang diakukan peneliti jepang menyatakan bahwa tupai di Honshu bagian barat daya sudah berkurang spesiesnya. Yang lebih parahnya lagi tupai yang ada di pulau Kyushu justru sudak ada lagi spesiesnya. Penyebab dari berkurangnya spesies ini adalah habitat mereka yang diusik oleh manusia untuk pembangunan. ", "https://moondoggiesmusic.com/wp-content/uploads/2018/09/Tupai-jepang.jpg"},
     };
    public static ArrayList<Animal> getListData(){
        ArrayList<Animal> list = new ArrayList<>();
        for (String[] aData : data) {
            Animal animal = new Animal();
            animal.setName(aData[0]);
            animal.setDetail(aData[1]);
            animal.setPhoto(aData[2]);
            list.add(animal);
          }
            return list;
        }
     }
