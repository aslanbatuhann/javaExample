Proje 2
[16,21,11,8,12,22] -> Merge Sort

Yukarıdaki dizinin sort türüne göre aşamalarını yazınız?
Big-O gösterimini yazınız?


Adım 1: Diziyi ikiye böl.
[16, 21, 11] | [8, 12, 22]

Adım 2: Her iki parçayı da aynı yöntemle bölme işlemini tekrarla.
[16] | [21, 11]
[16] | [21] | [11]

[8, 12] | [22]

Adım 3: Tek elemanlı parçalar artık sıralıdır, şimdi birleştirme adımına geçebiliriz.

Adım 4: İki elemanlı parçaları birleştir.
[16] | [11, 21]
[8, 12] | [22]

Adım 5: Dört elemanlı parçaları birleştir.
[11, 16, 21] | [8, 12, 22]

Adım 6: Tüm parçaları birleştir.
[8, 11, 12, 16, 21, 22]

Artık dizimiz sıralı hale geldi.

Big-O gösterimi, Merge Sort'un ortalama ve en kötü durum karmaşıklığı O(n log n)'dir.


[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.
.



[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.



Insertion Sort, bir elemanı doğru konumuna ekleyerek sıralama işlemini gerçekleştiren bir algoritmadır.

Verilen dizi: [22, 27, 16, 2, 18, 6]

Adım 1: [22] | [27, 16, 2, 18, 6]
Adım 2: [22, 27] | [16, 2, 18, 6]
Adım 3: [16, 22, 27] | [2, 18, 6]
Adım 4: [2, 16, 22, 27] | [18, 6]
Adım 5: [2, 16, 18, 22, 27] | [6]
Adım 6: [2, 6, 16, 18, 22, 27]

Dizi sıralanmış hale geldi.

Big-O gösterimi, Insertion Sort'un ortalama ve en kötü durum karmaşıklığı O(n^2)'dir.

Dizi: [22, 27, 16, 2, 18, 6] içinde 18 sayısı, sıralandıktan sonra Average case kapsamına girer. Çünkü ortalama durumda aradığımız sayının ortada olma ihtimali diğer durumlardan daha yüksektir.

[7, 3, 5, 8, 2, 9, 4, 15, 6] dizisinin Selection Sort'a göre ilk 4 adımı:

Adım 1: [2] | [3, 5, 8, 7, 9, 4, 15, 6]
Adım 2: [2, 3] | [5, 8, 7, 9, 4, 15, 6]
Adım 3: [2, 3, 4] | [8, 7, 9, 5, 15, 6]
Adım 4: [2, 3, 4, 5] | [8, 7, 9, 15, 6]

Bu şekilde devam ederek sıralama işlemi tamamlanır.
