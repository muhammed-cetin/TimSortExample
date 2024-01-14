## `sort` Metodu:

Bu metodun amacı, gelen diziyi TimSort algoritması kullanarak sıralamaktır. T tipindeki diziyi ve bir `Comparator` nesnesini parametre olarak alır. Bu, sıralama sırasında karşılaştırma işlemlerini belirlemek için kullanılır.

- **Parametreler**:
    - `arr`: Sıralanacak dizi.
    - `c`: Karşılaştırma işlemlerini belirlemek için kullanılan `Comparator`.

- **İşleyiş**:
    - Dizi boyutu `n`'dir. Eğer dizi 2 veya daha küçük bir boyuta sahipse, zaten sıralıdır ve işlem yapılmadan geri dönülür.
    - `minRun` değişkenine, belirlenen bir eşik değeri (`MIN_MERGE`) üzerinden hesaplanan bir değer atanır.
    - Dizi, bu `minRun` değeri kullanılarak küçük parçalara bölünür ve her parça insertion sort algoritması kullanılarak sıralanır.
    - Ardından, bu sıralı parçalar birleştirilerek büyük parçalar oluşturulur. Bu birleştirme işlemi `merge` metodu ile yapılır.
    - Bu işlem, parçalar belirli bir boyuta gelene kadar devam eder.

## `insertionSort` Metodu:

Insertion sort algoritması kullanılarak belirli bir aralıktaki bir diziyi sıralar.

- **Parametreler**:
    - `arr`: Sıralanacak dizi.
    - `left`: Sıralanacak alt dizi başlangıç indis.
    - `right`: Sıralanacak alt dizi bitiş indis.
    - `c`: Karşılaştırma işlemlerini belirlemek için kullanılan `Comparator`.

- **İşleyiş**:
    - Sol sınırdan başlayarak sağ sınıra kadar olan elemanları sıralar.
    - Her adımda, seçilen elemanı uygun konumuna yerleştirmek için karşılaştırmalar yapar.

## `merge` Metodu:

Diziyi iki alt diziye böler ve bu alt dizileri birleştirir.

- **Parametreler**:
    - `arr`: Birleştirilecek dizi.
    - `left`: Birleştirilecek alt dizilerin başlangıç indis.
    - `mid`: Birleştirilecek alt dizilerin orta indis.
    - `right`: Birleştirilecek alt dizilerin bitiş indis.
    - `c`: Karşılaştırma işlemlerini belirlemek için kullanılan `Comparator`.

- **İşleyiş**:
    - İki alt dizi birleştirilirken, her iki alt dizinin elemanları karşılaştırılır ve sıralı bir dizi elde edilene kadar birleştirme işlemi devam eder.

## `minRunLength` Metodu:

Bu metod, `MIN_MERGE` sabiti kullanılarak belirlenen bir eşik değeri üzerinden, belirli bir boyutun minimum çalıştırma uzunluğunu hesaplar. TimSort algoritması, belirli bir boyutun altındaki dizileri insertion sort ile sıralar.

- **Parametreler**:
    - `n`: Hesaplanacak boyut.

## `printArray` Metodu:

Diziyi ekrana yazdırmak için kullanılır. T tipindeki dizi elemanlarını sırayla ekrana yazdırır.

- **Parametre**:
    - `arr`: Yazdırılacak dizi.
