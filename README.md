# Tim Sort

Tim Sort, 2002 yılında Tim Peters tarafından geliştirilen bir sıralama algoritmasıdır. Bu algoritma, Merge Sort ve Insertion Sort algoritmalarının bir kombinasyonunu kullanır. TimSort, özellikle büyük veri setleri üzerinde iyi performans sergileyen ve pratikte kullanılan bir sıralama algoritmasıdır.

## Temel Özellikler

### Merge Sort ve Insertion Sort Kombinasyonu
- **Özelliği:** TimSort, birleştirme işlemi için Merge Sort'un özelliklerini kullanır ve küçük alt dizileri sıralamak için Insertion Sort'u tercih eder.

### Insertion Sort Kullanımı
- **Insertion Sort:** TimSort, küçük alt dizileri etkili bir şekilde sıralamak için Insertion Sort kullanır. Insertion Sort, küçük boyutlu diziler üzerinde oldukça hızlıdır.

### Run Kavramı
- **Run:** TimSort, dizi içindeki sıralı veya ters sıralı bölgeleri "run" olarak adlandırır. Algoritma, bu tür sıralı bölgeleri algılar ve birleştirme işlemi yaparken bunları korumaya çalışır.

### Adaptif Olma
- **Adaptif Olma:** TimSort, veri setinin doğasına uyum sağlamak için adaptif bir algoritmadır. Örneğin, eğer dizi neredeyse sıralı ise, Insertion Sort'a geçer ve bu durumda daha etkili olabilir.

### Bellek Kullanımı
- **Bellek Kullanımı:** TimSort, Merge Sort'un "out-of-place" (ekstra bellek kullanarak) birleştirme yaklaşımını kullanır, bu nedenle ekstra bellek kullanımı vardır ancak bu durum genellikle pratikte sorun teşkil etmez.

## Programlama Dillerinde Kullanım

- Java programlama dilinde, `Arrays.sort()` ve Python'da `sorted()` fonksiyonları genellikle TimSort'u kullanır.
- TimSort, pratikte genel kullanıma uygun, kararlı ve etkili bir sıralama algoritmasıdır.

# Proje İçeriği 

- [Tim Sort Example](https://github.com/muhammed-cetin/TimSortExample/tree/master/src/timsortexample)
- [Tim Sort In Array](https://github.com/muhammed-cetin/TimSortExample/tree/master/src/timsortinarray)
