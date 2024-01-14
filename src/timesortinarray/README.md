## `main` Metodu:

- Programın başlangıç noktasıdır.
- Bir tamsayı dizisi oluşturulur ve başlangıç değerleri atanır.
- Dizi, sıralama öncesi ekrana yazdırılır.
- `timSort` metodu çağrılarak dizinin sıralanması gerçekleştirilir.
- Dizi, sıralama sonrası ekrana yazdırılır.

## `timSort` Metodu:

- TimSort algoritması kullanılarak bir tamsayı dizisini sıralar.
- `minRun` değişkenine, belirli bir eşik değeri (32) atanır. Bu değer, küçük dizilerde insertion sort kullanılmasını sağlar.
- Dizinin boyutu (`n`) alınır.
- Diziyi küçük parçalara bölmek ve her parçayı insertion sort ile sıralamak için bir döngü kullanılır.
- Sıralanmış parçalar birleştirilerek büyük parçalar oluşturulur (`merge` metodu).
- Bu işlem, parçalar belirli bir boyuta gelene kadar devam eder.

## `insertionSort` Metodu:

- Insertion sort algoritması kullanılarak belirli bir aralıktaki bir tamsayı dizisini sıralar.
- Dizinin belirli bir aralığı (`left` ve `right`) üzerinde işlem yapar.
- Diziyi sıralamak için bir iç içe döngü kullanılır. Her adımda, seçilen eleman uygun konumuna yerleştirilir.

## `merge` Metodu:

- İki alt diziyi birleştirir.
- `left`, `mid`, ve `right` indisleri kullanılarak dizinin belirli bir aralığı üzerinde işlem yapar.
- İki alt dizi birleştirilirken, her iki alt dizinin elemanları karşılaştırılır ve sıralı bir dizi elde edilene kadar birleştirme işlemi devam eder.

## `printArray` Metodu:

- Bir tamsayı dizisini ekrana yazdırmak için kullanılır.
- Dizinin her elemanı boşlukla ayrılarak ekrana yazdırılır.
