

Graph

Tim Ajar Algoritma dan Struktur Data

Genap 2021/2022





Tujuan

● Mahasiswa memahami definisi Graf dan terminologinya

● Mahasiswa mampu memodelkan permasalahan di dunia nyata menggunakan Graf

● Mahasiswa mampu merepresentasikan struktur data Graf





Outline

● Graf, sejarah Graf, Definisi istilah pada Graf

● Contoh Graf

● Representasi Graf





Graf

● Graph digunakan untuk merepresentasikan objek-objek diskrit dan hubungan antara

objek-objek tersebut

● Gambar di bawah ini merepresentasikan jalan dan jarak antar kota di provinsi Jawa Tengah

Rembang

Kudus

Brebes

Demak

Tegal

Slawi

Pemalang

Kendal

Semarang

Salatiga

Pekalongan

Blora

Purwodadi

Sragen

Temanggung

Wonosobo

Purbalingga

Purwokerto

Kroya

Banjarnegara

Boyolali

Solo

Sukoharjo

Kebumen

Cilacap

Magelang

Klaten

Purworejo

Wonogiri





Sejarah Graf

● Jembatan Königsberg tahun 1973

● Graf yang merepresentasikan jembatan KÖnigsberg:

vertex (titik) à menyatakan daratan

edge

(tepi/ garis) à menyatakan jembatan

C

Bisakah melalui setiap jembatan tepat sekali dan kembali lagiAke titik semula?

D

B





Definisi Graf

Graph G = (V, E) adalah suatu sistem himpunan berhingga tak kosong V(G) dan himpunan E(G)

(mungkin kosong) yang elemen-elemennya merupakan himpunan pasangan tak berurut 2

elemen berbeda dari V(G)

Graph G = (V, E), yang dalam hal ini:

V

= himpunan tidak-kosong dari titik-titik (vertices)

= {a, b, … , vn }

E

= himpunan garis (edges) yang mengubungkan titik-titik

= {ꢀ , ꢀ , ... , ꢀ } atau {(a,b) (a,c) (n, n)}

!

"

\#





Istilah pada Graf

●

●

●

Vertex (Titik atau simpul)

Titik dalam graph disebut dengan vertex. Biasanya disimbolkan dengan bentuk lingkaran .

Edge (Garis atau sisi atau tepi)

Garis-garis penghubung antar titik dalam graph disebut dengan garis (edge)

Adjacency (Bertetangga)

Dua titik (vertex) dinamakan bertetangga (adjacent) jika saling terhubung melalui satu garis

(edge).

●

Path (Lintasan)

Path atau intasan adalah representasi sebuah jalan dari satu titik ke titik lainnya.





Contoh

Graf G

v1, v2, v3, v4, v5, v6 adalah titik

e , e , e , e , e , e adalah garis

1

2

3

4

5

6

v1 bertetangga dengan v2, v3 dan v4

v2 tidak bertetangga dengan v3, v5 dan v6

Path dari v4 ke v6 yaitu

v4 à v2 à v1 à v3 à v6

Path dari v4 ke v6 bisa juga

v4 à v1 à v3 à v6

Path terkecil biasa disebut the shortest path





Istilah pada Graph

● Terhubung (Connected)

Suatu graph dikatakan connected jika ada setidaknya satu garis (edge)

antara satu titik (vertex) ke titik lainnya. Gambar 1 adalah contoh

connected graph. Sedangkan graph tidak terhubung (unconnected graph)

jika satu atau lebih titik-titiknya tidak terhubung ke titik-titiknya lainnya.





Istilah pada Graph

●

Directed Graph dan Weighted Graph

Directed and weighted Graph adalah graph dengan garis antar titik yang memiliki arah dan

mempunyai bobot.





Istilah pada Graph

●

Degree (derajat), in-degree dan out-degree

Degree sebuah titik adalah jumlah busur yang incident (terkait)

dengan titik tersebut.

Atau jumlah garis yang terkait dengan titik tersebut.

○

○

In-degree sebuah titik pada graph berarah adalah jumlah

busur yang kepalanya incident dengan titik tersebut, atau

jumlah busur yang “masuk” atau menuju titik tersebut.

Out-degree sebuah titik pada graph berarah adalah jumlah

busur yang ekornya incident dengan titik tersebut, atau

jumlah busur yang “keluar” atau berasal dari titik tersebut.

Din (A) = 1

Dout(A) = 2

○ Dinotasikan d(v)





Jenis representasi graph

● Adjacency list

Adjacency list menggunakan suatu array pada linked list. Array tersebut digunakan untuk

menyimpan jumlah vertex. Nilai pada linked list dapat digunakan untuk menyimpan bobot

graph.

● Adjacency matrix

Adjacency matrix merupakan array 2D dengan size V x V dimana V adalah jumlah titik pada

graph. Jika adj[i][j] = 1 dapat diartikan terdapat suatu garis (edge) pada titik i ke titik j.





Adjacency list undirected graph





Graph dan matrix adjacency directed graph





Representasi Graph dalam bentuk Linked List

● Adjency List graph tak berarah/berarah

● Digambarkan sebagai sebuah vertex yang memiliki 2 pointer (pointer titik dan pointer garis)





Contoh(1)-Adjacency Undirected Graph

● untuk vertex A, memiliki 2 garis yang terhubung yaitu e1 dan e2





Contoh(1)

● Bentuk yang lebih sederhana dari contoh 1





Contoh(2)-Adjacency Directed Graph





Contoh(3)-Directed and Weighted Graph

12





Latihan 1

● Ubahlah Graf berikut ke dalam bentuk matriks





Latihan 2

● Ubahlah matriks berikut ke dalam bentuk Graf





Latihan 3

● Ubahlah matriks berikut ke dalam bentuk Graf

e1

1

e2

1

e3

0

e4

1

e5

1

e6

0

e7

0

e8

0

V1

V2

V3

V4

V5

1

0

1

0

0

0

0

0

0

1

1

0

0

1

1

0

0

0

0

1

0

1

0

1

0

0

0

0

0

0

0

1





Terima Kasih ☺

